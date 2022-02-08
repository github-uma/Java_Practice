package access_modifiers;

public class StaticVariables {

	int x = 10;
	static int y = 20;

	public static void main(String[] args) {
	    //Cannot make a static reference to the non-static field x
		//System.out.println(x + "----" + y);
		
		StaticVariables obj1 = new StaticVariables();
		obj1.x = 888; 
		obj1.y = 999; // will be available in all objects

		StaticVariables obj2 = new StaticVariables();
		System.out.println(obj2.x + "----" + obj2.y);
	}
}
