package algorithms;

import java.io.*;
import java.util.*;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter length of array ");
		int n = in.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Total sum of array is "+sum);

	}
}