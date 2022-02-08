package flowcontrol;

import java.util.Scanner;

public class NestedIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = read.nextInt();

		if (num < 100) {
			System.out.println("\nGiven number is below 100");
			if (num % 2 == 0)
				System.out.println("And it is EVEN");
			else
				System.out.println("And it is ODD");
		} else
			System.out.println("Given number is not below 100");

		System.out.println("\nWe are outside the if-block!!!");
	}

}
