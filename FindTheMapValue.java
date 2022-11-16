package task21oct;

import java.util.*;

public class FindTheMapValue {

	public static void main(String[] args) {
		
		Map<String , Integer> m=new LinkedHashMap<String,Integer>();
		
		m.put("ALPHA",1);
		m.put("BETA",2);
		m.put("CHARLE", 3);
		m.put("DELTA", 4);
		
		if (m.containsKey("BETA"))
		{
			System.out.println(  "BETA is Present");
		}
		
		else
		{
			System.out.println("Not Present");
		}

	}

}
