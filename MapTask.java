package arraylistset;

import java.util.*;

public class MapTask {

	public static void main(String[] args) {
		
		String str[] = {"alpha" , "beta", "charle"};
		
		Map <Integer,String> m = new HashMap<Integer,String>();
		
		m.put(1,"alpha");
		m.put(2,"beta");
		m.put(3, "charle");
		System.out.println(m);
		
		m.remove(1);
		System.out.println(m);
		
		m.clear();
		System.out.println(m);
		
	}

}


