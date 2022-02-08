package Pattern_Printing;

public class EquilateralTriangleOpposite {

	public static void main(String[] args) {
		int tableTo = 10;
		for (int i = 1; i <= tableTo; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=tableTo- i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
