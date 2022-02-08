package package_protected;

public class Test extends TestProtected {

	public static void main(String[] args) {

		Test obj=new Test();
		System.out.println(obj.protectedNum);
		obj.getData();
	}

}
