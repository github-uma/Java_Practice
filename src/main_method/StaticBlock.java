package main_method;

public class StaticBlock {
	String str1="Instance variable";
	static String str2="static variable";
	    // start of static block 
	    static{
	        System.out.println("static block called ");
	    }
	    // end of static block 
	    
	    public static void main(int x)
	    {
	    	System.out.println("I am in other static method");
	    }

	public static void main(String...args) // static method
	{
		System.out.println("Static method main");
		StaticBlock t=new StaticBlock();
		System.out.println("I am in "+str2);
		System.out.println("I am in "+t.str1);
		main(10);
	}
}
