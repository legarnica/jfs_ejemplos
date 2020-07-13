/**
 * @author luisherrera
 * interfaz con el contrato para los
 * repositorios
 *
 */
package cl.lherrera.model.dao;

import java.util.List;

import cl.lherrera.model.entity.UsuarioEntity;

public interface IUsuarioDao {
    List<UsuarioEntity> getAllUsuarios();
    UsuarioEntity findByCorreoAndContrasenia(String correo, String contrasenia);
    UsuarioEntity findById(int id);
    int delete(UsuarioEntity usuario);
    int update(UsuarioEntity usuario);
    int add(UsuarioEntity usuario);

}
