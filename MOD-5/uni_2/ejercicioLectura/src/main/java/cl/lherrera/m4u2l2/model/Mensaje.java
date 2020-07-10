package cl.lherrera.m4u2l2.model;

import org.springframework.stereotype.Component;

@Component("mensaje")
public class Mensaje {
	String remitente;
	String mensaje;

	public Mensaje() {
	}

	public Mensaje(String remitente, String mensaje) {
		this.remitente = remitente;
		this.mensaje = mensaje;
	}

	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
