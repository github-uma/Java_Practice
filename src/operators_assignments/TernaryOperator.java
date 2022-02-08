package operators_assignments;

public class TernaryOperator {

	public static void main(String[] args) {
		int februaryDays = 29;
	    String result;

	    // ternary operator
	    result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
	    System.out.println(result);
	    
	    int a=10,b=20;
	    byte c1=(true)?40:50; 
	    byte c2=(false)?40:50; 
	    
	    byte c3=(byte) ((a<b)?40:50); //CE: Type mismatch: cannot convert from int to byte
	    byte c4=(byte) ((a<b)?40:50); //CE: Type mismatch: cannot convert from int to byte

	    final int x=10,y=20;
	    byte c5=(x<y)?40:50; 
	    byte c6=(x>y)?40:50; 
	    System.out.println(c1+"---"+c2+"---"+c3+"---"+c4+"---"+c5+"---"+c6);
	    //40---50---40---40---40---50
	}

}
