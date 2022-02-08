package operators_assignments;

public class PreFixPostFixOperators {

	public static void main(String[] args) {
		double var1 = 5.9, var2 = 5;

        // var1 is increased to 6
        // Then, var2 is displayed
        System.out.println("PreFix: "+ ++var1);

        // 5 is displayed
        // Then, var2 is increased to 6.
        System.out.println("PostFix: "+ var2++);
	}

}
