package br.com.fiap;

public class TelevisorEncapsulada {
	private int volume;
	private int canal;
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
		try {
			if (volume >= 0 && volume <= 20) {
				this.volume=volume;
			} else {
				throw new Exception ("O volume está fora da faixa permitida");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
		try {
			if (canal == 2 || canal== 4 || canal == 5 || canal == 7 || canal== 13) {
				this.canal=canal;
			} else {
				throw new Exception ("O canal não é permitido"); 
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void aumentarVolume() {
		if (volume < 100) {	
		}
		this.volume++;
	}
	public void diminuirVolume() {
		if (volume >= 0) {
			
		}
		this.volume--;
	}
	public void mostrar() {
		System.out.println("O volume atual é " + volume + "\nO canal atual " + canal);
	}
	

}
