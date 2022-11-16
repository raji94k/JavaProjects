package task21oct;

import java.util.*;

public class CountOnMap {

	public static void main(String[] args) {
		
		Map<Character , Integer> m=new LinkedHashMap<Character,Integer>();
		
		String str = "WELCOME TO PY";
		
		char[] charArray = str.toCharArray();
		
		for (int i=0; i< charArray.length; i++) {
			
			m.put(charArray[i], m.getOrDefault(charArray[i], 0)+1);
		}
		
		System.out.println(m);
	}

}
