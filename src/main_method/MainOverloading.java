package main_method;

public class MainOverloading {
// JVM always give priority to main methis having string arguments
	public static void main(String[] args) {
		System.out.println("String array arguments");
		main(6);
	}
	
	public static void main(int args) {
		System.out.println("int array arguments");
	}
}
