package arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayElemets {

	public static void main(String[] args) {
		// Custom input array
        int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
        System.out.println("Original arr[] "+Arrays.toString(arr));
        
        // Sort subarray from index 1 to 4, i.e.,
        // only sort subarray {7, 6, 45, 21} and
        // keep other elements as it is.
        Arrays.sort(arr, 1, 5);
        System.out.println("Substring sorting arr[] "+Arrays.toString(arr));

        // Applying sort() method over to above array
        // by passing the array as an argument
        Arrays.sort(arr);
  
        // Printing the array after sorting in ascending order
        System.out.println("Ascending arr[] "+Arrays.toString(arr));
        
        // Note that we have Integer here instead of
        // int[] as Collections.reverseOrder doesn't
        // work for primitive types.
        // Printing the array after sorting in descending order
        Integer[] arr2 = { 13, 7, 6, 45, 21, 9, 101, 102 };
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println("Reverseed arr[] "+Arrays.toString(arr2));
	}
}
