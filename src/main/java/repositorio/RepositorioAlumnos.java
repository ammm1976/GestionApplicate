package repositorio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beans.Alumno;

public class RepositorioAlumnos {

		public static final String ALUMNOS = "SELECT * FROM alumnos;";
		
		public List<Alumno> Alumnos() throws SQLException {
			List<Alumno> listaAlumnos = null;

			Connection connection = Pool.getConnection();
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(ALUMNOS);
			listaAlumnos = new ArrayList<Alumno>();
			while (rs.next()) {
				int id_alumno = rs.getInt("id_alumno");
				String nombre = rs.getString("nombre");
				String apellidos = rs.getString("apellidos");
				String telefono = rs.getString("telefono");
				String dni = rs.getString("dni");
				String direccion = rs.getString("direccion");
				Date fecha_nacimiento = rs.getDate("fecha_nacimiento");
				String acepta_condiciones = rs.getString("acepta_condiciones");
				String tiene_correo = rs.getString("tiene_correo");
				String email = rs.getString("email");
				String genero = rs.getString("genero");
				String nivel_estudios = rs.getString("nivel_estudios");
				String situacion_laboral = rs.getString("situacion_laboral");
				String como_nos_has_encontrado = rs.getString("como_nos_has_encontrado");
				String municipio = rs.getString("municipio");
				String pedania = rs.getString("pedania");
				String codigo_postal = rs.getString("codigo_postal");
				
				Alumno alumno = new Alumno (id_alumno, nombre, apellidos, telefono, dni, direccion,
						fecha_nacimiento, acepta_condiciones, tiene_correo, email, genero,
						nivel_estudios, situacion_laboral, como_nos_has_encontrado, municipio,
						pedania, codigo_postal);
				
				listaAlumnos.add(alumno);
			}
			Pool.liberarRecursos(connection, statement, rs);

			return listaAlumnos;
		}
		
	}
