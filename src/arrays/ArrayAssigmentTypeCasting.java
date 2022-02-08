package arrays;

import java.util.Arrays;

public class ArrayAssigmentTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40};
		int[] b=a;
		char[] ch= {'a','b','c'};
		char[] ch2=ch;
		//char[] ch3=a; /Type mismatch: cannot convert from int[] to char[]
		String[] str= {"abc","xyz"};
		Object[] obj=str;
		
		//Runnable[] varRunnable= {1,2,3};
		Number[] n= {1,2,3};
		Integer[] varInt=(Integer[])n; //Type mismatch: cannot convert from Number[] to Integer[]
		
		Integer[] x= {1,2,3};
		Number[] n2=(Number[])x;
		
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(ch2));
		System.out.println(Arrays.toString(obj));
		

	}

}
