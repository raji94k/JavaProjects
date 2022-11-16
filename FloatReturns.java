package inheritance;

public class FloatReturns extends Students {

	// FLOAT RETURNS
	float sub;
	String name = "MATHS";
	
	public void Subject() {
		sub = uniform;
		String name = "MATHS";
		System.out.println("SUBJECT IS "+ name);
	}
	
	public float sub() {
		return sub;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Returns r = new Returns();
		r.Subject();
		float value = r.sub();
		System.out.println(value);

	}

}
