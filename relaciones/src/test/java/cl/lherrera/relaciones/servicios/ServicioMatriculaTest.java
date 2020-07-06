package cl.lherrera.relaciones.servicios;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.beans.Transient;
import java.util.List;
import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cl.lherrera.relaciones.dao.AlumnoDAO;
import cl.lherrera.relaciones.dao.CursoDAO;
import cl.lherrera.relaciones.modelo.Alumno;
import cl.lherrera.relaciones.modelo.AlumnoCurso;
import cl.lherrera.relaciones.modelo.Curso;


@DisplayName("Pruebas del servicios")
public class ServicioMatriculaTest {
	Logger logger = Logger.getLogger(ServicioMatriculaTest.class.getName());
	
	private static Alumno alumno;
	private static Curso curso;
	private static AlumnoCurso alumnoCurso;
	
	private static ServicioMatricula servicio;
	
	@BeforeAll
    static void initAll() {
		alumno = (new AlumnoDAO()).obtenerAlumnoPorId(1L);
		curso = (new CursoDAO()).obtenerCursoPorId(1L);
		alumnoCurso = new AlumnoCurso(alumno, curso);
		
		servicio = new ServicioMatricula();
    }
	
	@BeforeEach
	void antesDeCada() {
		logger.warning("Nuevo test__________________________________-");
	}

	@Test
	@DisplayName("si el curso 1 tiene al menos un alumno")
	void alumnos_por_curso() {
		// obtengo los alumnos por curso
		List<Alumno> alumnos = servicio.obtenerAlumnosPorCurso(curso);
		// los listo
		alumnos.forEach(alumno -> logger.info(alumno.toString() ) );
		// compruebo que al menos tenga uno, así debe estar en la base
		
		assertTrue(alumnos.size() > 0);
	}

	@Test
	@DisplayName("si el alumno 1 tiene al menos un curso")
	void cursos_por_alumno() {
		// obtengo los alumnos por curso
		List<Curso> cursos = servicio.obtenerCursosPorAlumno(alumno);
		// los listo
		cursos.forEach(curso -> logger.info(curso.toString() ) );
		// compruebo que al menos tenga uno, así debe estar en la base
		
		assertTrue(cursos.size() > 0);
	}

	@Test
	@DisplayName("Probar si matricula")
	void hacerMatricula() {
		Curso cursoApresto = (new CursoDAO()).obtenerCursoPorId(4L);
		AlumnoCurso datosMatricula = new AlumnoCurso(alumno, cursoApresto);
		
		assert(servicio.hacerMatricula(datosMatricula));
	}
}
