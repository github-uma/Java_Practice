package arrays;
// Java implementation of the approach
import java.io.*;
import java.util.Arrays;

class SortArrayHaving012 {
	// Utility function to print the contents of an array
	static int[] sortArr(int arr[])
	{
		int n=arr.length;
		int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;
		// Count the number of 0s, 1s and 2s in the array
		for (i = 0; i < n; i++) {
			switch (arr[i]) {
			case 0:
				cnt0++;
				break;
			case 1:
				cnt1++;
				break;
			case 2:
				cnt2++;
				break;
			}
		}
		// Update the array
		i = 0;
		// Store all the 0s in the beginning
		while (cnt0 > 0) {
			arr[i++] = 0;
			cnt0--;
		}
		// Then all the 1s
		while (cnt1 > 0) {
			arr[i++] = 1;
			cnt1--;
		}
	
		// Finally all the 2s
		while (cnt2 > 0) {
			arr[i++] = 2;
			cnt2--;
		}
		return arr;
	}
	// Driver code
	public static void main(String[] args)
	{
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(sortArr(arr)));
	}
}