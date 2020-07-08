package cl.lherrera.app;

import org.springframework.beans.factory.annotation.Value;

public class Persona {

	@Value("Hugo Tapia")
	private String nombre;
	@Value("29")
	private int edad;

	public Persona() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
