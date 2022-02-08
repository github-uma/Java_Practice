package arrays;

import java.util.Arrays;

/*When you clone a single dimensional array, such as Object[], 
 * a “deep copy” is performed with the new array containing copies 
 * of the original array’s elements as opposed to references.
 */

public class CloneSingleDimArrays {
	public static void main(String args[]) {
		int intArray[] = { 1, 2, 3 };

		int cloneArray[] = intArray.clone();

		// will print false as deep copy is created for one-dimensional array
		System.out.println(intArray == cloneArray);
		//Array elements are same in different reference location
	    System.out.println(intArray[0] == cloneArray[0]);
	    System.out.println(intArray[1] == cloneArray[1]);
	    System.out.println(intArray[2] == cloneArray[2]);
		System.out.println("intArray:" + Arrays.toString(intArray));
		System.out.println("cloneArray:" + Arrays.toString(cloneArray));
	}
}