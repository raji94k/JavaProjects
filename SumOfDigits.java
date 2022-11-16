package task18oct;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no = 1532, cal=0, rem, ori;
		
		while (no>0) {
			
			rem = no % 10;
			no = no/10;
			cal = cal + rem;
		}
		System.out.println(cal);
	}

}
