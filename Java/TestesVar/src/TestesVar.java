import java.util.Scanner;

public class TestesVar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite uma palavra ou frase: ");
		String entradaUsuario = sc.nextLine();
		
		int tamanhoString = entradaUsuario.length();
		
		for(int contador = 1; contador <= tamanhoString; contador++) {
			System.out.println(entradaUsuario.substring(0, contador));
		}
		
		sc.close();
	}
}

