package cl.lherrera.relaciones.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import cl.lherrera.relaciones.dao.AlumnoCursoDAO;


public class Curso implements Serializable{

	private static final long serialVersionUID = 6037805339856868622L;
	
	private Long id;
	private String nombre;
	
	public Curso() {}
	
	public Curso(Long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", nombre=" + nombre + "]";
	}
	
	/**
	 * Enlace con los alumnos.
	 */
	public List<Alumno> obtenerAlumnos(){
		List<Alumno> alumnos = new ArrayList<>();
		if(this.id != null)
			alumnos = (new AlumnoCursoDAO().obtenerAlumnosPorCurso(this) );
		
		return alumnos;
	}
	
}
