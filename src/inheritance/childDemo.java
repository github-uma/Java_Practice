package inheritance;

public class childDemo extends parentDemo {

	String name = "Child Name";
	int num = 10;
	
	static
	{
		System.out.println("child class static block");
	}

	public childDemo() {
		super();// this should be always be at first line and will call parent constructor
		System.out.println("child class construtor");
	}

	public void getStringdata() {
		System.out.println("Parent variable " + super.name);// super class variables will be called using super keyword
															// if child class has same name
		System.out.println("child variable " + name);
	}

	public void getData() {
		super.getData(); // super class methods will be called using super keyword if child class has
							// same name
		System.out.println("I am in child class method ");
	}

	public void sumInstanceAnddLocalVariables() {
		int num = 5;
		System.out.println(num + this.num); // instance variables can be called using this if same name local variable
											// exist
	}

	public void getFinalData() { // final/static methods of parent class cannot be override
		System.out.println("I am child final method");
	}

	public static void main(String[] args) {

		childDemo cd = new childDemo();
		cd.getStringdata();
		//cd.getData();
		//cd.sumInstanceAnddLocalVariables();
		//cd.getFinalData();
	}
}