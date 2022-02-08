package Strings;

public class CheckSubstring {

	public static boolean isSubstring(String str1, String str2) {
		int m = str1.length();
		int n = str2.length();
		boolean status = false;

		for (int i = 0; i <= m - n; i++) {
			int j;
			for (j = 0; j < n; j++) {
				if (str1.charAt(i + j) != str2.charAt(j))
				break;
			}
			if (n == j)
				status = true;
		}
		return status;
	}

	public static void main(String args[]) {
		String s1 = "life saver";
		String s2 = "life";
		System.out.println(isSubstring(s1, s2));

	}
}