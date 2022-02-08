package interview_practice;

public class ReverseString {

	public static String reverseStringUsingStringBuilder(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}

	public static String reverseStringUsingCharArray(String str) {
		char ch[] = str.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println(reverseStringUsingStringBuilder("abcd"));
		System.out.println(reverseStringUsingCharArray("abcd"));

	}

}
