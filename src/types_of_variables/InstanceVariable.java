package types_of_variables;

public class InstanceVariable {
	int x; // instance variable
	static double y=54; // static variab default will be 0 by JVMle
	
	void printInstanceVariable() {
		System.out.println("Print Instance Variable using method: "+x);
	}
	public static void main(String[] args) {
		//System.out.println("Instance Variable: "+x); //Cannot make a static reference to the non-static field x
		InstanceVariable t=new InstanceVariable();
		System.out.println("Print Instance Variable using object: "+t.x);
		System.out.println("Print static Variable using class: "+InstanceVariable.y);
		t.printInstanceVariable();
		System.out.println("Static Variable: "+y);
		int z=15;
		System.out.println("Local Variable: "+z);
	}
}
