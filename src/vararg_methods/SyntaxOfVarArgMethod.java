package vararg_methods;

public class SyntaxOfVarArgMethod {

	public static void m1(int...i)
	{
		System.out.println("Var-Arg Method");
	}
	public static void main(String[] args) {
		m1();
		m1(10);
		m1(10,20,30);
		m1(40,50);
	}
}
