
package cl.lherrera.facades;

import java.util.ArrayList;
import java.util.List;

import cl.lherrera.Dto.PersonaDto;
import cl.lherrera.daos.DatoPersonalDAO;
import cl.lherrera.entidades.DatoPersonal;

public class Facade {

    public List<PersonaDto> obtenerDatos() {

        List<PersonaDto> personas = new ArrayList<>();
        DatoPersonalDAO dao = new DatoPersonalDAO();

        List<DatoPersonal> datosPersonales = dao.obtenerTodos();

        for (DatoPersonal datoPersonal : datosPersonales) {

            PersonaDto persona = new PersonaDto();
            persona.setNombre(datoPersonal.getPersona().getNombre());
            persona.setTelefono(datoPersonal.getTelefono());
            persona.setEmail(datoPersonal.getEmail());
            
            personas.add(persona);
        }
        
        return personas;

    }

}
