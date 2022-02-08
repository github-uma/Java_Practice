package arrays;

import java.util.Arrays;

public class ArraysClassMethods {

	public static void main(String[] args) {

		int[] nums= {1,3,4,5,2,11,2,1,3,5,8};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		Arrays.fill(nums, 6, 11, 0);
		System.out.println(Arrays.toString(nums));
	}
}
