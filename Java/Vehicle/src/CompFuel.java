
public class CompFuel {

	public static void main(String[] args) {
	
		Vehicle minivan = new Vehicle(7, 16, 21);
		Vehicle sportcar = new Vehicle(2, 14, 12);

		double gallons;
		int dist = 252;
		/*
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportcar.passengers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;
		*/
		gallons = minivan.fuelneeded(dist);
		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons");
		
		gallons = sportcar.fuelneeded(dist);
		System.out.println("To go " + dist + " miles sportcar needs " + gallons + " gallons");

	}

}
