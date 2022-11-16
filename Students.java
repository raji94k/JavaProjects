package inheritance;

public class Students {
	
	//global variable declaration
	int uniform; 
	String name;
	
	public void listen() {
		System.out.println("STUDENTS ARE LISTENING");
	}
	public void listen(String name) {
		System.out.println(name+ "IS LISTENING");
	}
	public void play() {
		System.out.println("STUDENTS ARE PLAYING");
	}
	//driver main function
public static void main(String[] args) {
	Students s = new Students(); // S is the object
	s.play(); // . dot operator play method
	
	s.listen();
	s.listen("Raj"
			+ " ");
}
}
