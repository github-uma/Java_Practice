package File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * * Java Program to demonstrate how to use Scanner and BufferedReader class in
 * * Java. * * @author WINDOWS 8 *
 */
public class ScannerVsBufferedReader {
	public static void main(String[] args) {
		// Using Scanner to read user input
		Scanner scnr = new Scanner(System.in);
		System.out.println("=======================================");
		System.out.println("You can use Scanner to read user input");
		System.out.println("=======================================");
		System.out.println("Please enter a String\n");
		String name = scnr.nextLine(); //this will parse the input into string
		System.out.println("You have entered " + name);
		System.out.println("Please enter an integer\n");
		int age = scnr.nextInt();//this will parse the input into interger
		System.out.println("You have entered " + age);
		scnr.close();
		// Using BufferedReader to read a file
		// System.out.println("=======================================");
		System.out.println("You can use BufferedReader to read a file");
		System.out.println("=======================================");
		FileReader fileReader;
		try {
			fileReader = new FileReader("./src/File_Handling/Transactions.csv");
			BufferedReader buffReader = new BufferedReader(fileReader);
			System.out.println("File contains following lines");
			String line = buffReader.readLine();
			String[] headers=line.split(",");
			System.out.println(Arrays.toString(headers));
			while (line != null) {
				//System.out.println(line);
				line = buffReader.readLine();
				System.out.println(line);

			}
			System.out.println("File is fully read by buffered reader");
			buffReader.close();
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}