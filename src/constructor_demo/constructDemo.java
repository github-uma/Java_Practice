package constructor_demo;

public class constructDemo {
	 public constructDemo() 
	 { 
		 System.out.println(" I am in the constructor"); 
	 }
	 public constructDemo(int a, int b) {
		 System.out.println(" I am in the parameterized constructor"); 
		 int c=a+b;
		 System.out.println(c); 
	 } 
	 public constructDemo(String str) {
		 System.out.println(str); 
	 } 
	 
	 public void getdata() { 
		 System.out.println("I am the method"); 
		 } //will not return values //name of constructor should be the

	public static void main(String[] args) { 
		 constructDemo cd= new constructDemo(); // this will call default constructor
		 cd.getdata();
		 constructDemo cds= new constructDemo("hello"); //This will call constructor with string parameter
		 cds.getdata();
		 constructDemo c= new constructDemo(4,5); //This will call constructor with int parameters
		 c.getdata();
	}

}