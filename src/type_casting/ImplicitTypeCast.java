package type_casting;

public class ImplicitTypeCast {

	public static void main(String[] args) {
		int i = 100;
		long l=i;
		float f=l;
		double d=f;
		
		System.out.println("int: "+i);
		System.out.println("long: "+l);
		System.out.println("float: "+f);
		System.out.println("double: "+d);
	}
}
