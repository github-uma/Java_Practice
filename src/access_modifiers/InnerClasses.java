package access_modifiers;

public class InnerClasses {

	public static void main(String[] args) {
		System.out.println("I am in public class main method");
	}

	private class A {
		void A() {
			System.out.println("I am in class A");
		}
	}

	static class B {
		void B() {
			System.out.println("I am in class B");
		}
	}

	protected class C {
		void C() {
			System.out.println("I am in class C");
		}
	}
}
