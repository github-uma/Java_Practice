package Pattern_Printing;

public class PrintBorderOfSquare {

	public static void main(String[] args) {
		int tableTo = 10;
		for (int i = 1; i <= tableTo; i++) {
			for (int j = 1; j <= tableTo; j++) {
				if(i==1 || i==tableTo || j==1 || j==tableTo)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();

		}
	}
}
