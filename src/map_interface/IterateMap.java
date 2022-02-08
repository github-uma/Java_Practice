package map_interface;

import java.util.LinkedHashMap;
import java.util.Map;

public class IterateMap {

	public static void main(String[] args) {

		// Initialization of a LinkedHashMap using Generics
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

		// Inserting elements into Map using put() method
		hm.put(3, "Geeks");
		hm.put(2, "For");
		hm.put(1, "Geeks");

		 // using keySet() for iteration over keys
		System.out.println("using keySet() for iteration over keys");
        for (Integer key : hm.keySet())
            System.out.println("key: " + key);
         
        // using values() for iteration over values
		System.out.println("using values() for iteration over values");
        for (String value : hm.values())
            System.out.println("value: " + value);
		
		// For-each loop for traversal over Map
		System.out.println("For-each loop for traversal over Map");
		for (Map.Entry<Integer, String> mapElement : hm.entrySet()) {
			Integer key = mapElement.getKey();

			// Finding the value using getValue() method
			String value = mapElement.getValue();
			// Printing the key-value pairs
			System.out.println(key + " : " + value);
		}
	}
}
