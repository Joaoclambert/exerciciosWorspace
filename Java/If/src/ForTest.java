import java.io.IOException;

public class ForTest {

	public static void main(String[] args) throws IOException {

		int i;
		
		System.out.println("Press S for stop.");
		
		for(i=0; (char) System.in.read()!= 'S'; i++)
			System.out.println("Pass#" + i);
		
		

	}

}
