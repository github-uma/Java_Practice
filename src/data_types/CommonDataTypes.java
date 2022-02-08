package data_types;

//Java program to demonstrate
//primitive data types in Java
public class CommonDataTypes {
	static boolean booleanVar;
	static char charVar;
	static byte byteVar;
	static short shortVar;
	static int intVar;
	static long longVar;
	static float floatVar;
	static double doubleVar;

	 public static void main(String args[])
	    {
		 System.out.println("====== Defuaul values for data types ======");
		 System.out.println("booleanVar: "+booleanVar);
		 System.out.println("charVar: "+charVar);
		 System.out.println("byteVar: "+byteVar);
		 System.out.println("shortVar: "+shortVar);
		 System.out.println("intVar: "+intVar);
		 System.out.println("longVar: "+longVar);
		 System.out.println("floatVar: "+floatVar);
		 System.out.println("doubleVar: "+doubleVar);

          // declaring character
	        char a = 'G';
	  
	        // Integer data type is generally
	        // used for numeric values
	        int i = 89;
	  
	        // use byte and short
	        // if memory is a constraint
	        byte b = 4;
	  
	        // this will give error as number is
	        // larger than byte range
	        // byte b1 = 7888888955;
	  
	        short s = 56; // short s='G' are same
	  
	        // this will give error as number is
	        // larger than short range
	        // short s1 = 87878787878;
	  
	        // by default fraction value
	        // is double in java
	        double d = 4.355453532;
	  
	        // for float use 'f' as suffix
	        float f = 4.7333434f;
		
	        System.out.println("====== Assigned values for data types ======");
  
	        System.out.println("char: " + a);
	        System.out.println("integer: " + i);
	        System.out.println("byte: " + b);
	        System.out.println("short: " + s);
	        System.out.println("float: " + f);
	        System.out.println("double: " + d);
	    }
}
