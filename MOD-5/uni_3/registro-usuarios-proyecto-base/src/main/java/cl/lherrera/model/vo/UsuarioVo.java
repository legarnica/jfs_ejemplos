/**
 * @author luisherrera
 * Objeto de vista, es el principal, contiene todo lo que necesita la vista
 * para representar la información.
 * 
 * Implementación completa
 *
 */
package cl.lherrera.model.vo;

import java.util.ArrayList;
import java.util.List;

import cl.lherrera.model.entity.UsuarioEntity;

public class UsuarioVo {
    private String fecha;
    private MensajeVo mensaje;
    private UsuarioEntity usuario;
    private List<UsuarioEntity> usuarios;

    public UsuarioVo() {
        usuario = new UsuarioEntity();
        usuarios = new ArrayList<>();
        mensaje = new MensajeVo();
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public MensajeVo getMensaje() {
        return mensaje;
    }

    public void setMensaje(MensajeVo mensaje) {
        this.mensaje = mensaje;
    }

    public UsuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }

    /**
     * Método con sobre carga, esto es para poder retornar un usuario
     * entidad, para los casos que llegue información de un 
     * formulario en el Modelattribute. 
     */
    public void setUsuario(RegistroVo usuario) {
        this.usuario = new UsuarioEntity(
            usuario.getId(), 
            usuario.getNombre(),
            usuario.getCorreo(), 
            usuario.getContrasenia()
       );
    }

    public List<UsuarioEntity> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<UsuarioEntity> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "UsuarioVo [fecha=" + fecha + ", mensaje=" + mensaje
                + ", usuario=" + usuario + ", usuarios=" + usuarios + "]";
    }

}
