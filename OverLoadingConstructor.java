package constructor;

public class OverLoadingConstructor {
	
	char a;
	String name;
	boolean condition;

	
	public OverLoadingConstructor () {
		System.out.println("input");
	}
	
	 OverLoadingConstructor(boolean condition, char a)
	 
	 {
		 this.a = a;
		 this.condition = condition;
	 }
	  
	 public static void main(String[] args) { 
		 
		 OverLoadingConstructor olc = new OverLoadingConstructor();
		 OverLoadingConstructor olc1= new OverLoadingConstructor(true,'a');
		 
		 System.out.println(olc.condition);
		 System.out.println(olc1.condition);
		 
	 }
}