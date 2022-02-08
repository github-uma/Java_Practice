package arrays;

public class SizeOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		System.out.println("Array length:"+a.length);
		//System.out.println(a.length()); // invalid used for string only
		String str="Dogra";
		System.out.println("String length:"+str.length());
		
		int[][] b=new int[3][4];
		System.out.println(b.length);
		System.out.println(b[0].length);
	}

}
