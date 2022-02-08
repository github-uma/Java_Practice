package arrays;

import java.util.Arrays;

public class abstractArrays {

	public static void main(String[] args) {
		// Only child class objects can be asSign to abstract array s
		Number[] n=new Number[10];
		n[0]=new Integer(10);
		n[1]=new Double(10.5);
		System.out.println(Arrays.toString(n));
	}

}
