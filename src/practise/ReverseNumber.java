package practise;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2345;
		int reverse = 0;
		while (num!=0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(reverse);
	}

}
