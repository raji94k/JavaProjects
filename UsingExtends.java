
//PACKAGE
package abstraction;

//IN CLASS WE R USING EXTENDS AS KEYWORD
public class UsingExtends extends UsingInterfaces implements Company{

	// CREATING METHOD
	public static void main(String[] args) {
		
		//OBJECT CREATING
		UsingExtends ua = new UsingExtends (); 
		ua.tvs();
		ua.bajaj();

	}

	//ADDING IMPLEMENTATION METHOD
	@Override
	public void tvs() {
		
		System.out.println("TVS motor BIKE");
		
	}

	@Override
	public void bajaj() {
		
		System.out.println("BAJAJ motor BIKE");
		
	}

}
