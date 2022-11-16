package task20oct;

import java.util.*;

public class SecondSmallestArray {
	public static int getSecondSmallest(int[] a) 
	{  
		Arrays.sort(a);  
		return a[1];  //2nd SMALLEST (A[1])
	}  
		public static void main(String args[])
		
		{  
		int a[]={44,66,99,77,33,22,55};  
		int a1 = getSecondSmallest(a);  
		System.out.println("SECOND SMALLEST ARRAY:" + a1);  
		}
		
}

	


	
		

	


