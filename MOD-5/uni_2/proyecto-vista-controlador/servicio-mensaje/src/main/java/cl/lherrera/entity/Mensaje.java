package cl.lherrera.entity;

public class Mensaje {

    private int id;

    private String remitente;
    private String mensaje;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Mensaje [id=" + id + ", remitente=" + remitente + ", mensaje="
                + mensaje + "]";
    }

}
