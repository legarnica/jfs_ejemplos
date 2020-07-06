
package cl.lherrera.servlets.login;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.lherrera.dao.UsuarioDao;
import cl.lherrera.entidad.Usuario;

@WebServlet(urlPatterns = "/login/acceder")
public class Acceder extends HttpServlet {

    private static final long serialVersionUID = -5597001130144392634L;

    private static final Logger LOG = Logger.getLogger(Acceder.class.getName());

    private static final UsuarioDao dao = new UsuarioDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {

        try {

            req.getRequestDispatcher("login/login.jsp").forward(req, resp);

        } catch (ServletException | IOException e) {

            LOG.severe("Error en servlet: " + e.getMessage());

        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        Usuario usuario = null;

        try {

            usuario = dao.buscarPorUsername(username);

        } catch (SQLException e1) {

            LOG.severe("Error en servlet: " + e1.getMessage());

        }

        try {

            if (usuario != null && usuario.getPassword().equals(password)) {

                req.getSession().setAttribute("currentUser", usuario);
                req.getRequestDispatcher("/principal.jsp").forward(req, resp);

            } else {

                req.setAttribute("errTxt", "Usuario o contraseña incorrecta");
                req.getRequestDispatcher("/login/login.jsp").forward(req, resp);

            }

        } catch (ServletException | IOException e) {

            LOG.severe("Error en servlet: " + e.getMessage());

        }

    }

}
