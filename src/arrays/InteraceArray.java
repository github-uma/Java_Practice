package arrays;

import java.util.Arrays;

public class InteraceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable[] r=new Runnable[10];
		r[0]=new Thread(); // Thread is implementation class object
		//String is not a implementation class object of Runnable
		//r[1]=new String("Uma"); /Type mismatch: cannot convert from String to Runnable
		System.out.println(Arrays.toString(r));
	}

}
