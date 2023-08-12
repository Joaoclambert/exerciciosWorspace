
public class Search {

	public static void main(String[] args) {
		
		int nums[] = {2,58,74,21,48,74,52,12,56,80,104,1214,23,58};
		int val = 58;
		boolean found = false;
		
		for(int x: nums) {
			if(x == val) {
				found = true;
				break;
			}
		}
		
		if(found) 
			System.out.println("Value found!");
		else 
		System.out.println("Value not found!");
		

	}

}
