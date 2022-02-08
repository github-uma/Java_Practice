package Strings;
import java.util.*;

public class StrinToCharArrays {

	public static void main(String args[]) {
		String str = "GeeksForGeeks";

		// Creating array of string length
		char[] ch1 = new char[str.length()];

		// Copy character by character into array
		for (int i = 0; i < str.length(); i++) {
			ch1[i] = str.charAt(i);
		}
		
		// Creating array and Storing the array returned by toCharArray()
        char[] ch2 = str.toCharArray();

		// Printing content of char array using for-each loop
		for (char c : ch1) {
			System.out.println("ch1 "+c);
		}
		
		for (char c : ch2) {
			System.out.println("ch2 "+c);
		}
	}
}