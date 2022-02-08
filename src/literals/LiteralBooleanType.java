package literals;

public class LiteralBooleanType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b=true;
		int x = 10;
		String s="true";
		//if(x) when x Type mismatch: cannot convert from int to boolean.
		//if(s) when s Type mismatch: cannot convert from String to boolean
		if(b)
		{
			System.out.println("I am in true block");
		}
		else
		{
			System.out.println("I am in false block");
		}
		
		if(x==20)
		{
			System.out.println("I am in true block");
		}
		else
		{
			System.out.println("I am in false block");
		}
		if(s=="true")
		{
			System.out.println("I am in true block");
		}
		else
		{
			System.out.println("I am in false block");
		}
		
		if(b=false)
		{
			System.out.println("I am in true block");
		}
		else
		{
			System.out.println("I am in false block");
		}
		
	}

}
