package algorithms;

import java.util.Arrays;

public class MeanOfArray {

	public static void main(String[] args) {
       
		int[] arr={6,2};
		Arrays.sort(arr);
		trimMean(arr);
	}
	
    public static double  trimMean(int[] arr) {
        double sum = 0;
		Arrays.sort(arr);
		
        for (int i =0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum / arr.length);
        return sum / arr.length;
    }
}
