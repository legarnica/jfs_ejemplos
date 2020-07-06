package cl.lherrera.entidades;

import java.io.Serializable;
import java.util.Date;

public class Comentario implements Serializable {
	private static final long serialVersionUID = 152095113347974183L;
	
	private int id;
	private String fecha;
	private String texto;
	private Usuario usuario;

	public Comentario() {}

	public Comentario(int id, String fecha, String texto, Usuario usuario) {
		this.id = id;
		this.fecha = fecha;
		this.texto = texto;
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
