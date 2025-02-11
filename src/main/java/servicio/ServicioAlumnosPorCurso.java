package servicio;

import java.sql.SQLException;
import java.util.List;

import beans.Alumno;
import repositorio.RepositorioAlumnosPorCurso;

public class ServicioAlumnosPorCurso {

	public List<Alumno> recuperarListadoAlumnosPorCurso(int curso) throws SQLException{
		List<Alumno> listaAlumnos = null;
		RepositorioAlumnosPorCurso repositorioAlumnosPorCurso = null;
		repositorioAlumnosPorCurso = new RepositorioAlumnosPorCurso();
		listaAlumnos = repositorioAlumnosPorCurso.AlumnosPorCurso(curso);
		
		return listaAlumnos;
	}
	
}
