function cursosPorAlumno() {
	let alumno = document.getElementById("alumno").value;
	let url = "CursosPorAlumno?alumno=" + alumno;

	fetch(url)
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

    .then(listadoCursos => mostrarTablaCursos(listadoCursos));
}

function mostrarTablaCursos(listadoCursos) {
	let tbody = document.querySelector("tbody");
	tbody.innerHTML = "";

    listadoCursos.forEach(curso => {
		let tr = document.createElement("tr");
		tbody.appendChild(tr);

		let id_curso = document.createElement("td");
		id_curso.innerHTML = curso.id_curso;
    	tr.appendChild(id_curso);

        let itinerario = document.createElement("td");
		itinerario.innerHTML = curso.itinerario;
    	tr.appendChild(itinerario);

		let municipio = document.createElement("td");
		municipio.innerHTML = curso.municipio;
    	tr.appendChild(municipio);

		let codigo_postal = document.createElement("td");
		codigo_postal.innerHTML = curso.codigo_postal;
    	tr.appendChild(codigo_postal);

		let direccion = document.createElement("td");
		direccion.innerHTML = curso.direccion;
    	tr.appendChild(direccion);

		let formacion = document.createElement("td");
		formacion.innerHTML = curso.formacion;
    	tr.appendChild(formacion);

		let nivel_formacion = document.createElement("td");
		nivel_formacion.innerHTML = curso.nivel_formacion;
    	tr.appendChild(nivel_formacion);

		let turno = document.createElement("td");
		turno.innerHTML = curso.turno;
    	tr.appendChild(turno);

		let fecha_inicio = document.createElement("td");
		fecha_inicio.innerHTML = curso.fecha_inicio;
    	tr.appendChild(fecha_inicio);

		let fecha_fin = document.createElement("td");
		fecha_fin.innerHTML = curso.fecha_fin;
    	tr.appendChild(fecha_fin);

		let plazas_disponibles = document.createElement("td");
		plazas_disponibles.innerHTML = curso.plazas_disponibles;
    	tr.appendChild(plazas_disponibles);
    });
}