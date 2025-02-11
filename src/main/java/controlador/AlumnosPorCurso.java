package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import servicio.ServicioAlumnosPorCurso;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import beans.Alumno;

/**
 * Servlet implementation class AlumnosPorCurso
 */
public class AlumnosPorCurso extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger("mylog");   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlumnosPorCurso() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		log.debug("Peticion GET en el servlet");
		ServicioAlumnosPorCurso servicioAlumnosPorCurso = new ServicioAlumnosPorCurso();
		int curso = Integer.parseInt(request.getParameter("curso"));
		
		try {
			List<Alumno> alumnosPorCurso = servicioAlumnosPorCurso.recuperarListadoAlumnosPorCurso(curso);
			Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
			String listaJsonAlumnosPorCurso = gson.toJson(alumnosPorCurso);
			response.getWriter().write(listaJsonAlumnosPorCurso);
			response.setStatus(200);
			response.setContentType("application/json");
			log.debug("La peticion fue bien " + listaJsonAlumnosPorCurso);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error("Ha fallado la base de datos",e);
		}catch (Exception e) {
			e.printStackTrace();
			log.error("la aplicacion ha fallado", e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
