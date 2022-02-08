package arrays;

import java.util.Arrays;

public class ObjectTypeAssigment {
//We can assign declared object type or subclass in array of object's elements
	public static void main(String[] args) {
		 // Number is a abstract class from which all primitive wrapper classes inherited		
		Number[] n=new Number[10];
		byte b=15;
		n[0]=new Byte(b);
		short s=26;
		n[1]=new Short(s);
		char c='A';
		//n[2]=new Character(c);// Type mismatch: cannot convert from Character to Number
		n[3]=new Double(10.5);
		n[4]=new Integer(20);
		n[5]=new Float(25.7f);
		
		System.out.println(Arrays.deepToString(n));
	}

}
