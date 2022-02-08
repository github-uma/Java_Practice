package flowcontrol;

public class ContinueInsideLoop {

	public static void main(String[] args) {
		//print all odd numbers
		System.out.println("print all odd numbers");
		for(int j=1; j<=100; j++)
		{
		if(j%2==0)
		{
		continue;
		}
		System.out.println(j);
		}
		//print all even numbers
		System.out.println("print all even numbers");
		for(int j=1; j<=100; j++)
		{
		if(j%2!=0)
		{
		continue;
		}
		System.out.println(j);
		}
	}

}
