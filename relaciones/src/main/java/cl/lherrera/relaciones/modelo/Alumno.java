package cl.lherrera.relaciones.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import cl.lherrera.relaciones.dao.AlumnoCursoDAO;


public class Alumno implements Serializable{
	private static final long serialVersionUID = 5780648523799074104L;

	private Long id;
	private String nombre;
	
	public Alumno() {}
	
	public Alumno(Long id, String nombre) {
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
		return "Alumno [id=" + id + ", nombre=" + nombre + "]";
	}

	/**
	 * Enlace con los cursos 
	 */
	public List<Curso> obtenerCursos(){
		List<Curso> cursos = new ArrayList<>();
		if(this.id != null)
			cursos = (new AlumnoCursoDAO().obtenerCursosPorAlumno(this) );
		
		return cursos;
	}
	
}
