package cl.lherrera.m4u2l2.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cl.lherrera.m4u2l2.model.Mensaje;

@Service("mensajeService")
public class MensajeServiceImpl implements MensajeService {
	private List<Mensaje> messageList;

	MensajeServiceImpl() {
		super();
		messageList = new ArrayList<Mensaje>();
		messageList.clear();
	}

	@Override
	public List<Mensaje> getDataMessageList() {
		return messageList;
	}

	@Override
	public void saveDataMessage(Mensaje mensaje) {
		/*
		 * Se evalúa si remitente es nulo, de tal forma que no se agregue el item a la
		 * lista
		 */
		if (mensaje.getRemitente() != null) {
			messageList.add(mensaje);
		}

	}

}
