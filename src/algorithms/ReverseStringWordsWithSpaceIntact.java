package algorithms;
public class ReverseStringWordsWithSpaceIntact {

	public static void main(String[] args) {

		String input = " Today is Tuesday ";
		System.out.println(input);
		String reverse = "";
		String[] arr = input.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String revWord = "";
			String word = arr[i];
			if (word.length() != 0) {
				for (int j = word.length() - 1; j >= 0; j--) {
					revWord = revWord + word.charAt(j);
				}
			}
			reverse = reverse + revWord + " ";
		}
		System.out.println(reverse);
	}

}
