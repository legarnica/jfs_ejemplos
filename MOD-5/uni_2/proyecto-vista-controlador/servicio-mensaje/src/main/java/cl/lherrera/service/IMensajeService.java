package cl.lherrera.service;

import java.util.List;

import cl.lherrera.entity.Mensaje;

public interface IMensajeService {

    public abstract List<Mensaje> obtenerTodos();
    
    public abstract void agregar(Mensaje mensaje);
    
    public abstract void eliminar(int id);

}
