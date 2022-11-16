package task21oct;

public class ReverseOfTheNumber {

	public static void main(String[] args) {
		
		int num = 123456789, rev = 0;
		
		while (num!=0) {
			
			int rem = num%10;
			rev=rev*10+rem;
			num=num/10;
	}
     
		System.out.println("REVERSE OF THE NUMBERS ARE: " + rev);
  }
	
}
