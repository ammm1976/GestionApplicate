function alumnos() {
    fetch ("Alumnos")
    .then(respuesta => {
		switch (respuesta.status) {
			case 200:
				return respuesta.json();
			case 400:
				alert("No se encontró el recurso");
                break;
			case 500:
            	alert("Error en el servidor");
				break;
		}
	})

    .then(listadoAlumnos => mostrarTablaAlumnos(listadoAlumnos));
}

function mostrarTablaAlumnos(listadoAlumnos) {
    listadoAlumnos.forEach(alumno => {
		let tabla = document.querySelector("table");
		let tr = document.createElement("tr");
		tabla.appendChild(tr);

        let id_alumno = document.createElement("td");
		id_alumno.innerHTML = alumno.id_alumno;
    	tr.appendChild(id_alumno);

		let nombre = document.createElement("td");
		nombre.innerHTML = alumno.nombre;
    	tr.appendChild(nombre);

		let apellidos = document.createElement("td");
		apellidos.innerHTML = alumno.apellidos;
    	tr.appendChild(apellidos);

		let telefono = document.createElement("td");
		telefono.innerHTML = alumno.telefono;
    	tr.appendChild(telefono);

		let dni = document.createElement("td");
		dni.innerHTML = alumno.dni;
    	tr.appendChild(dni);

		let direccion = document.createElement("td");
		direccion.innerHTML = alumno.direccion;
    	tr.appendChild(direccion);

		let fecha_nacimiento = document.createElement("td");
		fecha_nacimiento.innerHTML = alumno.fecha_nacimiento;
    	tr.appendChild(fecha_nacimiento);

		let acepta_condiciones = document.createElement("td");
		acepta_condiciones.innerHTML = alumno.acepta_condiciones;
    	tr.appendChild(acepta_condiciones);

		let tiene_correo = document.createElement("td");
		tiene_correo.innerHTML = alumno.tiene_correo;
    	tr.appendChild(tiene_correo);

		let email = document.createElement("td");
		email.innerHTML = alumno.email;
    	tr.appendChild(email);

		let genero = document.createElement("td");
		genero.innerHTML = alumno.genero;
    	tr.appendChild(genero);

		let nivel_estudios = document.createElement("td");
		nivel_estudios.innerHTML = alumno.nivel_estudios;
    	tr.appendChild(nivel_estudios);

		let situacion_laboral = document.createElement("td");
		situacion_laboral.innerHTML = alumno.situacion_laboral;
    	tr.appendChild(situacion_laboral);

		let como_nos_has_encontrado = document.createElement("td");
		como_nos_has_encontrado.innerHTML = alumno.como_nos_has_encontrado;
    	tr.appendChild(como_nos_has_encontrado);

		let municipio = document.createElement("td");
		municipio.innerHTML = alumno.municipio;
    	tr.appendChild(municipio);

		let pedania = document.createElement("td");
		pedania.innerHTML = alumno.pedania;
    	tr.appendChild(pedania);

		let codigo_postal = document.createElement("td");
		codigo_postal.innerHTML = alumno.codigo_postal;
    	tr.appendChild(codigo_postal);
    });
}