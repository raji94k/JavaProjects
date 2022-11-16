package inheritance;

public class Student extends Students {
	
    String sub;
	boolean subjects;
	int subject;
	float s;
	
	public void teach() {
		subjects = true;
		System.out.println("TEACHING");
		System.out.println("PLAYING");
			
	}
	
	public static void main(String[] args) {
		
		Student stud = new Student();
		stud.teach();
	}
	
}
