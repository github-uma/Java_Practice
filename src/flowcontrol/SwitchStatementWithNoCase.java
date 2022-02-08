package flowcontrol;

public class SwitchStatementWithNoCase {

	public static void main(String[] args) {
		int x = 10;
		switch (x) {
		default:
			System.out.println("Default block without case"); // it will not give error if default is not present
		}
		System.out.println("Outside switch statement");
	}
}
