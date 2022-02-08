package access_modifiers;

public class FinalClass {
	   public final void display(){
	      System.out.println("Hello welcome to Tutorialspoint");
	   }
	   public static void main(String args[]){
	      new FinalClass().display();
	   }
	   class ChildClass extends FinalClass{
	      public void display(){ //Cannot override the final method from FinalMethod
	         System.out.println("hi");
	      }
	   }
	}