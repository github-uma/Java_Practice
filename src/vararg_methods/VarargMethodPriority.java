package vararg_methods;

public class VarargMethodPriority {
	public static void m1(int x)
	{
		System.out.println("I am in general method");
	}
	public static void m1(int...x)
	{
		System.out.println("I am in vararg method");
	}
	/* Duplicate method m2(int[]) in type VarargMethodPriority
	public static void m2(int[] x)
	{
		System.out.println("I am in general array argument");
	}
	public static void m2(int...x)
	{
		System.out.println("I am in vararg argument");
	}
	*/
	public static void main(String[] args) {
		m1();
		m1(10);
		m1(10,45);
	}

}
