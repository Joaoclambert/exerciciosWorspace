import java.util.Scanner;

public class TaxaCrescimento {

	public static void main(String[] args) {
		double A, B;

		Scanner input = new Scanner(System.in);
		A = input.nextInt();
		B = input.nextInt();

		int anos = 0;

		double N = (A * 3 / 100) + A;
		double M = (B * 1.5 / 100) + B;
		
		while(N <= M) {
			N = N + (N * 3 / 100);
			M = M + (M * 1.5 / 100);
			anos = anos + 1;
		}
		
		anos = anos + 1;

		// TODO: retornar o número de anos necessários para que a população do país A
		// ultrapasse ou iguale a população B

		System.out.println(anos + " anos");

	}

}
