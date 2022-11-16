package inheritance;

public class IntReturns extends Students {

	int sub;
	String name = "Science";
	
	public void Subject() {
		sub = uniform;
		String name = "Science";
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

