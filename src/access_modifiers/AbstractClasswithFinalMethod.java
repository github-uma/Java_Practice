package access_modifiers;

abstract class BaseFinalMethod {
    final void fun()
    {
        System.out.println("Derived fun() called");
    }
}
  
class DerivedFinalMethod extends BaseFinalMethod {
}

public class AbstractClasswithFinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Base b = new Derived();
	        b.fun();
	}

}
