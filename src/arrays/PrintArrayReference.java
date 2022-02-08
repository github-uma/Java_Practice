package arrays;

public class PrintArrayReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []intarray = new int[5];
        char []chararray = new char[5];
        float []floatarray = new float[5];
        String []stringArray = new String[5];
        
        System.out.println("Print array reference only");
        System.out.println(intarray);
        System.out.println(chararray);
        System.out.println(floatarray);
        System.out.println(stringArray);
        
        System.out.println("\nPrint array reference with some string");
        System.out.println("intarray:"+intarray);
        System.out.println("chararray="+chararray);
        System.out.println("floatarray"+floatarray);
        System.out.println("stringArray"+stringArray)
        ;
        intarray[0]=8;
        chararray[0]='b';
        floatarray[0]=10.56f;
        stringArray[0]="abc";
        
        System.out.println("\nPrint array reference after initialization");
        System.out.println("intarray:"+intarray);
        System.out.println("chararray="+chararray);
        System.out.println("floatarray"+floatarray);
        System.out.println("stringArray"+stringArray);
        
	}

}
