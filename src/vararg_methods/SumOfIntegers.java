package vararg_methods;

public class SumOfIntegers {
	void m1(int... x) { // valid
	};
	void m2(int ... x) { // valid
	};
	void m3(int ...x) { // valid
	};
	void m4(int...x) { // valid
	};

	public static void sum(int... x) {
		int total = 0;
		for (int y : x) {
			total += y;
		}
		System.out.println("Sum of arguments: " + total);
	}

	public static void main(String[] args) {
		sum();
		sum(10, 20, 30);
		sum(35);
		sum(112, 334);
	}
}
