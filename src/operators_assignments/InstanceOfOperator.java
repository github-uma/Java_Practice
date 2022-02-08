package operators_assignments;

public class InstanceOfOperator {

	public static void main(String[] args) {
		Object o=new Object();
		Thread t = new Thread();
		System.out.println(t instanceof Thread);
		System.out.println(t instanceof Object);
		System.out.println(t instanceof Runnable);
		System.out.println(null instanceof String);
		System.out.println(o instanceof Thread); // parent is never child of child
		//System.out.println(t instanceof String); //CE:Incompatible conditional operand types Thread and String

		Short s=20;
		System.out.println(s instanceof Short);
		System.out.println(s instanceof Number);
	}
}
