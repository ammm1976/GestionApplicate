package repositorio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.Alumno;

public class RepositorioAlumnosPorDni {

		public static final String ALUMNOS_POR_DNI = "SELECT alumnos.* FROM alumnos WHERE dni = ?;";
		
		public Alumno AlumnoPorDni(String dni) throws SQLException {
			Alumno alumno = null;
			Connection connection = Pool.getConnection();
			PreparedStatement pstatement = connection.prepareStatement(ALUMNOS_POR_DNI);
			pstatement.setString(1, dni);
			ResultSet rs = pstatement.executeQuery();

			if (rs.next()) {
				int id_alumno = rs.getInt("id_alumno");
				String nombre = rs.getString("nombre");
				String apellidos = rs.getString("apellidos");
				String telefono = rs.getString("telefono");
				String dniJava = rs.getString("dni");
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
				
				alumno = new Alumno (id_alumno, nombre, apellidos, telefono, dniJava, direccion,
						fecha_nacimiento, acepta_condiciones, tiene_correo, email, genero,
						nivel_estudios, situacion_laboral, como_nos_has_encontrado, municipio,
						pedania, codigo_postal);
			}
			
			Pool.liberarRecursos(connection, pstatement, rs);
			return alumno;
		}
		
	}
