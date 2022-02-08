package algorithms;

public class PrintPattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 15; i++) {
			System.out.println(
					i % 3 == 0 && i % 5 == 0 ? "FIZZBUZZ" : i % 3 == 0 ? "FIZZ" : i % 5 == 0 ? "BUZZ" : i + "");
		}
	}
}
