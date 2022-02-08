package types_of_variables;

import java.util.Arrays;

public class ArrayVariableLevels {
	int[] a; // object level variable declaration only hence JVM will assign null value
	int[] b=new int[3]; // object level variable declaration and initialization
	static double[] c; // Class level variable declared only hence JVM will assign null(object)
	static double[] d=new double[4]; // Class level variable

	public static void main(String[] args) {
		ArrayVariableLevels arr=new ArrayVariableLevels();
		char[] x;
		char[] y=new char[4];
		// Print reference variables
		System.out.println("Object Variable Declared : "+Arrays.toString(arr.a));
		System.out.println("Object Variable Inirialized: "+Arrays.toString(arr.b));
		System.out.println("Class Variable Declared: "+Arrays.toString(c));
		System.out.println("Class Variable Inirialized: "+Arrays.toString(d)); 
		//System.out.println("Local Variable Declared: "+Arrays.toString(x)); //CE The local variable x may not have been initialized
		System.out.println("Locl Variable Inirialized: "+Arrays.toString(y));

		// Print elements of array variables
		System.out.println("Object Variable Inirialized: "+arr.b[0]);
		System.out.println("Class Variable Inirialized: "+d[0]); 
		System.out.println("Locl Variable Inirialized: "+y[0]);
		System.out.println("Class Variable Declared: "+c[0]); // NPE
		System.out.println("Object Variable Declared : "+arr.a[0]); // NPE
		//System.out.println("Local Variable Declared: "+x[0]); //CE The local variable x may not have been initialized
	}
}
