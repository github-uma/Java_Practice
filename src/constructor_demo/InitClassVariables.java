package constructor_demo;

public class InitClassVariables {
	String name; // Instance variable
	int age; // Instance variable
	static String city; // class variable
	static int countObjects;
	
	static { // all static variables can be initialize in static block
		city = "Ghaziabad"; 
		countObjects = 0;
	}
	

	public InitClassVariables(String name, int age) {
		this.name = name;
		this.age = age;
		countObjects++;
		//System.out.println(countObjects);
	}

	public void getData() {
		System.out.println(name + " " + age + " " + city);
		System.out.println(countObjects);
	}
	
	public static void getCity() // class level method
	{
		System.out.println(city);
	}

	public static void main(String[] args) {
		InitClassVariables obj1 = new InitClassVariables("Kishu", 6);
		InitClassVariables obj2 = new InitClassVariables("Kalash", 3);
		obj1.getData();
		obj2.getData();
		InitClassVariables.getCity();
		//System.out.println(countObjects);
	}

}
