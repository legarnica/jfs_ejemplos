package cl.lherrera.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cl.lherrera.entity.Mensaje;

@Service
public class MensajeService implements IMensajeService{
    List<Mensaje> mensajes;
    
    public MensajeService() {
        mensajes = new ArrayList<>();
    }

    @Override
    public List<Mensaje> obtenerTodos() {

        return mensajes;
    }

    @Override
    public void agregar(Mensaje mensaje) {
        if(mensaje != null) {
            int id = mensajes.size();
            mensaje.setId(id);
            mensajes.add(mensaje);
        }
        
    }
    
    @Override
    public void eliminar(int id) {
        mensajes.remove(id);
        for(int i = 0; i < mensajes.size(); i ++)
            mensajes.get(i).setId(i);

    }
    
    
}
