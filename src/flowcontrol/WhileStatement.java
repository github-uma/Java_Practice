package flowcontrol;

public class WhileStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 5;
		while (a > b) {
			System.out.println("Inside while loop: "+a+"---"+b);
			b++;
		}
		System.out.println("Outside while loop: "+a+"---"+b);
	}

}
