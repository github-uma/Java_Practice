package algorithms;

import java.util.Arrays;

public class LongestConsecativeInArray {

	public static void main(String[] args) {

	    int[] arr={0,1,1,1,1,1,1,0,0,1,1,0,0,1,1,1,1,1};
	    
	    int prevMaxCons=0;
	    int currentMaxCons=0;
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(arr[i]==1)
	    	{
	    		currentMaxCons++;
	    	}
	    	else
	    	{
	    		if(currentMaxCons>prevMaxCons)
	    		{
		    		prevMaxCons=currentMaxCons;
	    		}
	    		currentMaxCons=0;
	    	}
	    }
	    if(currentMaxCons<prevMaxCons)
	    {
	    	currentMaxCons=prevMaxCons;
	    }
    	System.out.println(currentMaxCons);
	}

}
