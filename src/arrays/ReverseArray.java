package arrays;

import java.util.Arrays;

public class ReverseArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayData[]= {4,7,2,5};
		// Before sorting array
	    System.out.println("Before Sorting: "+Arrays.toString(arrayData));
		reverseData(arrayData);
	}
	
	public static void reverseData(int arrayValues[])
	{
		int length=arrayValues.length;
		int revesedArray[]=new int[length];
		for(int i=0;i<length;i++)
		{
			revesedArray[i]=arrayValues[length-1-i];
		}
       System.out.println("After sorting :"+Arrays.toString(revesedArray));
 	}
}
