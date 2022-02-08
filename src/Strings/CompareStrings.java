package Strings;

public class CompareStrings {

	public static void main(String[] args) {

		String s1="Hello";
		String s2="Hello";
		
		String str1=new String("Hello");
		String str2=new String("Hello");
		
		if(s1==s2)
		{
			System.out.println("If string with same assignment then no new object is ceated");
		}
		
		if(str1==str2)
		{
			System.out.println("There are two different objects crated for same string value");
		}
		
		if(str1.equals(str2))
		{
			System.out.println("Here two objects are there but thier value is comapared");
		}

	}

}
