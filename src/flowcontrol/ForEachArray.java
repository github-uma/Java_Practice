package flowcontrol;

public class ForEachArray {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30 };
		for(int i:a)
		System.out.println("1-D Array:"+i);
		
		int[][] b= {{10,20,30},{40,50}};
		for(int[] x:b)
		{
			for(int y:x)
			{
				System.out.println("2-D Array:"+y);
			}
		}
	}

}
