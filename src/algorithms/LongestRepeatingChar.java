package algorithms;

public class LongestRepeatingChar {

	public static void main(String[] args) {

		String str="aaabcdhjjjkkkuuuuu";
		int prevMax=0,currentMax=1;
		char currentChar=str.charAt(0);
		char prevChar=currentChar;
		
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1)) {
				currentMax++;
			}
			else if(currentMax>prevMax || i<str.length()-1)
			{
				prevMax=currentMax;
				currentMax=1;
				prevChar=str.charAt(i);
				currentChar=str.charAt(i+1);
			}
		}
		if(currentMax>=prevMax)
		{
			System.out.println(currentMax+" "+currentChar);
		}
		else
		{
			System.out.println(prevMax+" "+prevChar);
		}
	}
}
