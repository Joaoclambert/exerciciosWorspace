
public class AddMeth {

	public static void main(String[] args) {

		Vehicle minivan = new Vehicle(7,16,21);
		Vehicle sportcar = new Vehicle(2,14,12);

		// int range1, range2;

		//minivan.passengers = 7;
		//minivan.fuelcap = 16;
	//	minivan.mpg = 21;

		//sportcar.passengers = 2;
		//sportcar.fuelcap = 14;
		//sportcar.mpg = 12;
		
		//range1 = minivan.range();
		//range2 = sportcar.range();
		
								//	METODO RANGE VOID
	//	System.out.println("Minivan can carry " + minivan.passengers + ".");  
	//	minivan.range();
								//	METODO RANGE VOID
	//	System.out.println("Sportcar can carry " + sportcar.passengers + ".");
	//	sportcar.range();
		
		System.out.println("Minivan can carry " + minivan.passengers + " with range of " + 
				minivan.range() + " miles");
		
		System.out.println("Sportcar can carry " + sportcar.passengers + " with range of " + 
				sportcar.range() + " miles");
		

	}

}
