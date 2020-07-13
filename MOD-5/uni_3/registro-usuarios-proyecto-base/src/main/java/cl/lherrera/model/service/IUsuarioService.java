/**
 * @author luisherrera
 * Interfaz con los métodos que componen los servicios
 * que se solicitan como lógica de negocio
 *
 */
package cl.lherrera.model.service;


import cl.lherrera.model.vo.UsuarioVo;

public interface IUsuarioService {

    UsuarioVo obtenerUsuarios();
    int registrarUsuario(UsuarioVo usuario);
    UsuarioVo eliminarUsuario(Integer id);
    UsuarioVo actualizarUsuario(UsuarioVo vo);
    UsuarioVo ingresoAlSistema(String nomUsuario, String contrasenia);
    UsuarioVo defaultVo(UsuarioVo vo);
    UsuarioVo obtenerPorId(Integer id);

}
