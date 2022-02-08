package flowcontrol;

import java.util.Scanner;

public class IfElseStatementTest {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = read.nextInt();
		
		if((num % 2) == 0) {
			System.out.println("We are inside the true-block!");
			System.out.println("Given number is EVEN number!!");
		}
		else {
			System.out.println("We are inside the false-block!");
			System.out.println("Given number is ODD number!!");
		}
		
		System.out.println("We are outside the if-block!!!");
	}

}
