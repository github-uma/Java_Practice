import java.util.Arrays;

public class ReverseWordsOrder {

	public static void main(String[] args) {

		String input="A    B       F";
		System.out.println(input);
		String reverse="";
		String[] arr=input.split(" ");
		//System.out.println(Arrays.toString(arr));
		for(int i=arr.length-1;i>=0;i--)
		{
			reverse=reverse+arr[i]+" ";
		}
		System.out.println(reverse);
	}
}
