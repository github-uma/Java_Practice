package list_interface;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	// ArrayList,LinkedList,Vector can accept duplicate data and these use List interface list, as its name indicates, is an ordered sequence of elements.
	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Vijay");
		System.out.println(ll);
		
		// Add element at 0th index
		ll.addFirst("Ranjeet");
		System.out.println("Ranjeet at first "+ll);
		
		// Add element at nth index
		ll.add(2, "Kiran");
		System.out.println("Kiran at 2 "+ll);
		
		// Add element at last index
		ll.addLast("Nagesh");
		System.out.println("Nagesh at last "+ll);
		
		//update certain index value
		ll.set(3, "Kashvi");
		System.out.println("Kashvi 3 updated"+ll);
		
        // Instantiating list using Collections.addAll()
		Collections.addAll(ll, "Kashvi","Raju");
		System.out.println(ll);
		
		 // Create& initialize the list using singletonList method 
        List<String> strlist = Collections.singletonList("Java"); 
		System.out.println(strlist);
		
		if(ll.contains("Kashvi"))
		{
			System.out.println("Element exist in LinkedList");
		}
		
		// reverse the element order of mylist
        Collections.reverse(ll);
		System.out.println("reverse "+ll);
		
		// Iterate list if want to take any decision on it
		Iterator<String> itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
