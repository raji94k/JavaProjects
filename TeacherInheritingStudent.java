package inheritance;

public class TeacherInheritingStudent extends Students {
	
	public void teach() {
		System.out.println("TEACHING");
	}
	
	public void play() {
		System.out.println("STUDENTS NOT PLAYING");
	}
	
	public static void main(String[] args) {
		
		TeacherInheritingStudent tis = new TeacherInheritingStudent();
		tis.teach();
		
		tis.listen();
		
		tis.play();
			
	}
	
	

}
