package literals;

public class LiteralCharType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'a';
		//char c2 = "b"; // Type mismatch: cannot convert from String to char
		//char c3 = c; // c cannot be resolved to a variable
		//char c4='abc'; //Invalid character constant
		char c5 = 97;
		//char c6 = 65536; // Type mismatch: cannot convert from int to char as value is greater than 65535
		char c7=0Xface; // hexadecimal
		char c8=061; // octal
		char c9='\u0031';
		char c10='\uabcd';
		char c11='\n';
		char c12='\t';

		System.out.println(c1+"---"+c5+"---"+c7+"---"+c8+"---"+c9+"---"+c10+"---"+c11+"---"+c12);
	}

}
