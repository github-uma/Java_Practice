package data_types;

public class DemoLong {
	static int classVar;
	public static void main(String args[])
    {
		// class variable to represent default value
        System.out.println("Default value is "+classVar);

	   //local variables
        long a = 9223372036854775806l;
        // long is 16 bit value
        System.out.println(a);
  
        a++;
        System.out.println(a);
  
        // It overflows here because
        // long can hold values from -9223372036854775808 to 9223372036854775807
        a++;
        System.out.println(a);
  
        // Looping back within the range
        a++;
        System.out.println(a);
    }
}
