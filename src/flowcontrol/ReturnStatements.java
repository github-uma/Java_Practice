package flowcontrol;

public class ReturnStatements {

	public static void main(String[] args) 
		{
			ReturnStatements t = new ReturnStatements();
			int sum = t.addition(10,20);  //addition() method return integer value
			System.out.println("Sum = "+sum);
			t.show("Uma");  //show() method does not return any value 
		}

		int addition(int a, int b) {
			return a + b;
		}
	
		void show(String name) {
			System.out.println("Welcome " + name);
			return; // not returning anything, it is optional
		}
	}
