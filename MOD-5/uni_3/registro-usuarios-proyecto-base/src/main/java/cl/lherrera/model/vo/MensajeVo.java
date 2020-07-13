/**
 * @author luisherrera
 * Representa un objeto de vista, almacenará el detalle de 
 * los mensajes que se muestran en pantalla
 * 
 * Implementación completa
 *
 */
package cl.lherrera.model.vo;

public class MensajeVo {
    public static String CORRECTO = "success";
    public static String INCORRECTO = "warning";
    
    private String titulo;
    private String claseCss;
    private String texto;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getClaseCss() {
        return claseCss;
    }

    public void setClaseCss(String claseCss) {
        this.claseCss = claseCss;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "MensajeVo [titulo=" + titulo + ", claseCss=" + claseCss
                + ", texto=" + texto + "]";
    }
    

}
