package interview_practice;

public class MaxNumberInArray {

	int maxNum;

	public static int MaxNumber(int[] arr) {
		int maxNum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxNum)
				maxNum = arr[i];
		}
		return maxNum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 1, 3, 2, 0 };
		System.out.println(MaxNumber(arr));
	}
}
