/**
 * @author luisherrera
 * IMPLEMENTAR: Data Access Object (DAO)
 *
 */
package cl.lherrera.model.service;

import org.springframework.stereotype.Service;

import cl.lherrera.model.vo.UsuarioVo;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
    
    // inyectamos el dao

    @Override
    public UsuarioVo obtenerUsuarios() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int registrarUsuario(UsuarioVo usuario) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public UsuarioVo eliminarUsuario(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UsuarioVo actualizarUsuario(UsuarioVo vo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UsuarioVo ingresoAlSistema(String nomUsuario, String contrasenia) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UsuarioVo defaultVo(UsuarioVo vo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UsuarioVo obtenerPorId(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

}
