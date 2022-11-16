package task21oct;

public class CountOfEachWords {

	public static void main(String[] args) {
		
		String test = "TOO MANY TASK TO COMPLETE :-(";
		
		int letter=0,space=0,num=0,specialChar=0;
		
		char[] charArr = test.toCharArray();
		
		for(int i = 0 ; i< charArr.length; i++ ) {
			
			if(Character.isLetter(charArr[i]))
		{
			System.out.println(charArr[i] + "--LETTERS");
		}
		
		if(Character.isDigit(charArr[i]))
		{
			System.out.println(charArr[i] + "--DIGITS");
	}
		
		if(Character.isSpaceChar(charArr[i]))
		{
			System.out.println(charArr[i] + "*SPACE*");
	}

	}
	}
}
