package servicio;

import java.sql.SQLException;
import java.util.List;

import beans.Curso;
import repositorio.RepositorioCursosPorLocalizacion;

public class ServicioCursosPorLocalizacion {

	public List<Curso> recuperarListadoCursosPorLocalizacion(String localizacion) throws SQLException{
		List<Curso> listaCursos = null;
		RepositorioCursosPorLocalizacion repositorioCursosPorLocalizacion = null;
		repositorioCursosPorLocalizacion = new RepositorioCursosPorLocalizacion();
		listaCursos = repositorioCursosPorLocalizacion.CursosPorLocalizacion(localizacion);
		
		return listaCursos;
	}
	
}
