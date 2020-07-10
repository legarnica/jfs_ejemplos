package cl.lherrera.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cl.lherrera.entity.Mensaje;

@SpringBootTest
public class MensajeServiceTest {
    
    private static Mensaje mensaje;

    @Autowired
    MensajeService servicio;
    
    @BeforeAll
    public static void prueba000() {
        mensaje = new Mensaje();
        mensaje.setId(1);
        mensaje.setMensaje("Mensaje");
        mensaje.setRemitente("Usuario prueba");
        
    }
    
    @Test
    @DisplayName(value = "prueba de ingreso de valores")
    public void prueba001() {
        servicio.agregar(mensaje);
        assertEquals(1, servicio.obtenerTodos().size());
    }
    
}
