/**
 * @author luisherrera
 * Representa un objeto de vista, almacenará lo que venga del formulario
 * no se puede almacenar la información de las dos contraseñas en
 * la entidad, así aprovechamos las funcionalidades de
 * modelAttribute.
 * 
 * Implementación completa
 *
 */
package cl.lherrera.model.vo;

public class RegistroVo {
    private Integer id;
    private String nombre;
    private String correo;
    private String contrasenia;

    private String contrasenia_;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getContrasenia_() {
        return contrasenia_;
    }

    public void setContrasenia_(String contrasenia_) {
        this.contrasenia_ = contrasenia_;
    }

    @Override
    public String toString() {
        return "RegistroVo [id=" + id + ", nombre=" + nombre + ", correo="
                + correo + ", contrasenia=" + contrasenia + ", contrasenia_="
                + contrasenia_ + "]";
    }

}
