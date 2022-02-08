package algorithms;

public class printDiamond {
	public static void main(String[] args) {
		int row = 10;
		for (int i = 1; i <= row; i++) {
			for(int j=0;j<row-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}