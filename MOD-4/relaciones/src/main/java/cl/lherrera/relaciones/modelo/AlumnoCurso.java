package cl.lherrera.relaciones.modelo;

import java.io.Serializable;

public class AlumnoCurso implements Serializable{

	private static final long serialVersionUID = -1060964033872602317L;

	private Alumno alumno;
	private Curso curso;
	
	public AlumnoCurso() {}

	public AlumnoCurso(Alumno alumno, Curso curso) {
		this.alumno = alumno;
		this.curso = curso;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
