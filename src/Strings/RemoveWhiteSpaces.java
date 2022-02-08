package Strings;

import java.util.Scanner;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string to be cleaned from white spaces...!");
		String inputString = sc.nextLine();
		//“\\s+” Vs “\\s” Both of these strings, when passed to replaceAll() method, produce the same result 
		//when the number of consecutive spaces increases, “\\s+” is slightly faster than “\\s”. Because, it replaces set of consecutive multiple spaces
		//with the replacement string at a time rather than replacing one by one.
		String stringWithoutSpaces = inputString.replaceAll("\\s+", "");
		System.out.println("Input String : " + inputString);
		System.out.println("Input String Without Spaces : " + stringWithoutSpaces);
		sc.close();
	}
}
