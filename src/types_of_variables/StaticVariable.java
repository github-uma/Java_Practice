package types_of_variables;

public class StaticVariable {

	int x=10;
	static int y=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable t1=new StaticVariable();
		t1.x=888;
		t1.y=999;
		StaticVariable t2=new StaticVariable();
		//If static variable change by any object then it will reflect in all due to common sharing
		System.out.println(t1.x+"----"+t1.y);
		System.out.println(t2.x+"----"+t2.y);
	}
}
