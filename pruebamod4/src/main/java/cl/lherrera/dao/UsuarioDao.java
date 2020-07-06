
package cl.lherrera.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import cl.lherrera.entidad.Usuario;

public class UsuarioDao {

    private static final ManejaConexion manejaConexion = ManejaConexion.obtenerManejo();

    private static final Logger LOG = Logger.getLogger(UsuarioDao.class.getName());

    public int eliminar(int id) {

        int filasAfectadas = 0;

        String consulta = "delete from usuario where id = ?";

        try (
            Connection conexion = manejaConexion.obtenerConexion();
            PreparedStatement ps = conexion.prepareStatement(consulta);) {

            ps.setInt(1, id);
            // ejecuta consulta
            filasAfectadas = ps.executeUpdate();
            if (filasAfectadas != 1)
                throw new SQLException("No se eliminó ningún registro");

        } catch (SQLException e) {

            LOG.warning("Consulta:" + consulta);
            LOG.severe("Error delete: " + e.getMessage());

        }

        return filasAfectadas;

    }

    /**
     * método encargado de buscar una persona por su ID
     */
    public Usuario buscarPorId(int id) {

        Usuario usuario = new Usuario();
        String consulta = ""
            + " SELECT "
            + "    id,"
            + "    nombre, "
            + "    apellido, "
            + "    username, "
            + "    password, "
            + "    anio_nac "
            + " FROM   usuario "
            + " WHERE  id = " + id;

        try (
            Connection conexion = manejaConexion.obtenerConexion();
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();) {

            if (rs.next()) {

                usuario.setId(rs.getInt("id"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setUsername(rs.getString("username"));
                usuario.setPassword(rs.getString("password"));
                usuario.setAnioNac(rs.getInt("anio_nac"));

            } else {

                throw new SQLException("No se encuentra el registro en la base de datos");

            }

        } catch (SQLException e) {

            LOG.warning("Consulta: " + consulta);
            LOG.severe("Error update: " + e.getMessage());

        }

        return usuario;

    }

    /**
     * método encargado de buscar una persona por su userName
     */
    public Usuario buscarPorUsername(String username) throws SQLException{
        
        Usuario usuario = new Usuario();
        String consulta = ""
            + " SELECT "
            + "    id,"
            + "    nombre, "
            + "    apellido, "
            + "    username, "
            + "    password, "
            + "    anio_nac "
            + " FROM   usuario "
            + " WHERE  username = '" + username + "'";
        
        try (
            Connection conexion = manejaConexion.obtenerConexion();
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();) {
            
            if (rs.next()) {
                
                usuario.setId(rs.getInt("id"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setUsername(rs.getString("username"));
                usuario.setPassword(rs.getString("password"));
                usuario.setAnioNac(rs.getInt("anio_nac"));
                
            } else {
                
                throw new SQLException("No se encuentra el registro en la base de datos");
                
            }
            
        } catch (SQLException e) {
            
            LOG.warning("Consulta: " + consulta);
            throw new SQLException(e.getMessage());
            
        }
        
        return usuario;
        
    }

    /**
     * Método encargado de actualizar la información
     */
    public int actualizar(int id, Usuario usuario) {
        
        System.out.println("usuario" + usuario);

        int filasAfectadas = 0;
        String consulta = ""
            + " update usuario "
            + "  set nombre = ?, "
            + "  apellido = ?, "
            + "  username = ?, "
            + "  password = ?, "
            + "  anio_nac = ? "
            + " where id = ?";

        try (
            Connection conexion = manejaConexion.obtenerConexion();
            PreparedStatement ps = conexion.prepareStatement(consulta);) {

            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setString(3, usuario.getUsername());
            ps.setString(4, usuario.getPassword());
            ps.setInt(5, usuario.getAnioNac());
            ps.setInt(6, id);

            filasAfectadas = ps.executeUpdate();

            if (filasAfectadas != 1) {

                throw new SQLException("Error al actualizar registro");

            }

        } catch (SQLException e) {

            LOG.warning("Consulta: " + consulta);
            LOG.severe("Error update: " + e.getMessage());

        }

        return filasAfectadas;

    }

    /**
     * método encargado de almacenar una persona en la base de datos.
     */
    public int ingresar(Usuario usuario) {

        int filasAfectadas = 0;
        String consulta = ""
            + " insert into usuario "
            + "("
            + "  nombre, "
            + "  apellido, "
            + "  username, "
            + "  password, "
            + "  anio_nac "
            + ") values (?, ?, ?, ?, ?)";

        try (
            Connection conexion = manejaConexion.obtenerConexion();
            PreparedStatement ps = conexion.prepareStatement(consulta);) {

            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setString(3, usuario.getUsername());
            ps.setString(4, usuario.getPassword());
            ps.setInt(5, usuario.getAnioNac());

            filasAfectadas = ps.executeUpdate();

            if (filasAfectadas != 1) {

                throw new SQLException("Error al insertar registro");

            }

        } catch (SQLException e) {

            LOG.warning("Consulta:  " + consulta);
            LOG.severe("Error ingreso: " + e.getMessage());

        }

        return filasAfectadas;

    }

    /**
     * Selecciona todas las personas
     */
    public List<Usuario> obtenerTodos() {

        List<Usuario> usuarios = new ArrayList<>();

        String consulta = ""
            + " SELECT "
            + "    id,"
            + "    nombre, "
            + "    apellido, "
            + "    username, "
            + "    password, "
            + "    anio_nac "
            + " FROM usuario";

        try (
            Connection conexion = manejaConexion.obtenerConexion();
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();) {

            while (rs.next()) {

                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setUsername(rs.getString("username"));
                usuario.setPassword(rs.getString("password"));
                usuario.setAnioNac(rs.getInt("anio_nac"));

                usuarios.add(usuario);

            }

        } catch (SQLException e) {

            LOG.warning("Consulta:  " + consulta);
            LOG.severe("Error al obtener todos: " + e.getMessage());

        }

        return usuarios;

    }

}
