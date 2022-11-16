package org.text;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "JAVA";
		
		String address = "JDK";
		
		String data = "JRE";
		
		System.out.println(name);
		System.out.println(address);
		System.out.println(data);
		
		System.out.println(name.length());
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.toUpperCase());
		
		System.out.println(data.charAt(1));
		
		System.out.println(name.concat(address));
		
		System.out.println(data.endsWith(data));
		
		System.out.println(name.startsWith(data));
		
		System.out.println(name.compareTo(data));
		
		System.out.println(name.equals(data));
		
		System.out.println(name.compareToIgnoreCase(data));
		
		
	}

}
