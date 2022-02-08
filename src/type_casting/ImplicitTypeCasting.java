package type_casting;

public class ImplicitTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 10;
		short s = 20;
		char c = 65;
		int i = 30;
		long l = 40;
		float f = 50.0f;
		double d = 60;

		System.out.println("Before:" + b + "--" + s + "--" + i + "--" + l + "--" + f + "--" + d + "--" + c);
		s = b;
		System.out.println("byte to short:" + b + "--" + s + "--" + i + "--" + l + "--" + f + "--" + d + "--" + c);
		i = s;
		System.out.println("short to int:" + b + "--" + s + "--" + i + "--" + l + "--" + f + "--" + d + "--" + c);
		i = c;
		System.out.println("char to int:" + b + "--" + s + "--" + i + "--" + l + "--" + f + "--" + d + "--" + c);
		l = i;
		System.out.println("int to long:" + b + "--" + s + "--" + i + "--" + l + "--" + f + "--" + d + "--" + c);
		f = l;
		System.out.println("long to float:" + b + "--" + s + "--" + i + "--" + l + "--" + f + "--" + d + "--" + c);
		d = f;
		System.out.println("float to short:" + b + "--" + s + "--" + i + "--" + l + "--" + f + "--" + d + "--" + c);
	}
}
