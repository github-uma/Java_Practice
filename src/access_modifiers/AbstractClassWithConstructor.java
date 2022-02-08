package access_modifiers;

//An abstract class with constructor
abstract class BaseConstructor {
	BaseConstructor()
 {
     System.out.println("Base Constructor Called");
 }
 abstract void fun();
}
class DerivedConstructor extends BaseConstructor {
	DerivedConstructor()
 {
     System.out.println("Derived Constructor Called");
 }
 void fun()
 {
     System.out.println("Derived fun() called");
 }
}
public class AbstractClassWithConstructor {
 public static void main(String args[])
 {
	 // Both will give same result
	 BaseConstructor b = new DerivedConstructor();
	 DerivedConstructor d = new DerivedConstructor();

 }
}