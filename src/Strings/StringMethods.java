package Strings;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		String s1="Java Training Tutorials";
		
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf("a")); // index of a in string
		
		System.out.println(s1.substring(3)); // starts from index 3
		System.out.println(s1.substring(2,8)); // between index 2 and 8

		String arr[]=s1.split(" ");// get all words of sentence in array
		System.out.println(Arrays.toString(arr));
		
		System.out.println(s1.replaceAll(" ", ""));
		System.out.println(s1.replaceAll("\\s+", ""));//replaces consecutive white spaces with a single underscore.

	}

}
