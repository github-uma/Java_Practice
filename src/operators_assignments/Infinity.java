package operators_assignments;

public class Infinity {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		double d=10.5;
		float f=-12.5f;
		
		System.out.println(d/b);
		System.out.println(f/b);
		System.out.println(a%b); // java.lang.ArithmeticException: / by zero
		System.out.println(a/b); // java.lang.ArithmeticException: / by zero
	}

}
