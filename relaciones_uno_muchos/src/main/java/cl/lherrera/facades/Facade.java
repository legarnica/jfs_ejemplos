
package cl.lherrera.facades;

import java.util.ArrayList;
import java.util.List;

import cl.lherrera.daos.ComentarioDAO;
import cl.lherrera.daos.UsuarioDAO;
import cl.lherrera.dtos.ComentarioDto;
import cl.lherrera.entidades.Comentario;
import cl.lherrera.entidades.Usuario;

public class Facade {

    public Usuario obtenerUsuarioPorIdentificador(int id) {

        UsuarioDAO daoUsuario = new UsuarioDAO();
        return daoUsuario.obtenerPorId(id);

    }

    public List<ComentarioDto> obtenerPosteos(Usuario usuario) {

        List<ComentarioDto> dtoComentarios = new ArrayList<>();

        ComentarioDAO daoComentarios = new ComentarioDAO();
        List<Comentario> comentarios = daoComentarios.obtenerComentarios();

        for (Comentario comentario : comentarios) {

            ComentarioDto comentarioDto = new ComentarioDto();
            comentarioDto.setNombreUsuario(usuario.getNombre());
            comentarioDto.setMensaje(comentario.getFecha());
            comentarioDto.setFecha(comentario.getFecha());

            dtoComentarios.add(comentarioDto);

        }

        return dtoComentarios;

    }

}
