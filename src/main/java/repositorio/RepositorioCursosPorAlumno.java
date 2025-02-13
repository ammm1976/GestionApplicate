package repositorio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Curso;

public class RepositorioCursosPorAlumno {

		public static final String CURSOS_POR_ALUMNO = "SELECT cursos.* " + 
													   "FROM alumnos INNER JOIN inscripciones " + 
													   		 "ON alumnos.id_alumno = inscripciones.id_alumno " +
													   		 "INNER JOIN cursos ON inscripciones.id_curso = cursos.id_curso " +
													   "WHERE inscripciones.id_alumno = ?;";
		
		public List<Curso> CursosPorAlumno(String alumno) throws SQLException {
			List<Curso> listaCursos = null;

			Connection connection = Pool.getConnection();
			PreparedStatement pstatement = connection.prepareStatement(CURSOS_POR_ALUMNO);
			pstatement.setString(1, alumno);
			ResultSet rs = pstatement.executeQuery();
			listaCursos = new ArrayList<Curso>();
			
			while (rs.next()) {
				int id_curso = rs.getInt("id_curso");
				String itinerario = rs.getString("itinerario");
				String municipio = rs.getString("municipio");
				String codigo_postal = rs.getString("codigo_postal");
				String direccion = rs.getString("direccion");
				String formacion = rs.getString("formacion");
				String nivel_formacion = rs.getString("nivel_formacion");
				String turno = rs.getString("turno");
				Date fecha_inicio = rs.getDate("fecha_inicio");
				Date fecha_fin = rs.getDate("fecha_fin");
				int plazas_disponibles = rs.getInt("plazas_disponibles");
				
				Curso curso = new Curso(id_curso, itinerario, municipio, codigo_postal, direccion,
						formacion, nivel_formacion, turno, fecha_inicio, fecha_fin, plazas_disponibles);
				
				listaCursos.add(curso);
			}
			Pool.liberarRecursos(connection, pstatement, rs);

			return listaCursos;
		}
		
	}
