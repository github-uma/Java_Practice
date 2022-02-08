package operators_assignments;

public class ArithmeticOperators {

	public static void main(String[] args) {
		byte b=10;
		short s=20;
		char c='a';
		int i=30;
		long l=40l;
		float f=10.5f;
		double d=20.5;
		System.out.println(b+s); // int
		System.out.println(s+c); // int
		System.out.println(b+c); // int
		System.out.println(i+c); // int
		System.out.println(i+l); // long
		System.out.println(f+l); // float
		System.out.println(f+d); // double
	}
}
