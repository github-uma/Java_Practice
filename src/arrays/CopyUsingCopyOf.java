package arrays;

import java.util.Arrays;
//f you want to copy the first few elements of an array or full copy of the array,
public class CopyUsingCopyOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 8, 3,4,6 };
		 
        // Create an array b[] of same size as a[]
        // Copy elements of a[] to b[]
        int b[] = Arrays.copyOf(a, 3);
        // Change b[] to verify that
        // b[] is different from a[]
        b[0]++;
 
        System.out.println("Contents of a[] ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
 
        System.out.println("\n\nContents of b[] ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
	}

}
