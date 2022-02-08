package set_interface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	// HashSet,LinkedSet,Vector can accept duplicate data and these use List interface

	public static void main(String[] args) {
		 // Set demonstration using HashSet
        Set<String> hash_Set = new HashSet<String>();
  
        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");// Duplicate value wi be left
        hash_Set.add("Example");
        hash_Set.add("Set");
  
        System.out.println(hash_Set);
        System.out.println(hash_Set.contains("Geeks"));
        
        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
        System.out.println("Set a is "+a);
        
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
        System.out.println("Set b is "+b);

        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);
  
        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);
  
        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        
        System.out.print("Difference of the two Set(a-b)");
        System.out.println(difference);
        
       // Iterator
      Iterator<String> itr=hash_Set.iterator();
      System.out.print("Print using ierator");
      while(itr.hasNext())
      {
    	 System.out.println(itr.next());
      }
	}

}
