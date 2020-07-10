package cl.lherrera.m4u2l2.services;

import java.util.List;

import cl.lherrera.m4u2l2.model.Mensaje;

public interface MensajeService {
	List<Mensaje> getDataMessageList();

	void saveDataMessage(Mensaje mensaje);
}