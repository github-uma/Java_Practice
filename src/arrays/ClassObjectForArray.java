package arrays;

//Java program to demonstrate
//Class Objects for Arrays

public class ClassObjectForArray
{
	/*Every array has an associated Class object, 
	 * shared with all other arrays with the same component type.
	 */

	public static void main(String args[])
	{
		long longArray[] = new long[3];
		int intArray[] = new int[3];
		byte byteArray[] = new byte[3];
		short shortsArray[] = new short[3];
		double doubleArray[] = new double[3];
		float floatArray[] = new float[3];

		// array of Strings
		String[] strArray = new String[3];

		System.out.println(longArray.getClass());
		System.out.println(longArray.getClass().getSuperclass());
		
		System.out.println(intArray.getClass());
		System.out.println(intArray.getClass().getSuperclass());
		
		System.out.println(byteArray.getClass());
		System.out.println(byteArray.getClass().getSuperclass());

		System.out.println(shortsArray.getClass());
		System.out.println(shortsArray.getClass().getSuperclass());
		
		System.out.println(doubleArray.getClass());
		System.out.println(doubleArray.getClass().getSuperclass());
		
		System.out.println(floatArray.getClass());
		System.out.println(floatArray.getClass().getSuperclass());

		System.out.println(strArray.getClass());
		//System.out.println(strArray.getClass().getSuperclass());
	}
}
