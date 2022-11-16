package task21oct;

public class FindTheCountOfEachWords {

	public static void main(String[] args) {
		
		String str = "WELCOME TO PY";
		
		char[] charArray = str.toCharArray();
		int c=0;
		
		for(int i = 0; i < charArray.length; i++)
		{
           
			if(charArray [i] == 'W') {
				
				c++;
				
			}
	}
		System.out.println("W is present"  +  c  +  "times");
		
	}
}
