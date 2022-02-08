package Strings;

public class ReverseStringPaledrome {

	public static void main(String[] args) {

		String s="madam";
		String s2="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s2=s2+s.charAt(i);
		}
		System.out.println(s);
		System.out.println(s2);
		
		if(s.equals(s2))
		{
			System.out.println("Paledrome");
		}
		else
		{
			System.out.println("Not a Paledrome");
		}
	}

}
