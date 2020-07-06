
package cl.lherrera.relaciones.servicios;

import java.util.List;

import cl.lherrera.relaciones.dao.AlumnoCursoDAO;
import cl.lherrera.relaciones.modelo.Alumno;
import cl.lherrera.relaciones.modelo.AlumnoCurso;
import cl.lherrera.relaciones.modelo.Curso;

public class ServicioMatricula {

    private AlumnoCursoDAO daoAlumnoCurso = new AlumnoCursoDAO();

    public boolean hacerMatricula(AlumnoCurso alumnoCurso) {

        boolean retorno = false;
        int filasAfectadas = 0;
        if (alumnoCurso != null)
            filasAfectadas = daoAlumnoCurso.ingresaAlumnoCurso(alumnoCurso);
        if (filasAfectadas > 0)
            retorno = true;

        return retorno;

    }

    public List<Alumno> obtenerAlumnosPorCurso(Curso curso) {

        return curso.obtenerAlumnos();

    }

    public List<Curso> obtenerCursosPorAlumno(Alumno alumno) {

        return alumno.obtenerCursos();

    }

}
