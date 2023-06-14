package br.com.fiap;

import java.time.LocalDate;

public class UsaEleitor1 {

	public static void main(String[] args) {
		Eleitor El1 = new Eleitor();
		Eleitor El2 = new Eleitor("Patricia" , 1979, 345, 10, 23);
		LocalDate minhaData = LocalDate.now();
		int anoAtual = minhaData.getYear();
		
		
		El1.setNome( "Gustavo");
		El1.setanoNascimento(2005);
		El1.setnumTitulo(123);
		El1.setZona(21);
		El1.setSecao(12);
		
		
		System.out.println("Nome: " + El1.getNome());
		System.out.println("AnoNascimento: " + El1.getanoNascimento());
		System.out.println("Número do titlo: " + El1.getnumTitulo());
		System.out.println("Zona: " + El1.getZona());
		System.out.println("Seção: " + El1.getSecao());
		System.out.println("Idade: " + El1.calcularIdade(anoAtual));
		
		System.out.println("\n");
		
		System.out.println("Nome: " + El2.getNome());
		System.out.println("AnoNascimento: " + El2.getanoNascimento());
		System.out.println("Número do titlo: " + El2.getnumTitulo());
		System.out.println("Zona: " + El2.getZona());
		System.out.println("Seção: " + El2.getSecao());
		System.out.println("Idade: " + El2.calcularIdade(anoAtual));

	}

}
