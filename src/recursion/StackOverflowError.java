package recursion;
// java.lang.StackOverflowError 
//The error java.lang.StackOverflowError is thrown to indicate that the application’s stack was exhausted, due to deep recursion i.e your program/script recurses too deeply.
public class StackOverflowError {
	void method1() {
		System.out.println("hello");  
		while (true) {
			method1();
		}
	}
	public static void main(String[] args) {
		StackOverflowError a1 = new StackOverflowError();
		a1.method1();
	}
}