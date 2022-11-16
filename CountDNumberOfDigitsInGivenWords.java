package task22oct;

public class CountDNumberOfDigitsInGivenWords {

	public static void main(String[] args) {
		
		String s="happy diwali 1234567890";
	    int count=0;
	    for(int i=0;i<s.length();i++)
	    {
	      if(Character.isDigit(s.charAt(i)))
	      count++;
	    
	    }
	    System.out.println("The Number of Digits in the Given Words:" + count);
	  }
	
	}

