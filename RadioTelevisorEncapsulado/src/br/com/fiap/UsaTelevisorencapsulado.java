package br.com.fiap;

import java.util.Scanner;

public class UsaTelevisorencapsulado {

	public static void main(String[] args) {
		TelevisorEncapsulada tv1 = new TelevisorEncapsulada();
		/* tv1.setCanal(4);
		tv1.setVolume(5);
		tv1.aumentarVolume();
		tv1.aumentarVolume();
		tv1.setCanal(13);
		tv1.mostrar(); */
		
		int escolha = 0;
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Escolha um canal e defina o volume");
			tv1.setCanal(scan.nextInt());
			tv1.setVolume(scan.nextInt());
			System.out.println("Escolha:\n(1)Definir canal\n(2)Definir volume");
			System.out.println("(3)Aumentar volume\n(4)Diminuir volume");
			escolha = scan.nextInt();
			if (escolha == 1) {
				System.out.println("Escolha novo canal:");
				tv1.setCanal(scan.nextInt());
			}
			else if (escolha == 2) {
				System.out.println("Escolha novo valor de volume:");
				tv1.setVolume(scan.nextInt());
			}
			else if (escolha == 3) {
				System.out.println("Aumentando volume...");
				tv1.aumentarVolume();
			}
			else {
				System.out.println("Diminuindo volume...");
				tv1.diminuirVolume();
			}
			tv1.mostrar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
