package servicio;

import java.sql.SQLException;
import java.util.List;

import beans.Alumno;
import repositorio.RepositorioAlumnos;

public class ServicioAlumnos {

	public List<Alumno> recuperarListadoAlumnos() throws SQLException{
		List<Alumno> listaAlumnos = null;
		RepositorioAlumnos repositorioAlumnos = null;
		repositorioAlumnos = new RepositorioAlumnos();
		listaAlumnos = repositorioAlumnos.Alumnos();
		
		return listaAlumnos;
	}
	
}
