package type_casting;

public class ExplicitTpeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 100.04; 
        
        //explicit type casting
        long l = (long)d;
          
        //explicit type casting 
        int i = (int)l; 
        System.out.println("Double value "+d);
          
        //fractional part lost
        System.out.println("Long value "+l); 
          
        //fractional part lost
        System.out.println("Int value "+i); 
	}

}
