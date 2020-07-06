package cl.lherrera.servlets.usuario;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.lherrera.dao.UsuarioDao;
import cl.lherrera.entidad.Usuario;

@WebServlet(urlPatterns = "/usuario/eliminar")
public class EliminarUsuario extends HttpServlet {

    private static final long serialVersionUID = 563616516983017746L;
    
    private static final Logger LOG = Logger.getLogger(ActualizaUsuario.class.getName());

    private static final UsuarioDao dao = new UsuarioDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        try {

            Integer id = Integer.parseInt(req.getParameter("id"));

            
            Usuario usuario = dao.buscarPorId(id);

            String mensaje = "Usuario: " + usuario.getUsername() + " eliminado";
            
            dao.eliminar(id);
            req.setAttribute("usuarios", dao.obtenerTodos());
            req.setAttribute("delMsj", mensaje);
            req.getRequestDispatcher("index.jsp").forward(req, resp);

        } catch (ServletException | IOException e) {

            LOG.severe("Error en servlet: " + e.getMessage());

        }
        
    }
    
    
    

}
