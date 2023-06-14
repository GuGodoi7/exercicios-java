package br.com.fiap;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class UsaEleitor2 {

	public static void main(String[] args) {
		Eleitor El2 = new Eleitor();
		LocalDate minhaData = LocalDate.now();
		int anoAtual = minhaData.getYear();
		String aux;
		
		try {
			aux = JOptionPane.showInputDialog("Digite seu nome: ");
			El2.setNome(aux);
			aux = JOptionPane.showInputDialog("Digite a data de nascimento: ");
			El2.setanoNascimento(Integer.parseInt(aux));
			aux = JOptionPane.showInputDialog("Digite o número do titulo: ");
			El2.setnumTitulo(Integer.parseInt(aux));
			aux  = JOptionPane.showInputDialog("Digite a zona: ");
			El2.setZona(Integer.parseInt(aux));
			aux = JOptionPane.showInputDialog("Digite a seção: ");
			El2.setSecao(Integer.parseInt(aux));
			
			JOptionPane.showMessageDialog(null, "Nome: " + El2.getNome()
												+ "\nData nascimento: " + El2.getanoNascimento()
												+ "\nNúmero do Tutitulo: " + El2.getnumTitulo()
												+ "\nZona: " + El2.getZona()
												+ "\nSeção: " + El2.getSecao()
												+ "\nIdade: " + El2.calcularIdade(anoAtual));	
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
	}

}
