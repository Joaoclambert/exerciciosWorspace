import java.io.IOException;

public class MyKey {

	public static void main(String[] args) throws IOException {
		
		char ch, answer = 'K';
		
		System.out.println("I'm thinking of a letter betwen A and Z");
		System.out.println("Can you guess it:");
		
		ch = (char) System.in.read();	
		
		if(ch == answer) System.out.println("**Right**");
		else { System.out.print("...Sorry you're ");
		if(ch < answer)System.out.println("too low");
		else System.out.println("too right");
		}

	}

}
