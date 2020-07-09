package cl.lherrera.boxers.main;

import cl.lherrera.boxers.impl.EstilistaImpl;
import cl.lherrera.boxers.impl.FajadorImpl;
import cl.lherrera.boxers.impl.MixtoImpl;
import cl.lherrera.boxers.interfaces.Boxeador;

public class Principal {
	public static void main(String[] args) {
		Boxeador destructor = new EstilistaImpl("Alonso", 87);
		
		Boxeador escarlata = new MixtoImpl("Patricia", 67);
		
		Boxeador heavyMachinGun = new FajadorImpl("Pedro", 74);
		
		AltoNivel encuentro = new AltoNivel(heavyMachinGun, escarlata);
		
		encuentro.iniciarPelea();
	}
}
