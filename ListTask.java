package arraylistset;

import java.util.ArrayList;
import java.util.List;  

public class ListTask {

	public static void main(String[] args) {
		
		List <Integer> l = new ArrayList<Integer>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		System.out.println(l);
		
		l.remove(2);
		System.out.println(l);
	}

}
