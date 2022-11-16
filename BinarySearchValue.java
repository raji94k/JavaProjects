package task20oct;

import java.util.*;

public class BinarySearchValue {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50,60,70};  
        int key = 50;  
        int output = Arrays.binarySearch(arr,key);  
  
            System.out.println("Element is found:" + output);      
    }  

}
