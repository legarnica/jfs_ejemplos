
package cl.lherrera.dtos;

public class ComentarioDto {

    private String nombreUsuario;

    private String mensaje;

    private String fecha;

    public String getNombreUsuario() {

        return nombreUsuario;

    }

    public void setNombreUsuario(String nombreUsuario) {

        this.nombreUsuario = nombreUsuario;

    }

    public String getMensaje() {

        return mensaje;

    }

    public void setMensaje(String mensaje) {

        this.mensaje = mensaje;

    }

    public String getFecha() {

        return fecha;

    }

    public void setFecha(String fecha) {

        this.fecha = fecha;

    }

    @Override
    public String toString() {

        return "ComentarioDto [nombreUsuario=" + nombreUsuario + ", mensaje=" + mensaje + ", fecha=" + fecha + "]";

    }

}
