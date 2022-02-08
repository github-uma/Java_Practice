package practise;

public class CountCharOccurence {

	private static final String String = null;

	public static void main(String[] args) {
		
		int count=charCount("abcaaaaa",'a');
		System.out.println(count);
		
		System.out.println(printCount("abcaaaaa","a"));

	}

	private static int printCount(String str, String word) 
	{
		String str2=str.replace(word,"");
		return str.length()-str2.length();
	}

	private static int charCount(String str, char c) {
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==c)
			{
				count++;
			}
		}
		return count;
	}

}
