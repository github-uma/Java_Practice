package algorithms;

public class JavaAppWithoutMain {
	static {
		System.out.println("HelloWorld, Java progarm without main method");
		int x = 20;
		// Can initialize static variables 
		System.out.println("Variable x : " + x);
		Thread t = new Thread() {
			@Override
			public void run() {
				System.out.println("Started thread from static initializer block");
				System.out.println("Thread Finished");
			}
		};
		t.start();
	}
	public static void main(String args[]) {
	// Empty main method
	}
}
