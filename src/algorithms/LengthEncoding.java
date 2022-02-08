package algorithms;

public class LengthEncoding {

	public static String rle(String input) {
		int n = input.length();
		String str="";
	    int count = 1;
	        for (int i = 1; i < n; i++) {
	            if(input.charAt(i-1) == input.charAt(i)){
	              count++;
	            }
	            else
	            {
	            	str=str+input.charAt(i-1)+count;
	            	count=1;
	            }
	            if(i==n-1)
	            {
	            	str=str+input.charAt(i)+count;
	            }
	        }
			return str;
	  }
	public static void main(String[] args) {
		String str="aabbsassdddddwwwwwwwwb";
		System.out.println(rle(str));
	}
}
