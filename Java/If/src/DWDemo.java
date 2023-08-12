
public class DWDemo {                                 //Pag livro 103.

	public static void main(String[] args) {
//Laço do-while

		char ch, ignore, answer = 'K';
do {
		System.out.println("I'm thinking of a letter betwen A and Z");
		System.out.println("Can you guess it:");

		ch = (char) System.in.read();
		ignore = (char) System.in.read();

		if (ch == answer)
			System.out.println("**Right**");
		else {
			System.out.print("...Sorry you're ");
			if (ch < answer)
				System.out.println("too low");
			else
				System.out.println("too right");
		

		}
}


