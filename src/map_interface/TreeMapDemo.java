package map_interface;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapDemo {

	public static void main(String[] args) {

		/* This is how to declare TreeMap */
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();

		// Adding elements to TreeMap
		tmap.put(1, "Data1");
		tmap.put(23, "Data2");
		tmap.put(70, "Data3");
		tmap.put(4, "Data4");
		tmap.put(2, "Data5");

		// Display content using Iterator
		Set<Entry<Integer,String>> set = tmap.entrySet(); //create set of type entry
		for (Entry<Integer,String> entry : set) {
			System.out.println("key is: " + entry.getKey() + " & Value is: "+entry.getValue());
		}
	}

}
