SELECT cursos.* 
FROM alumnos INNER JOIN inscripciones ON alumnos.id_alumno = inscripciones.id_alumno
			 INNER JOIN cursos ON inscripciones.id_curso = cursos.id_curso
WHERE inscripciones.id_alumno = 2;