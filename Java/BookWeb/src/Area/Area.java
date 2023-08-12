package Area;
public class Area {

	public static void main(String[] args) {
		
	
		
		double areaCirculo = 0;
		double areaQuadrado = 0;
		double largura = 2.4;
		double diametro = largura;
		double PI = 3.1416;
		double raio = diametro/2;
		double comprimento = 8;
		double maiorVolume = 0;
		

		
		areaCirculo = PI * Math.pow(raio, 2);
		areaQuadrado = Math.pow(largura, 2);
		maiorVolume = (areaQuadrado/areaCirculo - 1) *100;
		
	
		System.out.printf("O volume do circulo é: %.2f\n" , areaCirculo * comprimento);
		System.out.println("O volume do quadrado é: " + areaQuadrado * comprimento);
		System.out.print("Mais material no quadrado: " + maiorVolume + " %\n");

		//---------------------------------//
		
		
		double gallons, liters = 0;
		int count;
		count = 0;
		
		for(gallons = 1; gallons <=20; gallons++) {
			 liters = gallons * 3.7854; 
			System.out.println(gallons + " gallons is " + liters + " liters");
			count++;
			
			
			if(count == 10) {
				System.out.println();
				count = 0;
			}
		}
		
		
		
		
	

	}

}
