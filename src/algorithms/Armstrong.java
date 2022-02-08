package algorithms;

public class Armstrong {
	public static void isArmstrong(int num) {
		int numOfDigits = String.valueOf(num).length();
		int copyOfNum = num;
		int sum = 0;

		while (copyOfNum > 0) {
			sum += Math.pow(copyOfNum % 10, numOfDigits);
			copyOfNum /= 10;
		}
		if (num == sum) {
			System.out.println(num + " is an ArmStrong number");
		} else {
			System.out.println(num + " is not an ArmStrong number");
		}
	}
	public static void main(String[] args) {
		isArmstrong(153);
		isArmstrong(371);
		isArmstrong(9474);
		isArmstrong(54748);
		isArmstrong(407);
		isArmstrong(1674);
	}
}