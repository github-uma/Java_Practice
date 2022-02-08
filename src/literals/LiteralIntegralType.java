package literals;

public class LiteralIntegralType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;  // decimal
		int b=0325; // octal
		int c=0X123; // Hexadecimal
		int d=0b1010; // binary
// Any integral is automatically converted to decimal
		System.out.println("octal to decimal="+b);
		System.out.println("hexadecimal to decimal="+c);
		System.out.println("binary to decimal="+d);

		// conversion to binary for other integral types
		System.out.println("decimal to binary="+Integer.toBinaryString(a));
		System.out.println("octal to binary="+Integer.toBinaryString(b));
		System.out.println("hexadecimal to binary="+Integer.toBinaryString(c));
	}
}
