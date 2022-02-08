package flowcontrol;

import java.util.Scanner;

public class SwitchWithoutBreak {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Press any digit: ");

		int value = read.nextInt();
		switch (value) {
		case 0:
			System.out.println("ZERO");
		case 1:
			System.out.println("ONE");
		case 2:
			System.out.println("TWO");
		case 3:
			System.out.println("THREE");
		default:
			System.out.println("Not a Digit or more than 9");
		case 4:
			System.out.println("FOUR");
		case 5:
			System.out.println("FIVE");
		case 6:
			System.out.println("SIX");
		case 7:
			System.out.println("SEVEN");
		case 8:
			System.out.println("EIGHT");
		case 9:
			System.out.println("NINE");
		}
	}
}
