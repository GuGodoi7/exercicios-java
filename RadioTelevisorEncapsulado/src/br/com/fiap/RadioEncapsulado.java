package br.com.fiap;

public class RadioEncapsulado {
	
	private int volume;
	private float estacao;
	// criar get e set autmatico ctrl + 3 
	//lupa escreve ggas
	// clica em selec all, gnerate
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		try {
			if (volume >= 0 && volume <= 100 ) {
				this.volume = volume;
			} else {
				throw new Exception(" Vol fora da faixa permitida ");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public float getEstacao() {
		return estacao;
	}
	public void setEstacao(float estacao) {
		try {
			if (estacao >= 80.0 && estacao <= 105.0) {
				this.estacao = estacao;
			} else {
				throw new Exception ("estcao fora da faixa permitida");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// this.estacao = estacao;
		}
	}
	
	public void aumentarVolume() {
		if (volume < 100 ) {
			volume++;
		}
	}
	public void diminuirVolume() {
		if (volume < 0 ) {
			volume--;
		}
	}
	
	public void mostrar() {
		System.out.println("vol atual " + volume);
		System.out.println("eatação atual " + estacao);
	}

		
}

