package map_interface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		//declare and initialize LinkedHashMap
		   LinkedHashMap<Integer,String> num_map=new LinkedHashMap<Integer,String>();  
		   num_map.put(1,"ONE");  
		   num_map.put(2,"TWO");  
		   num_map.put(3,"THREE");
		   num_map.put(4,"FOUR");
		   num_map.put(5,"FIVE");
		   System.out.println("The contents of LinkedHashMap:");
		   
		   // retrieve the key-value pairs as set using entrySet & print each entry
		   // order will be remain same as per insertion
		   for(Map.Entry<Integer,String> entry:num_map.entrySet()){  
		        System.out.println(entry.getKey()+" "+entry.getValue());  
		   }  
	}

}
