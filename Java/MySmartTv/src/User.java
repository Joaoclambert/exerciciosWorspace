
public class User {

	public static void main(String[] args) {

		SmartTv smartTv = new SmartTv();

		smartTv.desligarTv();
		System.out.println("A tv está ligada?: " + smartTv.tvLigada);

		smartTv.ligarTv();
		System.out.println("A tv está ligada?: " + smartTv.tvLigada);

		smartTv.canalAtual();
		System.out.println("O canal atual é: " + smartTv.canal);

		smartTv.trocarCanal(22);
		System.out.println("O canal agora é: " + smartTv.canal);
		
		smartTv.aumentarCanal();
		System.out.println("O canal aumentou : " + smartTv.canal);
		
		smartTv.diminuirCanal();
		System.out.println("O canal diminuiu para: " + smartTv.canal);
		
		smartTv.volumeAtual();
		System.out.println("O volume atual é: " + smartTv.volume);
		
		smartTv.aumentarVolume();
		System.out.println("O volume aumentou para: " + smartTv.volume);
		
		smartTv.diminuirVolume();
		System.out.println("O volume diminuiu para: " + smartTv.volume);

	}

}
