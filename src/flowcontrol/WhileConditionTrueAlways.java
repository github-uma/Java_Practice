package flowcontrol;

public class WhileConditionTrueAlways {

	public static void main(String[] args) {
		while (true) {
			System.out.println("I am in while loop block now");
		}
		System.out.println("I am in while loop block now");//Unreachable code
	}
}
