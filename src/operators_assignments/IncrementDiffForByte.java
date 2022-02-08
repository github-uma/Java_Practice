package operators_assignments;

public class IncrementDiffForByte {
// For integral type arithmetic type would be Max(int,Type of a,Type of B)
	public static void main(String[] args) {
		byte b1 = 10;
		b1++;
		System.out.println("Byte PostFix: "+b1);
		
		// Type mismatch: cannot convert from int to byte
		/*
		 byte b2 = 10;
		 b2=b2+1; // Type mismatch: cannot convert from int to byte
		*/
		
		byte b3 = 10;
		b3=(byte)(b3+1);
		System.out.println("Byte Add 1: "+b3);
		
		byte b4=10;
		short b5=20;
		//byte b6=b4+b5; // Type mismatch: cannot convert from int to byte
		byte b6=(byte)(b4+b5); // Type mismatch: cannot convert from int to byte
		System.out.println("Byte+short: "+b6);
	}

}
