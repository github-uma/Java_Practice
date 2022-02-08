package Pattern_Printing;

public class PrintTablePattern {

	public static void main(String[] args) {

		int tableTo=10;

		for(int i=1;i<=tableTo;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
}
