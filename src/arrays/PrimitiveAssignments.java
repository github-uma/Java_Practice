package arrays;

import java.util.Arrays;
/*
 * automatic type casting order byte->short->int->long->->float->double or
 * char->int->long->->float->double
*/
public class PrimitiveAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10]; // declaration and creation
		a[0]=10; // int value assignment
		a[1]='a'; // char value assignment
		a[2]='\n'; // escape char value assignment
		short s=15;
		a[3]=s; // short value assignment
		byte b=126;
		a[4]=b; // byte value assignment
		long l=17l;
		//Type mismatch: cannot convert from long to int
		//a[5]=l; // invalid long value assignment
		float f=60.7f;
		//Type mismatch: cannot convert from float to int
		//a[6]=f; // invalid float value assignment
		double d=14.4;
		//Type mismatch: cannot convert from double to int
		//a[7]=d; // invalid double value assignment
		String str="abc";
		//Type mismatch: cannot convert from String to int
		//a[8]=str; // invalid String value assignment
		System.out.println(Arrays.toString(a));
  }

}
