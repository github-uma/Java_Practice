package algorithms;

public class GCDOfTwoNumbers {
	public static void main(String[] args) {
		int n1 = 3, n2 = 6, gcd = 1;

	    for(int i = 1; i <= n1 && i <= n2; ++i) {
	      // Checks if i is factor of both integers
	      if(n1 % i == 0 && n2 % i == 0)
	        gcd = i;
	    }
	    int lcm = (n1 * n2) / gcd; // to get lcm we cn use gcd also
	    System.out.printf("The GCD of %d and %d is %d.", n1, n2, gcd);
	    System.out.printf("\nThe LCM of %d and %d is %d.", n1, n2, lcm);
	}
}
