package task20oct;

import java.util.*;

public class SecondLargestInArray {

	public static int getSecondLargest(int[] a) 
	{  
		Arrays.sort(a);  
		return a[a.length - 2];  //2nd LARGEST (A.LENGTH - 2)
	}  
		public static void main(String args[])
		
		{  
		int a[]={1,2,5,6,3,2};  
		int a1 = getSecondLargest(a);  
		System.out.println("SECOND LARGEST ARRAY:" + a1);  
		}
		
}
