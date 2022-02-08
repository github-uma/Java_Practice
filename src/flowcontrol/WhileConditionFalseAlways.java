package flowcontrol;

public class WhileConditionFalseAlways {
	public static void main(String[] args) {
		while (false) {
			System.out.println("I am in while loop block now"); // Unreachable code
		}
		System.out.println("I am out of while loop block now");//Unreachable code
	}
}
