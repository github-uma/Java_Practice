package arrays;

import java.util.Arrays;

/*When we do “b = a”, we are actually assigning a reference to the array. Hence, 
 * if we make any change to one array, it would be reflected in other arrays as well 
 * because both a and b refer to the same location.
 */
public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray= {1,2,3,4};
		int[] copyArray=new int[intArray.length];
		System.out.println("intArray:"+Arrays.toString(intArray));
		System.out.println("Before copyArray:"+Arrays.toString(copyArray));
		copyArray=intArray;
		System.out.println("After copyArray:"+Arrays.toString(copyArray));
		intArray[0]++;
		System.out.println("After Modification intArray:"+Arrays.toString(intArray));
		System.out.println("After Modification copyArray:"+Arrays.toString(copyArray));
		copyArray[0]++;
		System.out.println("After Modification intArray:"+Arrays.toString(intArray));
		System.out.println("After Modification copyArray:"+Arrays.toString(copyArray));
	}

}
