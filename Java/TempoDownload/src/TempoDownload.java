import java.text.DecimalFormat;
import java.util.Scanner;

public class TempoDownload {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double tmhMB = sc.nextFloat();
		double tmhMbps = sc.nextFloat();

		double saida = (tmhMB / (tmhMbps)) / 60;

		String saidaDuasCasas = new DecimalFormat("0.00").format(saida);

		String saidaDuasCasasComPonto = saidaDuasCasas.replace(",", ".");
		
		System.out.println(saidaDuasCasasComPonto);

	}

}
