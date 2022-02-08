package algorithms;

import java.util.Arrays;

public class SortArrayUsing {
	public static void main(String[] args) {
		int arrayOfIntegers[] = { 2, 1, 1, 8, 6, 10, 3, 13, 7, 4, 16 };
		System.out.println("Before Sorting " + Arrays.toString(arrayOfIntegers));
		
		Arrays.sort(arrayOfIntegers);
		System.out.println("After Sorting " + Arrays.toString(arrayOfIntegers));
	}
}