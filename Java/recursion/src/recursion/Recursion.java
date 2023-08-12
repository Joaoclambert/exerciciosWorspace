package recursion;

public class Recursion {

	public static void main(String[] args) {

		Factorial f = new Factorial();
		
		System.out.println("Factorials using recursive method.");
		System.out.println("Factorial of 3 is: " + f.FactR(3));
		System.out.println("Factorial of 4 is: " + f.FactR(4));
		System.out.println("Factorial of 5 is: " + f.FactR(5));
		
		System.out.println("Factorials using iterative method.");
		System.out.println("Factorial of 3 is: " + f.FactI(3));
		System.out.println("Factorial of 4 is: " + f.FactI(4));
		System.out.println("Factorial of 5 is: " + f.FactI(5));
		
		
	

	}

}
