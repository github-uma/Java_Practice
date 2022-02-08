package data_types;

public class DemoInt {
	static int classVar;
	public static void main(String args[])
    {
		// class variable to represent default value
        System.out.println("Default value is "+classVar);

	   //local variables
        int a = 2147483647;
        // int is 16 bit value
        System.out.println(a);
  
        a++;
        System.out.println(a);
  
        // It overflows here because
        // int can hold values from -2147483648 to 2147483647
        a++;
        System.out.println(a);
  
        // Looping back within the range
        a++;
        System.out.println(a);
    }
}
