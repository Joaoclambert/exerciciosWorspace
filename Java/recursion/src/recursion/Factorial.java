package recursion;

public class Factorial {

		//RECURSIVO
	
		int FactR(int n) {
			int result;
			
			if(n == 1) return 1;
			result = FactR(n - 1) * n;
			return result;
		}	
		//ITERATIVO
		
			int FactI(int n) {
				int t, result;
				result = 1;
				
				for(t = 1; t <= n; t++ ) result *= t;
				return result;
				
				
			}
			
		}

	


