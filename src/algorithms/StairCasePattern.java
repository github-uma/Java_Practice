package algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StairCasePattern {
	static void staircase(int n) {
		int x = 1, i, j;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n - x; j++) {
				System.out.print(" ");
			}
			while (j < n) {
				System.out.print("#");
				j++;
			}
			x++;
			System.out.print("\n");
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter number ");
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		staircase(n);
		scanner.close();
	}
}