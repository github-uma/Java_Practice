package arrays;

import java.util.Arrays;

public class ArrayObjectCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a;  // declaration
		a= new int[3];// creation
		System.out.println("Before initilizing array:"+Arrays.toString(a));

		a[0]=1; // assignment
		a[1]=2; // assignment
		System.out.println("After initilizing array:"+Arrays.toString(a));
		
		int[] b=new int[-8];//  this will be at runtime java.lang.NegativeArraySizeException: -8
		System.out.println("Before initilizing array:"+Arrays.toString(b));
	}
}
