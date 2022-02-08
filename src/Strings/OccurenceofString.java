package Strings;

public class OccurenceofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="aiiibbbbb"; 
		System.out.println(str.length()-str.replace("i","").length());
		System.out.println(str.replace("i","").length());
	}
}
