package Execution_Process;

public class ExecutionOrder {
// Here Creating the Anonymous Block
	{
		System.out.println("Inside Ananymous Block");
	}
// Now Creating the Static Block in Class
	static {
		System.out.println("Inside Static Block");
	}
// Here Creating the Constructor of Class
	ExecutionOrder() {
		System.out.println("Inside default Constructor of Class");
	}
	ExecutionOrder(int x) {
		System.out.println("Inside parameterized Constructor of Class");
	}
	public static void demo() {
		      System.out.println("Hello this is an instance method");
	}
	public static void main(int args) {
	      System.out.println("Hello this is main method with int args");
	}
	public static void main(String[] args) {

		// Creating the Object of the Class
		ExecutionOrder obj = new ExecutionOrder();

		System.out.println("*******************");

		// Again Creating Object of Class
		ExecutionOrder obj1 = new ExecutionOrder(10);
		//obj1.demo(1);
	}
}
