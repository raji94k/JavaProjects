//its a Example For OOPS
// PACKAGE & CLASS
public class StudentData {

	public void Studentname(){
		System.out.println("Name:Raji");
	}
	
	public void studentList() { System.out.println();
	
	}
	
	//METHOD 1
	
	public void studentmark() { System.out.println("Mark:100");
	
	}
	
	//METHOD 2
	
	public void studentaddress() { System.out.println("Address:Py");
	
	}
	
	//OUTPUT
	
	public static void main(String[] arg) { StudentData info =
			new StudentData(); info.Studentname();
			info.studentmark(); info.studentaddress();
	}
}
