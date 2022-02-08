package import_statements;

import static java.lang.Integer.MAX_VALUE; // Priority-2 c/p: 2147483647
import static java.lang.Byte.*; // Priority-3 o/p: 127

public class ImportMaxValue {
	static int MAX_VALUE = 999; // Priority-1 o/p: 999

	public static void main(String[] args) {
		System.out.println(MAX_VALUE);
	}
}
