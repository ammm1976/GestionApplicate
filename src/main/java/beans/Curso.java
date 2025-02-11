package beans;

import java.sql.Date;

public class Curso {
	private int id_curso;
	private String itinerario;
	private String municipio;
	private String codigo_postal;
	private String direccion;
	private String formacion;
	private String nivel_formacion;
	private String turno;
	private Date fecha_inicio;
	private Date fecha_fin;
	private int plazas_disponibles;
	
	
	public Curso(int id_curso, String itinerario, String municipio, String codigo_postal, String direccion,
			String formacion, String nivel_formacion, String turno, Date fecha_inicio, Date fecha_fin, int plazas_disponibles) {
		super();
		this.id_curso = id_curso;
		this.itinerario = itinerario;
		this.municipio = municipio;
		this.codigo_postal = codigo_postal;
		this.direccion = direccion;
		this.formacion = formacion;
		this.nivel_formacion = nivel_formacion;
		this.turno = turno;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.plazas_disponibles = plazas_disponibles;
	}


	public int getId_curso() {
		return id_curso;
	}

	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}

	public String getItinerario() {
		return itinerario;
	}

	public void setItinerario(String itinerario) {
		this.itinerario = itinerario;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFormacion() {
		return formacion;
	}

	public void setFormacion(String formacion) {
		this.formacion = formacion;
	}

	public String getNivel_formacion() {
		return nivel_formacion;
	}

	public void setNivel_formacion(String nivel_formacion) {
		this.nivel_formacion = nivel_formacion;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public int getPlazas_disponibles() {
		return plazas_disponibles;
	}

	public void setPlazas_disponibles(int plazas_disponibles) {
		this.plazas_disponibles = plazas_disponibles;
	}
}

