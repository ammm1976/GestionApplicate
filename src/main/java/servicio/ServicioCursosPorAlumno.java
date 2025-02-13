package servicio;

import java.sql.SQLException;
import java.util.List;

import beans.Curso;
import repositorio.RepositorioCursosPorAlumno;

public class ServicioCursosPorAlumno{

	public List<Curso> recuperarListadoCursosPorAlumno(String alumno) throws SQLException{
		List<Curso> listaCursos = null;
		RepositorioCursosPorAlumno repositorioCursosPorAlumno = null;
		repositorioCursosPorAlumno = new RepositorioCursosPorAlumno();
		listaCursos = repositorioCursosPorAlumno.CursosPorAlumno(alumno);
		
		return listaCursos;
	}
	
}
