
public class TwoVehicles {

	public static void main(String[] args) {
		
		Vehicle minivan = new Vehicle(7,16,21);
		Vehicle sportcar = new Vehicle(2,14,12);
		//int range1, range2;
	/*	
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportcar.passengers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;
	*/	
		//range1 = minivan.fuelcap * minivan.mpg;
		//range2 = sportcar.fuelcap * sportcar.mpg;
		
		System.out.println("Minivan can carry " + minivan.passengers + ", with a range of " + minivan.range());
		System.out.println("sportcar can carry " + sportcar.passengers + ", with a range of " + sportcar.range());
	}

}
