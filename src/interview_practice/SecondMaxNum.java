package interview_practice;

public class SecondMaxNum {
    public static void main(String args[]) {
    int[] arr={1,2,11,4,57,8,10,57,57,90,90,90};
    int firstHigh=0;
    int secondHiigh=0;
    
    for(int i=0;i<arr.length;i++)
    {
	    if(arr[i]>firstHigh)
	      {
	            secondHiigh=firstHigh;
	            firstHigh=arr[i];
	      }
	      else if(arr[i]>secondHiigh && arr[i]!=firstHigh)
	      {
	            secondHiigh=arr[i];
	      }
    }
      System.out.println( secondHiigh+" "+firstHigh);
  }
}