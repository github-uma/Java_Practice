package algorithms;

public class PrintLeftTrianglePattern {

	public static void main(String[] args) {
		int row = 4;
		// Outer loop work for rows
		for (int i = 0; i < row; i++) {
			// inner loop work for space
			for (int j = 2*(row - i); j >= 0; j--) {
				// prints space between two stars
				System.out.print(" ");
			}
			// inner loop for columns
			for (int k = 0; k <= i; k++) {
				// prints star
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
