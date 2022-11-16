package inheritance;

public class StringReturns extends Students{

	//STRING RETURNS
	String name = "MATHS";
	
	public void Subject() {
		
		String name = "MATHS";
		System.out.println("SUBJECT IS "+ name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Returns r = new Returns();
		r.Subject();

	}

}
