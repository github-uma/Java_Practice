package operators_assignments;

public class EqualityOperator {

	public static void main(String[] args) {
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		System.out.println(s1==s2);
		System.out.println(s1!=s2);
		System.out.println(true==true);
		System.out.println(s1.equals(s2));
	}
}
