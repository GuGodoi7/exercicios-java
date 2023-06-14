package br.com.fiap;

import java.time.LocalDate;

public class Eleitor {
	private String nome;
	private int anoNascimento;
	private int numTitulo;
	private int zona;
	private int secao;
	
	
	public Eleitor() {
	}
	public Eleitor(String nome, int anoNascimento, int numTitulo, int zona, int secao) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.numTitulo = numTitulo;
		this.zona = zona;
		this.secao = secao;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getanoNascimento() {
		return anoNascimento;
	}

	public void setanoNascimento(int anoNascimento) {
		try {
			LocalDate minhaData = LocalDate.now();
			int anoAtualMenos16 = minhaData.getYear() - 16;
			if (anoNascimento >= 1900 && anoNascimento <= anoAtualMenos16) {
				this.anoNascimento = anoNascimento;
			} 
			else {
				throw new Exception("Ano de nascimento inválido!");
			}
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}

	public int getnumTitulo() {
		return numTitulo;
	}

	public void setnumTitulo(int numTitulo) {
		this.numTitulo = numTitulo;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}

	public int getSecao() {
		return secao;
	}

	public void setSecao(int secao) {
		this.secao = secao;
	}
	public int calcularIdade(int anoAtual) {
		int idade = anoAtual - anoNascimento;
		return idade;
	}
	

}
