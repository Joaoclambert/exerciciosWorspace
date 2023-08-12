public class Vehicle {

		int passengers;
		private int fuelcap;
		private int mpg;

		//void range() {       "METODO RANGE VOID"
		//	System.out.println("Range is: " + fuelcap * mpg);
		
		public Vehicle(int p, int f, int m) {
			passengers = p;
			fuelcap = f;
			mpg = m;
		}
				
		int range() {
			return fuelcap * mpg;
		}
	
		double fuelneeded(int miles) {
			
			return (double) miles / mpg;
		}
}
