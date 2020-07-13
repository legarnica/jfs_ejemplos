/**
 * @author luisherrera
 * Clase mapeadora, de JDBC - Template
 * Implementación completa
 *
 */
package cl.lherrera.model.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

import cl.lherrera.model.entity.UsuarioEntity;

public class UsuarioMapper implements RowMapper<UsuarioEntity> {

    private static final Logger logger = LoggerFactory.getLogger(UsuarioMapper.class);

    /**
     * no colocar ni ifs ni whiles, esto lo mapea bien para ambos casos
     */
    @Override
    public UsuarioEntity mapRow(ResultSet resultSet, int i)
            throws SQLException {
        
        UsuarioEntity usuario = new UsuarioEntity();

        Integer id = resultSet.getInt("id");
        String nombre = resultSet.getString("nombre");
        String correo = resultSet.getString("correo");
        String clave = resultSet.getString("contrasenia");

        usuario.setId(id);
        usuario.setNombre(nombre);
        usuario.setCorreo(correo);
        usuario.setContrasenia(clave);

        logger.info("Se ejecuta el mapRow con usuario: " + usuario);

        return usuario;
    }

}
