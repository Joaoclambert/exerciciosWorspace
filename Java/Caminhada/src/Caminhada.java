import java.util.Scanner;

public class Caminhada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos quilometros voce andou?");
		double kmPercorrido = sc.nextDouble();
		System.out.println("Quanto tempo voce gastou?");
		double tempoGasto = sc.nextDouble();
		double horaCentesimal = tempoGasto / 60;
		double kmPorHora = (kmPercorrido / horaCentesimal);
		double metrosPorMinuto = (kmPercorrido / tempoGasto) * 1000;

		System.out.println();
		System.out.printf("km por hora: %.2f.\n", kmPorHora);
		System.out.println();
		System.out.printf("metros por minuto: %.2f.\n", metrosPorMinuto);

		double pesoCorporal = 107.6;
		double pesoAtual = 96;
		double percente = (pesoAtual / pesoCorporal - 1) * 100;
		double porcento = Math.abs(percente);
		double pesoPerdido = (pesoCorporal - pesoAtual);

		if (pesoAtual < pesoCorporal) {

			System.out.println("Parabens!!!! Voce perdeu peso.");
		} else {
			System.out.println("Voce engordou!");

		}
	}
}
