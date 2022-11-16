package arraylistset;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class SetTask {

	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<Integer>();
		Set<Integer> s1 = new TreeSet<Integer>();
		Set<Integer> s2 = new LinkedHashSet<Integer>();
		
		
		s.add(11);
		s.add(12);
		s.add(13);
		s.add(12);
		System.out.println(s);
		
		s1.add(1);
		s1.removeAll(s1);
		System.out.println(s1);
		
		s2.add(11);
		s2.add(12);
		s2.add(13);
		System.out.println(s2);
	}

}
