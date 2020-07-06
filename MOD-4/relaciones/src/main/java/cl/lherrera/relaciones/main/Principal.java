package cl.lherrera.relaciones.main;

import cl.lherrera.relaciones.dao.AlumnoCursoDAO;
import cl.lherrera.relaciones.dao.AlumnoDAO;
import cl.lherrera.relaciones.dao.CursoDAO;
import cl.lherrera.relaciones.modelo.Alumno;
import cl.lherrera.relaciones.modelo.AlumnoCurso;
import cl.lherrera.relaciones.modelo.Curso;


public class Principal {
	private static AlumnoDAO daoAlumno = new AlumnoDAO();
	private static CursoDAO daoCurso = new CursoDAO();
	private static AlumnoCursoDAO daoAlumnoCurso = new AlumnoCursoDAO();
	
	
	public static void main(String[] args) {
//		probarCursos();
		probarAlumnos();
//		probarMatricula(); // dejar la base en estado original antes de descomentar
//		probarAlumnos(); // después de matriculars

	}
	
	/**
	 * en el contexto de negocio, un alumno curso, es una
	 * matrIcula
	 */
	public static void probarMatricula() {
		// alumno en la base de datos con el id 1, debe existir
		Alumno alumno = daoAlumno.obtenerAlumnoPorId(1L);
		Curso curso = daoCurso.obtenerCursoPorId(4L);
		AlumnoCurso alumnoCurso = new AlumnoCurso(alumno, curso);
		
		daoAlumnoCurso.ingresaAlumnoCurso(alumnoCurso);
		
	}
	
	public static void probarCursos() {
		(daoCurso.obtenerCursoPorId(1L))
			.obtenerAlumnos()
			.forEach(alumno -> System.out.println(alumno) );
	}
	
	public static void probarAlumnos() {
		(daoAlumno.obtenerAlumnoPorId(1L))
		.obtenerCursos() // así lo llamamos directo!!
		.forEach(curso -> System.out.println(curso) );
	}
}
