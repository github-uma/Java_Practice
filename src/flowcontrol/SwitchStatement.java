package flowcontrol;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Press any digit: ");

		int value = read.nextInt();

		switch (value) {
		case 0:
			System.out.println("ZERO");
			break;
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		default:
			System.out.println("Not a Digit or more than 9");
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		case 6:
			System.out.println("SIX");
			break;
		case 7:
			System.out.println("SEVEN");
			break;
		case 8:
			System.out.println("EIGHT");
			break;
		case 9:
			System.out.println("NINE");
			break;
		}

	}

}
