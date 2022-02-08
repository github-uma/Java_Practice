package types_of_variables;

public class localVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public int a=10; //Illegal modifier for parameter a; only final is permitted
		//protected int c=30; //Illegal modifier for parameter a; only final is permitted
		//private int c=30; //Illegal modifier for parameter a; only final is permitted
		//static int d=40; //Illegal modifier for parameter a; only final is permitted
		final int x; //Valid declaration
		x=60; // valid initialization
		System.out.println(x);
		//x=30; //The final local variable x may already have been assigned
	}

}
