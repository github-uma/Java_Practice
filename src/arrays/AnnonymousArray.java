package arrays;

public class AnnonymousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(new int[] {1,2,3,4,5,6});
	}
	
	public static void sum(int[] x)
	{
		int total=0;
		for(int x1:x)
		{
			total=total+x1;
		}
		System.out.println("Sum: "+total);
	}

}
