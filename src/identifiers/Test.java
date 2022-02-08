package identifiers;

//Question: What does the following Java program print?
public class Test {
	public static void main(String[] args) {
		// Answer: this program will print 0.0 because of Double.MIN_VALUE is greater than 0
		System.out.println(Double.MIN_VALUE);
		System.out.println(0.0d);
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
	
		// Answer: this program will print -2147483648 because of Integer.MIN_VALUE is less than 0
		System.out.println(Integer.MIN_VALUE);
		System.out.println(0.0d);
		System.out.println(Math.min(Integer.MIN_VALUE, 0));
	}
}
