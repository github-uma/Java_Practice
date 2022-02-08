package literals;

public class LiteralFloatingType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1 = 123.456; // treated as double
		double d2=0123.456; // treated as double
		double d3=0X123; // hex is treated as int while oX123.456 cannot be converted into floar
		
		System.out.println(d1+"---"+d2+"---"+d3);
// int can be assigned to floating point literals
		int x=100;
		float f=x;
		double d4=x;
		System.out.println(x+"---"+f+"---"+d4);
// double can be assigned in exponent form also
		float f2=1.21e3f;
		double d5=1.31e3;
		System.out.println(f2+"---"+d5);
	}

}
