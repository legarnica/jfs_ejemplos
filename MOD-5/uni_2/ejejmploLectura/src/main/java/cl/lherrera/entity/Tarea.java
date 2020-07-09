package cl.lherrera.entity;

//import org.springframework.stereotype.Component;

//@Component("tarea")
public class Tarea {

    private String texto;
    private String nivel;
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Tarea [texto=" + texto + ", nivel=" + nivel + "]";
    }

}
