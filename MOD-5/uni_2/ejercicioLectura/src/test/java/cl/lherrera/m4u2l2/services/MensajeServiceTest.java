package cl.lherrera.m4u2l2.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cl.lherrera.m4u2l2.model.Mensaje;

@SpringBootTest
class MensajeServiceTest {
	
	@Autowired
	MensajeServiceImpl servicio;

	@Test
	@DisplayName("Probamos listar los mensajes")
	void prueba001() {
		// creamos una lista vacía
		List<Mensaje> lista = new ArrayList<>();
		// ocupamos el servicio que no ha sido cargado con mensajes
		List<Mensaje> listaMesaje = servicio.getDataMessageList();
		// debe ser igual a una lista vacía
		assertEquals(lista, listaMesaje);
	}
	
	@Test
	@DisplayName("Probar si se guarda un mensaje")
	void prueba002() {
		// creamos un mensaje
		Mensaje mensaje = new Mensaje("Ana", "Envía saludos");
		// lo agregamos usando el servicio
		servicio.saveDataMessage(mensaje);
		// traemos los mensajes
		List<Mensaje> listaMesaje = servicio.getDataMessageList();
		// esta lista debe contener al menos un mensaje
		assertEquals(1, listaMesaje.size());
	}

}
