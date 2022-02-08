package arrays;

import java.util.Arrays;

public class CopyArrayByMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int a[] = { 1, 8, 3 };
		 
	        // Create an array b[] of same size as a[]
	        int b[] = new int[a.length];
	 
	        // Copy elements of a[] to b[]
	        System.arraycopy(a, 0, b, 0, 3);
	 
	        // Change b[] to verify that
	        // b[] is different from a[]
	        b[0]++;
	 
	        System.out.println("Contents of a[] ="+Arrays.toString(a));
	        System.out.println("\n\nContents of b[] ="+Arrays.toString(b));
	        
	        int c[]=new int[2];
	        System.arraycopy(a, 0, c, 0, 2);
	        
	        System.out.println("\n\nContents of c[] ="+Arrays.toString(c));
    }
}

