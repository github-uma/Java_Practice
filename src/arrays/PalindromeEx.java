package arrays;


public class PalindromeEx {

	public static void main(String[] args) {

		String s="1233221";
		boolean isPalidrome=true;
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
			{
				System.out.println("not a palimdrome");
				isPalidrome=false;
				break;
			}
		}
		if(isPalidrome==true)
		{
			System.out.println("Its a palidrome");
		}
	}

}
