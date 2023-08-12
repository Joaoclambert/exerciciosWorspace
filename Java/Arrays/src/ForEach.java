
public class ForEach {

	public static void main(String[] args) {
		
		int nums[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		int sum = 0;
		
		for(int i = 0; i < 14; i++) sum += nums[i];				// ARRAY LAÇO FOR
		System.out.println("Sum é igual a: " + sum);
		
		System.out.println("---------------------------");
		
		int numbs[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		int summ = 0;											// ARRAY LAÇO FOR-EACH
		
		for(int x : numbs){
			System.out.println("Value x is: " + x);
		summ += x;
		if(x == 5)break;      									// USANDO O BREAK
		x = x * 10;												// NÃO TEM EFEITO SOBRE summ
		}
		System.out.println();
		System.out.println("Summation is: " + summ);
}
}