
package cl.lherrera.servlets.horoscopo;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.lherrera.dao.UsuarioDao;
import cl.lherrera.entidad.Usuario;
import cl.lherrera.facade.HoroscopoFacade;

@WebServlet(urlPatterns = "/horoscopo/usuario")
public class HoroscopoUsuario extends HttpServlet {

    private static final long serialVersionUID = 8598430300656953013L;

    private static final Logger LOG = Logger.getLogger(HoroscopoUsuario.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {

        Usuario currentUser = (Usuario) req.getSession().getAttribute("currentUser");

        String signoChino = HoroscopoFacade.obtenerHoroscopo(currentUser.getAnioNac());

        try {

            req.setAttribute("horoscopoMje", "El horóscopo chino es: " + signoChino);
            req.getRequestDispatcher("/horoscopo.jsp").forward(req, resp);

        } catch (ServletException | IOException e) {

            LOG.severe("Error en servlet: " + e.getMessage());

        }

    }

}
