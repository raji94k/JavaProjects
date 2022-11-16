package task17oct;
 
//TO FIND PRIME NUMBER
public class PrimeNumber {

	public static void main(String[] args) {

		
			    int num = 13; //I/P
			    boolean number = false; //BOOLEAN
			    
			    // LOOPING
			    for (int i = 2; i <= num / 2; ++i) {
			      
			    	//PRIME NUMBER CONDITION
			      if (num % i == 0) {
			        number = true;
			        break;
			      }
			    }
			    //O/P
			    if (!number)
			      System.out.println(num + " IS A PRIME NUMBER");
			    else
			      System.out.println(num + " IS NOT A PRIME NUMBER");
			  }
	}


