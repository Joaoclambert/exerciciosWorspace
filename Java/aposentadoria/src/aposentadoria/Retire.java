package aposentadoria;

import java.util.Scanner;

public class Retire {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double retireTotal = 4954.57; // 36 anos e 07 meses
		double retireParcial = 4317.52;  // 36 anos 
		double tempoRestanteParcial = 11 * 1056;
		double tempoRestanteTotal = 18 * 1100;
		double diferencaRecolhimento = tempoRestanteTotal - tempoRestanteParcial;
		double expectativaParcial = retireParcial * 152 -tempoRestanteParcial;
		double expectativaTotal = retireTotal * 144 - tempoRestanteTotal;
		double diferencaEpectativa = expectativaTotal - expectativaParcial;
		
		System.out.println("Tempo restante recolhimento parcial= " + tempoRestanteParcial);
		System.out.println("Tempo restante recolhimento total= " + tempoRestanteTotal);
		System.out.println();
		System.out.println("Diferenca recolhimento= " + diferencaRecolhimento);
		System.out.println();
		System.out.println("Expectativa com parcial= " + expectativaParcial);
		System.out.printf("Expectativa com Total= %.2f\n" , expectativaTotal);
		System.out.printf("Diferenca expectativa= %.2f " , diferencaEpectativa);

	}

}
