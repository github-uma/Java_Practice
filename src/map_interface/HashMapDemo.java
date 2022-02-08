package map_interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(0, "Kishu");
		mp.put(1, "Kanha");
		mp.put(2, "Uma Shanker");
		mp.put(3, "Kishu");
		mp.put(4, null);

		System.out.println(mp);
		System.out.println(mp.get(1));
		
		Set s=mp.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			// Print the vale and ket separately 
			Map.Entry me=(Entry) itr.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
	}

}
