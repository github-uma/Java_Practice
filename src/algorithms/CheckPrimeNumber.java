package algorithms;

public class CheckPrimeNumber {
	static boolean flag = false;

	static boolean isPrime(int num) {
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {
			// condition for non-prime number
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (num < 2) {
			flag = true;
			System.out.println(flag+"; "+num + " is not a prime number.");
		} else {
			if (!flag)
				System.out.println(flag+"; "+num+ " is a prime number.");
			else
				System.out.println(flag+"; "+num + " is not a prime number.");
		}
		return flag;

	}

	public static void main(String args[]) {
		isPrime(0);
		isPrime(1);
		isPrime(3);
		isPrime(8);
		isPrime(13);
		isPrime(17);
		isPrime(15);
		isPrime(111);
	}
}
