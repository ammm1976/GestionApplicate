package repositorio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beans.Curso;

public class RepositorioCursos {

		public static final String CURSOS = "SELECT * FROM cursos ORDER BY fecha_inicio DESC;";
		
		public List<Curso> Cursos() throws SQLException {
			List<Curso> listaCursos = null;

			Connection connection = Pool.getConnection();
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(CURSOS);
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
			Pool.liberarRecursos(connection, statement, rs);

			return listaCursos;
		}
		
	}
