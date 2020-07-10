package cl.lherrera.m4u2l2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.lherrera.m4u2l2.model.Mensaje;
import cl.lherrera.m4u2l2.services.MensajeService;

@Controller
@RequestMapping(value = "/mensaje")
public class MensajeController {
	@Autowired
	private MensajeService mensajeService;
	
	@RequestMapping(value = "/messageList", method = RequestMethod.GET)
	public String getDataMessageList(ModelMap model) {
		model.addAttribute("dataMessageList", mensajeService.getDataMessageList());

		return "mensajes";
	}

	@RequestMapping(value = "/saveMessage", method = RequestMethod.POST)
	public String saveDataMessage(
			ModelMap model, 
			@ModelAttribute("mensaje") Mensaje mensaje) {

		// TODO Auto-generated method stub
		System.out.println(mensaje.getRemitente() + " dice que " + mensaje.getMensaje());
		/* Enviamos el objeto mensaje, recibido desde la vista, a nuestro servicio */ 

		mensajeService.saveDataMessage(mensaje);

		/*
		 * Obtenemos la lista de mensajes desde nuestro servicio, y la actualizamos en
		 * el modelo
		 */
		model.addAttribute("dataMessageList", mensajeService.getDataMessageList());
		return "mensajes";
	}

}
