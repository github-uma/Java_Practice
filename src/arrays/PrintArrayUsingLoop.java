package arrays;

import java.util.Arrays;

public class PrintArrayUsingLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayData[]= {4,7,2,5,10};
        // Print using for-each loop
		Arrays.sort(arrayData);
	    for (int element: arrayData) {
            System.out.println("Using for-each element:"+element);
         }
        // Print using for loop
	    for(int i=0;i<arrayData.length;i++)
	    {
	    	System.out.println("Using Loop: "+arrayData[i]);
	    }
	}

}
