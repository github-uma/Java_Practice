package data_types;

// Java program to demonstrate boolean data type
  
class DemoBoolean {
	static boolean classVar;
    public static void main(String args[])
    {
    	// class variables default value
        System.out.println("Default value is "+classVar);
    	// local variables
        boolean b = true;
        if (b == true)
            System.out.println("I am in true block");
    }
}