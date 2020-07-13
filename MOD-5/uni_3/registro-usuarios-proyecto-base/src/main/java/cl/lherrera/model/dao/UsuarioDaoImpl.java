package cl.lherrera.model.dao;

import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cl.lherrera.model.entity.UsuarioEntity;

// muy importante esta anotación (estereotipo Capa acceso a datos)
@Repository
public class UsuarioDaoImpl implements IUsuarioDao {
    
    private static final Logger logger = LoggerFactory.getLogger(UsuarioDaoImpl.class);

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public UsuarioDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    /**
     * 
     * IMPLEMENTAR:
     */
    @Override
    public List<UsuarioEntity> getAllUsuarios() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * 
     * IMPLEMENTAR:
     */
    @Override
    public UsuarioEntity findByCorreoAndContrasenia(String correo,
        String contrasenia) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * 
     * IMPLEMENTAR:
     */
    @Override
    public UsuarioEntity findById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * 
     * IMPLEMENTAR:
     */
    @Override
    public int delete(UsuarioEntity usuario) {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * 
     * IMPLEMENTAR:
     */
    @Override
    public int update(UsuarioEntity usuario) {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * 
     * IMPLEMENTAR:
     */
    @Override
    public int add(UsuarioEntity usuario) {
        // TODO Auto-generated method stub
        return 0;
    }

    

}
