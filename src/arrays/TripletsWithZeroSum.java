package arrays;
//Find all triplets with zero sum
// A simple Java program to find three elements whose sum is equal to zero
public class TripletsWithZeroSum {
// Prints all triplets in arr[] with 0 sum
	static void findTriplets(int[] arr) {
		int n = arr.length;
		boolean found = false;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.print("["+arr[i]+" "+arr[j]+" "+arr[k]+"]");
						System.out.print("\n");
						found = true;
					}
				}
			}
		}
		// If no triplet with 0 sum found in array
		if (found == false)
			System.out.println(" not exist ");
	}
	public static void main(String[] args) {
		int arr[] = { 0, -1, 2, -3, 1,3 };
		findTriplets(arr);
	}
}
