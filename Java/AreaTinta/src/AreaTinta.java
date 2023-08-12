import java.util.Scanner;

public class AreaTinta {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double areaCoberta = scanner.nextDouble();

		double lata = 18;
		double galao = 3.6;
		int valorLata = 80;
		int valorGalao = 25;
		double rendimento = 6;
		double quantidadeTinta = 0;
		double quantidadeLatas = 0;
		double quantidadeGaloes = 0;

		quantidadeTinta = areaCoberta / rendimento;

		quantidadeLatas  = Math.ceil(quantidadeTinta/lata);
		quantidadeGaloes = Math.ceil(quantidadeTinta / galao);

		System.out.println("Quantidade(s) de lata(s) de tinta necessaria(s): " + quantidadeLatas + " no valor R$ "
				+ quantidadeLatas * valorLata);
		System.out.println("Quantidade(s) de galao(oes) de tinta necessaria(s): " + quantidadeGaloes + " no valor R$ "
				+ quantidadeGaloes * valorGalao);
		if ((quantidadeLatas * valorLata) < (quantidadeGaloes * valorGalao)) {
			System.out.println("Quantidade(s) de lata(s) de tinta necessaria(s): " + quantidadeLatas + " no valor R$ "
					+ quantidadeLatas * valorLata);
		} else {
			System.out.println("Quantidade(s) de galao(oes) de tinta necessaria(s): " + quantidadeGaloes
					+ " no valor R$ " + quantidadeGaloes * valorGalao);
		}

	}

}
