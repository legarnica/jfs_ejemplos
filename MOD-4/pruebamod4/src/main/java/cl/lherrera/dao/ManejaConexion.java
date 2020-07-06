
package cl.lherrera.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class ManejaConexion {

    private static final String DB_URL = "jdbc:sqlite:/Users/luisherrera/Desktop/AIEP - DOCS/NEWMODS/MOD04/pruebaFinal/pruebamod4/basedatos.db";
    private static final String DB_USER = "admin";
    private static final String DB_PWD = "1234";

    private static final Logger LOG = Logger.getLogger(ManejaConexion.class.getName());

    private static ManejaConexion manejaConexion;

    public static ManejaConexion obtenerManejo() {
        System.out.println("No olvidar cambiar la ruta absoluta de su base de datos" + ManejaConexion.class.getCanonicalName());
        System.out.println("DB_URL: " + DB_URL);
        if(manejaConexion == null) {
            manejaConexion = new ManejaConexion();
        }
        
        return manejaConexion;
    }

    public Connection obtenerConexion() throws SQLException {
        Connection conexion = null;
        
        // carga de driver
        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);
            
        } catch (ClassNotFoundException e) {
            LOG.severe("El driver no pudo ser cargado: " + e.getCause());
        }catch (SQLException ex) {
            LOG.severe("No se pudo obtener la conexión: " + ex.getMessage());
            throw new SQLException();
            
        }
        
        return conexion;
    }

}
