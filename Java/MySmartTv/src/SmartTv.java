
public class SmartTv {
	boolean tvLigada = false;
	int canal = 14;
	int volume = 32;

	public void ligarTv() {
		tvLigada = true;
	}

	public void desligarTv() {
		tvLigada = false;
	}

	public int canalAtual() {
		return canal;
	}

	public void trocarCanal(int novoCanal) {
		canal = novoCanal;
	}
	
	public void aumentarCanal() {
		canal++;
	}
	
	public void diminuirCanal() {
		canal--;
	}
	
	public int volumeAtual() {
		return volume;
	}
	
	public void aumentarVolume() {
		volume++;
	}
	
	public void diminuirVolume() {
		volume--;
	}
	

}
