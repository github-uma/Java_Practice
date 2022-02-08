package access_modifiers;

public class FinalMethod {
	   public final void display(){
	      System.out.println("Hello welcome to Tutorialspoint");
	   }
	   public static void main(String args[]){
	      new FinalMethod().display();
	   }
	   class Sample extends FinalMethod{
	      public void display(){ //Cannot override the final method from FinalMethod
	         System.out.println("hi");
	      }
	   }
	}