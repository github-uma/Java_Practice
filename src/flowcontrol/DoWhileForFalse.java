package flowcontrol;

public class DoWhileForFalse {

	public static void main(String[] args) {
		int a = 10, b = 20;
		do
			System.out.println("I am in do-while loop");
		while (a > b);
		System.out.println("I am after do-while loop");
	}

}
