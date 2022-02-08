package data_types;

public class DemoByte {
	static byte classVar;
	public static void main(String args[])
    {
		// class variable to represent default value
        System.out.println("Default value is "+classVar);

	   //local variables
        byte a = 126;
        // byte is 8 bit value
        System.out.println(a);
  
        a++;
        System.out.println(a);
  
        // It overflows here because
        // byte can hold values from -128 to 127
        a++;
        System.out.println(a);
  
        // Looping back within the range
        a++;
        System.out.println(a);
    }
}
