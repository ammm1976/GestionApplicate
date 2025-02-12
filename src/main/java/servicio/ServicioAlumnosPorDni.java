package servicio;

import java.sql.SQLException;

import beans.Alumno;
import repositorio.RepositorioAlumnosPorDni;

public class ServicioAlumnosPorDni {

	public Alumno recuperarAlumnoPorDni(String dni) throws SQLException{
		Alumno alumno = null;
		RepositorioAlumnosPorDni repositorioAlumnosPorDni = null;
		repositorioAlumnosPorDni = new RepositorioAlumnosPorDni();
		alumno = repositorioAlumnosPorDni.AlumnoPorDni(dni);
		
		return alumno;
	}
	
}
