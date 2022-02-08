package data_types;

public class DemoChar {
	public static void main(String[] args)
	{
		char  alpha = 'J';
		 
		char a = 65, b = 66, c = 67;
		System.out.println(alpha); // prints J
		 
		System.out.println(a); // Displays 65
		System.out.println(b); // Displays 66
		System.out.println(c); // Displays 67
		
		// Stores a single character/letter or ASCII values		
		for(char s=65;s<128;s++)
		{
			System.out.println(s);
		}
	}
}
