package interfaces;

public class ImplemtsClass implements InterfaceA,InterfaceB {

	public static void main(String[] args) {

		ImplemtsClass ic=new ImplemtsClass();
		System.out.println(ic.a);
		System.out.println(ic.b);
		
		ic.method1();
		ic.method2();
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Interface1 is called");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Interface2 is called");

	}

}
