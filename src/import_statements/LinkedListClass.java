package import_statements;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Apple");
		ll.add("Mango");
		ll.add("Cherry");
		ll.add("Orange");
		ll.add("Pear");
	    System.out.println("The LinkedList is: " + ll);
	    for(String str:ll)
	    {
	    	System.out.println(str);
	    }
	}
}
