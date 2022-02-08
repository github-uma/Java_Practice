package algorithms;

import java.util.Arrays;

public class SortArray {
 
	private static void sortArray(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{	
				int compareFrom=arr[i];
				if(arr[i]>arr[j])
				{
					int compareTo=arr[j];
					arr[i]=compareTo;
					arr[j]=compareFrom;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arrayOfIntegers[]= {2,1,1,8,6,10,3,13,7,4,16};

		System.out.println("Before sorting");
		System.out.println(Arrays.toString(arrayOfIntegers));

		System.out.println("After sorting");
		sortArray(arrayOfIntegers);
		System.out.println(Arrays.toString(arrayOfIntegers));
	}
}
