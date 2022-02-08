package access_modifiers;

public abstract class AbstractMethosIllegalCombination {
	abstract void m1(); // Valid
	public abstract void m2(); // Valid
	//private abstract void m3(); // Invalid combination
	//public final abstract void m4(); // Invalid combination
	//public static abstract void m5(); // Invalid combination
	//static native abstract void m6(); // Invalid combination
	//public synchronized abstract void m7(); // Invalid combination
	//public strictfp abstract void m8(); // Invalid combination

	public static void main(String[] args) {
		
	}
}
