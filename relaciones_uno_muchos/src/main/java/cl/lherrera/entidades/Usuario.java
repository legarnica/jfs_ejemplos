package cl.lherrera.entidades;

import java.io.Serializable;
import java.util.List;

public class Usuario implements Serializable {
	private static final long serialVersionUID = 7144849864372688110L;

	private int id;
	private String nombre;
	private List<Comentario> comentarios;

	public Usuario(int id, String nombre, List<Comentario> comentarios) {
		this.id = id;
		this.nombre = nombre;
		this.comentarios = comentarios;
	}

	public Usuario() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

}
