package br.com.fiap;

public class UsaRadioEncapsulada {

	public static void main(String[] args) {
		
		RadioEncapsulado r1 = new RadioEncapsulado ();
		
		r1.setVolume(150);
		r1.setEstacao(95.1f);
		
		r1.mostrar();
		r1.aumentarVolume();
		r1.aumentarVolume();
		r1.mostrar();
	}
}
