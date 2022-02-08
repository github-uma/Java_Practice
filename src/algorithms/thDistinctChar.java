package algorithms;

public class thDistinctChar {
	    public static String kthDistinct(String[] arr, int k) {
	    	
	    	int counter=0;
	    	String getchar="";
	    	for (int i=0;i<arr.length;i++)
	    	{
	    		int repeatTime=0; 
	    		for(int j=i;j<arr.length;j++)
	    		{
	    			if(arr[i]==arr[j]);
	    			{
	    				repeatTime++;
	    			}
	    		}
	    		if(repeatTime==1)
	    		{
	    			counter++;
	    			if(counter==k)
	    			{
	    				getchar=arr[i];
	    				System.out.println(getchar);
	    				break;
	    			}
	    		}
	    	}
	    	
	        return getchar;
	    }
	public static void main(String[] args) {

		String arr[] = {"d","b","c","b","c","a"}; 
		int k = 2;
		kthDistinct(arr,k);
	}

}
