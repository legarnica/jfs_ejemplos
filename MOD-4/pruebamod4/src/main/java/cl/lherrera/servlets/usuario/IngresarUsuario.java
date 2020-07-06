
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

@WebServlet(urlPatterns = "/usuario/ingresar")
public class IngresarUsuario extends HttpServlet {

    private static final long serialVersionUID = -8928785497637064198L;

    private static final Logger LOG = Logger.getLogger(IngresarUsuario.class.getName());

    private static final UsuarioDao dao = new UsuarioDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {

        try {

            req.getRequestDispatcher("ingresar.jsp").forward(req, resp);

        } catch (ServletException | IOException e) {

            LOG.severe("Error en servlet: " + e.getMessage());

        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {

        Usuario usuario = new Usuario();

        String password = req.getParameter("password");
        String password_ = req.getParameter("password_");

        if (password.equals(password_)) {

            usuario.setNombre(req.getParameter("nombre"));
            usuario.setApellido(req.getParameter("apellido"));
            usuario.setUsername(req.getParameter("username"));
            usuario.setPassword(password);
            usuario.setAnioNac(Integer.parseInt(req.getParameter("anio_nac")));
            dao.ingresar(usuario);
            req.setAttribute("succTxt", "Usuario: " + usuario.getNombre() + " ingresado");

        } else {

            req.setAttribute("errTxt", "las contraseñas no son iguales");

        }

        try {

            req.getRequestDispatcher("ingresar.jsp").forward(req, resp);

        } catch (ServletException | IOException e) {

            LOG.severe("Error en servlet: " + e.getMessage());

        }

    }

}
