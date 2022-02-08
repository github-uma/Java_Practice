package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedianAfterSort {
	 public static double findMedian(List<Integer> arr) {
		 int sum=0;
		 double median=0.0;

		 for(int i=0;i<arr.size();i++)
		 {
			 sum=sum+arr.get(i);
	     }
		 median=(double)sum/arr.size();
		 return median;
	}
	public static void main(String[] args) {
		List<Integer> ls=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		System.out.println(findMedian(ls));
	}

}
