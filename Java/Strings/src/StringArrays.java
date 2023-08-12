
public class StringArrays {

	public static void main(String[] args) {

		String strs[] = { "This", "is", "a", "test" };
		System.out.println("Original array");

		for(String s : strs) 
			System.out.println(s + " ");
			System.out.println("\n");

			// Altera um String

			strs[1] = "Was";
			strs[3] = "Test, too";
			System.out.println("Modified array: ");
			for(String s : strs)
				System.out.println(s + " ");

		

	}

}
