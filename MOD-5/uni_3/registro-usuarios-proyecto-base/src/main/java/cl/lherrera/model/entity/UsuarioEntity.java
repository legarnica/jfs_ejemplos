/**
 * @author luisherrera
 * Clase entidad, que representa las columnas 
 * de la base dedatos.
 * 
 * Implementación completa
 *
 */
package cl.lherrera.model.entity;

public class UsuarioEntity {
    private Integer id;
    private String nombre;
    private String correo;
    private String contrasenia;

    public UsuarioEntity() {
    }

    public UsuarioEntity(Integer id, String nombre, String correo,
            String contrasenia) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

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

    @Override
    public String toString() {
        return "UsuarioEntity [id=" + id + ", nombre=" + nombre + ", correo="
                + correo + ", contrasenia=" + contrasenia + "]";
    }

}
