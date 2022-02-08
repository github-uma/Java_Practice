package flowcontrol;

public class ContinueInsideLabel {

	public static void main(String[] args) {
		out:
			for(int i=1; i<=100; i++)
			{
			  System.out.println("outer");
			  for(int j=1; j<=100; j++)
			  {
			    System.out.println("nested");
			    if(j==2)
			    {
			    // continue; this will skip second(j==2) iteration of inner for loop only
			    continue out; // this will skip current iteration of both for loops
			    }
			  }
			}
	}

}
