package literals;

public class LiteralStringType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is full string";
		System.out.println(str);
		char[] ch = str.toCharArray();
		System.out.println(ch);
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.concat(" concatenation"));
		System.out.println(str.compareTo("This is full"));
		System.out.println(str.contains("This"));
		System.out.println(str.compareToIgnoreCase("This is full String"));
		System.out.println(str.indexOf("full"));



		}
}
