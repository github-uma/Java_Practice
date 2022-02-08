package data_types;

public class DemoOverflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Overflow Example");
		int value1 = Integer.MAX_VALUE-1;
		System.out.println("Initil Value: "+value1);
		for(int i = 0; i < 4; i++, value1++) {
		    System.out.println(value1);
		}
		System.out.println("Underflow Example");
		int value2 = Integer.MIN_VALUE+1;
		System.out.println("Initil Value: "+value1);
		for(int i = 0; i < 4; i++, value2--) {
		    System.out.println(value2);
		}
	}

}
