
//PACKAGE
package abstraction;

//IN CLASS WE R USING ABSTRACTION (IMPLEMENTS) AS KEYWORD
public class UsingAbstraction implements Company{

	// CREATING METHOD
	public static void main(String[] args) {
		
		//OBJECT CREATING
		UsingAbstraction ua = new UsingAbstraction (); 
		ua.tvs();
		ua.bajaj();

	}

	//ADDING IMPLEMENTATION METHOD
	@Override
	public void tvs() {
		
		System.out.println("TVS BIKE");
		
	}

	@Override
	public void bajaj() {
		
		System.out.println("BAJAJ BIKE");
		
	}

}
