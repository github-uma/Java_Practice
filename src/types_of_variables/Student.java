package types_of_variables;

public class Student {
	
	static int count=0; // class variable
	String name; // instance variable
	int age; // instance variable
	static String collegeName = "ABES Engg.College";
	
	public Student(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
        count++;
	}
	
	  @Override
	  public String toString() {
	    return name+" "+age+" "+collegeName;
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1,student2,student3;
		student1=new Student("Ram",23);
		student2=new Student("Shyam",34);
		student3=new Student("Radha",16);
		
		System.out.println("Objects created: "+count);
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
	}
}
