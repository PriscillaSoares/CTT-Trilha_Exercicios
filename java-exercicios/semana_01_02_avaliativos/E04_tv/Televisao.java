package semana_01_02_avaliativos.E04_tv;

public class Televisao {

	private int volume;
	private int canal;

	public int aumentarVolume() {
		this.volume = this.volume + 1;
		return this.volume;
	}

	public int diminuirVolume() {
		this.volume = this.volume - 1;
		return this.volume;
	}

	public int aumentaCanal() {
		this.canal = this.canal + 1;
		return this.canal;
	}

	public int diminuiCanal() {
		this.canal = this.canal - 1;
		return this.canal;
	}

	public int trocarCanal(int canalEscolhido) {
		this.canal = canalEscolhido;
		return this.canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

}
