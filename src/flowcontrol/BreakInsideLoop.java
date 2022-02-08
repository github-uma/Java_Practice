package flowcontrol;

public class BreakInsideLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=0; j<10; j++)
		{
		if(j==5)
		{
		break;
		}
		System.out.println(j);
		}
		System.out.println("outside of for loop");
	}

}
