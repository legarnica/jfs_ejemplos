package cl.lherrera.model.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Locale;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.javafaker.Faker;

import cl.lherrera.model.entity.UsuarioEntity;
import cl.lherrera.model.vo.UsuarioVo;
@SpringBootTest
public class UsuarioServiceTest {

    private static UsuarioEntity usuario;
    private static UsuarioVo usuarioVo;
    
    @Autowired
    private IUsuarioService servicio;
    
    private static final Faker faker = new Faker(new Locale("es-ES"));
    
    @BeforeAll
    static void fixture() {
        usuario = new UsuarioEntity();
        usuario.setNombre(faker.name().name());
        usuario.setCorreo(faker.internet().emailAddress());
        usuario.setContrasenia(faker.internet().password());
        usuarioVo = new UsuarioVo();
        usuarioVo.setUsuario(usuario);
        
    }

    @Test
    @DisplayName("Prueba de registro de un usuario en el sistema")
    public void pruebaDeRegistro() {
        // TODO
        assertTrue(true);
    }
    
    @Test
    @DisplayName("Prueba si obtenemos un usuario por su id")
    public void pruebaDeTraerUsuarioPorId() {
        // TODO
        assertTrue(true);
    }
    
    @Test
    @DisplayName("Prueba si podemos actualizar el usuario por su ID")
    public void pruebaActualizarUsuarioPorId() {
        assertTrue(true);
    }
    
    @Test
    @DisplayName("Prueba si podemos ingresar al sistema")
    public void pruebaDeIngresoAlSistema() {
        // TODO
        assertTrue(true);
    }
    
    @Test
    @DisplayName("Prueba si podemos setear un visual object por defecto, para la lista de usuarios")
    public void pruebaDeLlenadoVo() {
        // TODO
        assertTrue(true);
    }
    
    @Test
    @DisplayName("Prueba si se listan los usuarios del sistemas")
    public void pruebaListarUsuarios() {
        assertTrue(true);
    }

    @Test
    @DisplayName("Prueba si podemos eliminar el usuario por su ID")
    public void pruebaEliminarUsuarioPorId() {
        assertTrue(true);
    }
    
}
