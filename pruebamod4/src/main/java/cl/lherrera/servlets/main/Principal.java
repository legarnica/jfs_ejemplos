
package cl.lherrera.servlets.main;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {
    "/",
    ""
})
public class Principal extends HttpServlet {

    private static final long serialVersionUID = 5098935244904737756L;

    private static final Logger LOG = Logger.getLogger(Principal.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {

        try {
            if(req.getSession().getAttribute("currentUser") == null)
                req.getRequestDispatcher("login/login.jsp").forward(req, resp);
            else
                req.getRequestDispatcher("/principal.jsp").forward(req, resp);

        } catch (ServletException | IOException e) {

            LOG.severe("Error en servlet: " + e.getMessage());

        }

    }

}
