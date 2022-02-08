package algorithms;

public class SquareRoot {

	public static double squareRoot(double num) {

		double t = 0;
		double sqrtroot = num / 2;
		while ((t - sqrtroot) != 0) {
			t = sqrtroot;
			sqrtroot = (t + (num / t)) / 2;
		}
		return sqrtroot;
	}

	public static void main(String[] args) {
		double[] inputs = { 2, 4, 100 };
		double[] expected_values = { 1.41421, 2, 10 };
		double threshold = 0.001;
		int failedTestCount = 0;
		for (int i = 0; i < inputs.length; i++) {
			if (Math.abs(squareRoot(inputs[i]) - expected_values[i]) > threshold) {
				System.out.printf("Test failed for %f, expected=%f, actual=%f\n", inputs[i], expected_values[i],
						squareRoot(inputs[i]));
				failedTestCount++;
			}
		}
		if (failedTestCount == 0) {
			System.out.println("All tests passed");
		} else {
			System.out.println(failedTestCount+" test failed out of "+ inputs.length);
		}
	}
}
