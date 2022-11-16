package task17oct;

public class FactorialNumber {

	public static void main(String[] args) {

		        int num = 5; //I/P
		        
		        long fact = 1; //DECLARING
		        
		        // LOOPING
		        for(int i = 1; i <= num; ++i)
		        {
		            fact *= i; //ASSIGNING
		        }
		        System.out.printf("Factorial of %d = %d", num, fact);
		    }
	}


