package servicio;

import java.sql.SQLException;
import java.util.List;

import beans.Curso;
import repositorio.RepositorioCursos;

public class ServicioCursos {

	public List<Curso> recuperarListadoCursos() throws SQLException{
		List<Curso> listaCursos = null;
		RepositorioCursos repositorioCursos = null;
		repositorioCursos = new RepositorioCursos();
		listaCursos = repositorioCursos.Cursos();
		
		return listaCursos;
	}
	
}
