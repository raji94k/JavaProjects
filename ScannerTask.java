package scannerClass;

import java.util.Scanner;

public class ScannerTask {
	
	public static void main(String[] args) {
		
		//SCANNER CLASS
		Scanner myobj = new Scanner(System.in);
		
		//STUDENT NAME
		System.out.println("STUDENT NAME:");
		String username = myobj.nextLine();
		
		//STUDENT ID
		System.out.println("STUDENT ID:");
		int studentid = myobj.nextInt();
		
		//STUDENT AGE
		System.out.println("STUDENT AGE:");
		long studentage = myobj.nextLong();
		
		//STUDENT AGE
		System.out.println("STUDENT CLASS NAME:");
		int studentclassname = myobj.nextInt();
		
		//STUDENT MARKS
		System.out.println("STUDENT MARKS:");
		int studentmark = myobj.nextInt();
		
		//STUDENT AVERAGE
		System.out.println("STUDENT AVERAGE:");
		long studentaverage = myobj.nextLong();
		
}
}

