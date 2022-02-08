package operators_assignments;

public class ShortCircuitDemo {

	public static void main(String[] args) {
		int x=10,y=15;
		if((++x>10) || (++y<15))// &->(11,17),|->(12,16), &&->(11,17), ||->(12,15)
		{
			++x;
			System.out.println("I am in true blck");
		}
		else
		{
			++y;
			System.out.println("I am in false blck");
		}
		System.out.println(x+"----"+y);
	}
}
