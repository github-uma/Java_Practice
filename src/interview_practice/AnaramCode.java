package interview_practice;

public class AnaramCode {

	static int NO_OF_CHARS = 256;
	// function to check if two strings are anagrams of each other
	static boolean areAnagram(char[] str1, char[] str2) {

		// Create a count array and initialize all values as 0
		int[] count = new int[NO_OF_CHARS];
		
		// For each character in input strings,increment count in the corresponding count array
		for (int i = 0; i < str1.length; i++) {
			// This might be useful if strings are in lower case only
			//count[str1[i] - 'a']++;
			//count[str2[i] - 'a']--;
			
			// This might be useful if strings are in lower/upper both only
			//count[str1[i] - 'A']++;
			//count[str2[i] - 'A']--;
			
			// It supports case insensitive as well special chars
			count[str1[i]]++;
			count[str2[i]]--;
		}

		// If both strings are of different length. Removing this condition will make the program fail for strings like "aaca" and "aca"
		if (str1.length != str2.length)
			return false;

		// See if there is any non-zero value in count array
		for (int i = 0; i < NO_OF_CHARS; i++)
			if (count[i] != 0) {
				return false;
			}
		return true;
	}

	// Driver code
	public static void main(String[] args) {
		char str1[] = "#aAbcd".toCharArray();
		char str2[] = "dbcA#a".toCharArray();

		// Function call
		if (areAnagram(str1, str2))
			System.out.print("The two strings are " + "anagram of each other");
		else
			System.out.print("The two strings are " + "not anagram of each other");
	}
}
