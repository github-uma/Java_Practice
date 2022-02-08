package list_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayListDemo {
// ArrayList,LinkedList,Vector can accept duplicate data and these use List interface
// list, as its name indicates, is an ordered sequence of elements.

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(1);
		al.add(4);
		al.add(2);
		System.out.println(al);
		
		al.add(1, 5); // It add the elemet at index and rest all shifted to right
		System.out.println(al);
		
		al.set(1, 10); // it update the value at given index
		System.out.println(al);
		
		// Instantiating list using Collections.addAll()
	     Collections.addAll(al, 10, 20, 30, 40); 
	     
	     Collections.shuffle(al, new Random());
		 System.out.println("shuffle list "+al);
	     
		if(al.contains(30))
		{
			System.out.println("Element exist in ArrayList");
		}
		
		System.out.println(al.contains(2)); // It can be searched using contains and if found then true
		al.remove(1); // It will remove the element present at index
		
		// Create& initialize the list using singletonList method 
		// ollections.singletonList return an immutable list containing only the specified object. The returned list is serializable
        List<String> strlist = Collections.singletonList("Java"); 
		System.out.println("singletonList "+strlist);
		
		System.out.println(al);
		// reverse the element order of al
        Collections.reverse(al);
		System.out.println("reverse "+al);
		
		System.out.println(al.indexOf(2));
		System.out.println("isEmpty "+al.isEmpty());
		System.out.println("Size of list "+al.size());
		System.out.println("Value at index 2 is "+al.lastIndexOf(2)); // Last occurrence index of value 2
		al.clear();
		System.out.println("After clearing list "+al);
		System.out.println("isEmpty "+al.isEmpty());
	}
}
