package inheritance;

public class parentDemo {

	static
	{
		System.out.println("parent class static block");
	}
	String name = "Parent Name";

	public parentDemo() {
		System.out.println("Parent class construtor");
	}
	public void getData() {
		System.out.println("I am parent class method getData");
	}
	public void getFinalData() { // final and static keyword restrict child class to override parent method
		System.out.println("I am parent class final method getFinalData");
	}
	public int sum(int a, int b) {
		return a + b;
	}
	public float sum(float a, float b) {
		return a + b;
	}
}