package flowcontrol;

public class BreakOutsideSwitchOrLoop {
	//The continue statement cannot be used outside the loop.
	public static void main(String[] args) {
		{
			int i=5;
			if(i==5)
			{
			break; // error: break cannot be used outside of a loop or a switch
			}
			}
	}

}
