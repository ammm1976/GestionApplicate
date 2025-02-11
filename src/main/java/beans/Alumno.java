package beans;

import java.sql.Date;

public class Alumno {
	private int id_alumno;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String dni;
	private String direccion;
	private Date fecha_nacimiento;
	private String acepta_condiciones;
	private String tiene_correo;
	private String email;
	private String genero;
	private String nivel_estudios;
	private String situacion_laboral;
	private String como_nos_has_encontrado;
	private String municipio;
	private String pedania;
	private String codigo_postal;
	
	
	public Alumno(int id_alumno, String nombre, String apellidos, String telefono, String dni, String direccion,
			Date fecha_nacimiento, String acepta_condiciones, String tiene_correo, String email, String genero,
			String nivel_estudios, String situacion_laboral, String como_nos_has_encontrado, String municipio,
			String pedania, String codigo_postal) {
		super();
		this.id_alumno = id_alumno;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.dni = dni;
		this.direccion = direccion;
		this.fecha_nacimiento = fecha_nacimiento;
		this.acepta_condiciones = acepta_condiciones;
		this.tiene_correo = tiene_correo;
		this.email = email;
		this.genero = genero;
		this.nivel_estudios = nivel_estudios;
		this.situacion_laboral = situacion_laboral;
		this.como_nos_has_encontrado = como_nos_has_encontrado;
		this.municipio = municipio;
		this.pedania = pedania;
		this.codigo_postal = codigo_postal;
	}


	public int getId_alumno() {
		return id_alumno;
	}

	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getAcepta_condiciones() {
		return acepta_condiciones;
	}

	public void setAcepta_condiciones(String acepta_condiciones) {
		this.acepta_condiciones = acepta_condiciones;
	}

	public String getTiene_correo() {
		return tiene_correo;
	}

	public void setTiene_correo(String tiene_correo) {
		this.tiene_correo = tiene_correo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNivel_estudios() {
		return nivel_estudios;
	}

	public void setNivel_estudios(String nivel_estudios) {
		this.nivel_estudios = nivel_estudios;
	}

	public String getSituacion_laboral() {
		return situacion_laboral;
	}

	public void setSituacion_laboral(String situacion_laboral) {
		this.situacion_laboral = situacion_laboral;
	}

	public String getComo_nos_has_encontrado() {
		return como_nos_has_encontrado;
	}

	public void setComo_nos_has_encontrado(String como_nos_has_encontrado) {
		this.como_nos_has_encontrado = como_nos_has_encontrado;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getPedania() {
		return pedania;
	}

	public void setPedania(String pedania) {
		this.pedania = pedania;
	}

	public String getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}
}

