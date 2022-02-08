package flowcontrol;

public class NestedLoop {

	public static void main(String[] args) {
		// Print number in incremented order
		int k=1;
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println();
		}
		
		System.out.println("Print number reverse of above output");
		int l=1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(l);
				System.out.print("\t");
				l++;
			}
			System.out.println();
		}
		
		System.out.println("Print number as multiple of 3");
		int m=1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(m*3);
				System.out.print("\t");
				m++;
			}
			System.out.println();
		}
	}

}
