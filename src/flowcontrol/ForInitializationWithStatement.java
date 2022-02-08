package flowcontrol;

public class ForInitializationWithStatement {

	public static void main(String[] args) {
		int i = 0;
		for (System.out.println("Initialization"); i < 2 ; System.out.println("Increment")) {
			System.out.println("For loop body");
			i++;
		}
	}
}
