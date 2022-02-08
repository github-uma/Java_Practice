package arrays;

import java.util.Arrays;

public class ArrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40,50,60};
		int[] b= {70,80};
		// Print arrays before assignment
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println("Print arrays when a=b");
		a=b;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println("Print arrays when b=a");
		b=a;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
