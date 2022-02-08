package flowcontrol;

public class ForStatementWithFalse {

	public static void main(String[] args) {
		for(int i=0;false;i++)
		{
			System.out.println("Loop body"); //Unreachable code
		}
		System.out.println("after Loop body");
	}

}
