package scannerClass;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		
		Scanner myobj = new Scanner(System.in);
		System.out.println("ENTER USER NAME");
		
		String username = myobj.nextLine();
		System.out.println("ENTER USER NAME:" + username);
		
}
}
