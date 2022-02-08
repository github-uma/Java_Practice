package flowcontrol;

public class ForStatementWithTrue {

	public static void main(String[] args) {
		for(int i=0;true;i++)
		{
			System.out.println("Loop body");
		}
		System.out.println("after Loop body"); //Unreachable code
	}

}
