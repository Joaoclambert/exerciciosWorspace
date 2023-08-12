
public class StringDemo {

	public static void main(String[] args) {
		int result, index;
		char ch;
		String str = "When it comes to Web programming, java is #1.";
		String str1 = new String("Hello");
		String str2 = "Java string are powerful";
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("Length string str is: " + str.length());

		for (int i = 0; i < str1.length(); i++) {
			System.out.println(str1.charAt(i));
			System.out.println();

			if (str1.equals(str2))
				System.out.println("str equals str1");
			else
				System.out.println("str does not equals str1");

			result = str.compareTo(str2);
			if (result == 0)
				System.out.println("str and str2 are equals");
			else
				System.out.println("str and str2 are not equals");
			
			result = str.compareTo(str2);
			if (result == 0)
				System.out.println("str and str2 are equals");
			else if(result < 0)
				System.out.println("str is less than str2");
			else System.out.println("str is greater than str2");
			
			str2 = "One Two Three One";
			index = str2.indexOf("One");
			System.out.println("Index of first occurrence of one " + index);
			index = str2.lastIndexOf("One");
			System.out.println("Index of last occurrence of one " + index);
			
			
			
			

		}

	}

}
