package algorithms;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LongestRepeatingCharUsingMap {
	
	public static Map<Character, Integer> repeatingChars(String str)
	{
		Map<Character,Integer> hashMap = new HashMap<Character,Integer>();
		int prevMax=0,currentMax=1;
		char currentChar=str.charAt(0);
		char prevChar=currentChar;
		
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1)) {
				currentMax++;
			}
			else if(currentMax>=prevMax || i<str.length()-1)
			{
				prevMax=currentMax;
				prevChar=str.charAt(i);
				hashMap.put(currentChar, currentMax);
				
				currentMax=1;
				currentChar=str.charAt(i+1);
			}
		}
		if(currentMax>=prevMax)
		{
			hashMap.put(currentChar, currentMax);
		}
		else
		{
			hashMap.put(prevChar, prevMax);
		}
		int maxValueInMap=(Collections.max(hashMap.values())); 

		// Get the iterator over the HashMap
        Iterator<Map.Entry<Character, Integer> >
            iterator = hashMap.entrySet().iterator();
        
        // Iterate over the HashMap
        while (iterator.hasNext()) {
            // Get the entry at this iteration
            Map.Entry<Character, Integer> entry = iterator.next();
  
            // Check if this value is the required value
            if (maxValueInMap!=entry.getValue()) {
                iterator.remove();
            }
        }
		return hashMap;
	}
	
	public static void main(String[] args) {

		String str="aaabcdhjjjkkkk";
	    System.out.println(repeatingChars(str)); 
	}
}
