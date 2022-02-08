package exceptions;

public class Test {

	int a = 10;
	int b = 0;
	int[] arr= {1,2,3};
	
	public void getData() {
		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
		} 
		catch(ArithmeticException e)
		{
			System.out.println("I am in ArithmeticException catch block");
		}
		catch(NullPointerException e)
		{
			System.out.println("I am in NullPointerException catch block");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("I am in ArrayIndexOutOfBoundsException catch block");
		}
		catch (Exception e) {
			System.out.println("I am in Excdption catch block");
			System.out.println(e.fillInStackTrace());
		}
		finally
		{
			System.out.println("finally will always runs");
			// we can use it to close browser if failed and remove cookie if needed
		}
	}

	public static void main(String[] args) {

		Test obj = new Test();
		obj.getData();
	}

}
