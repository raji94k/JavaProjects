package task22oct;

public class CountDNumberOfWhiteSpace {

	public static void main(String[] args) {
		
		String s="happy diwali 123 45 678 90";
	    int count=0;
	    for(int i=0;i<s.length();i++)
	    {
	      if(Character.isSpaceChar(s.charAt(i)))
	      count++;
	    
	    }
	    System.out.println("The Number of White Space in the Given Words:" + count);
	  }
	}

