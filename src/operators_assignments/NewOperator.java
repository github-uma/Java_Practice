package operators_assignments;

import java.util.Arrays;

public class NewOperator {

	public NewOperator(String name)
	{
		System.out.println("Parameterized constructor is called using parameter: "+name);
	}
	public static void main(String[] args) {
		NewOperator obj=new NewOperator("Uday");
		
		double[] arr= new double[] {1.9,2.9,3.5,3.9};
		System.out.println(Arrays.toString(arr));
		
		// Finding the largest element
	      double max = arr[0];
	      for (int i = 1; i < arr.length; i++) {
	         if (arr[i] > max) max = arr[i];
	      }
	      System.out.println("Max is " + max);
	}

}
