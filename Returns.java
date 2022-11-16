package inheritance;

public class Returns extends Students {
	
	// INT RETUNRS
	int sub;
	String name = "MATHS";
	
	public void Subject() {
		sub = 123;
		String name = "MATHS";
		System.out.println("SUBJECT IS "+ name);
	}
	
	public int sub() {
		return sub;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Returns r = new Returns();
		r.Subject();
		int value = r.sub();
		System.out.println(value);

	}

}
