package Collection_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class findDuplicates {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		// Form a list of numbers from 0-9.
		for (int i = 0; i < 10; i++) {
			list.add(String.valueOf(i));
		}

		// Insert a new set of numbers from 0-5.
		for (int i = 0; i < 5; i++) {
			list.add(String.valueOf(i));
		}

		System.out.println("Input list : " + list);
		System.out.println("\nFiltered duplicates : " + processList(list));
		System.out.println("\nFiltered duplicates : " + processListByMap(list));

	}

	public static Set<String> processList(List<String> listContainingDuplicates) {

		final Set<String> resultSet = new HashSet<String>();
		final Set<String> tempSet = new HashSet<String>();

		for (String yourInt : listContainingDuplicates) {
			if (!tempSet.add(yourInt)) {
				resultSet.add(yourInt);
			}
		}
		return resultSet;
	}
	
	public static Map<String,Integer> processListByMap(List<String> listContainingDuplicates) {

		Map<String,Integer> resultMap = new HashMap<String,Integer>();
		List<String> resultList=new ArrayList<String>();
        Set<String> distinct = new HashSet<>(listContainingDuplicates);

		for (String key: distinct) {
            if(Collections.frequency(listContainingDuplicates, key)==1)
			{
                resultMap.put(key, Collections.frequency(listContainingDuplicates, key));
                resultList.add(key);
			}
        }
		System.out.println(resultList.toString());
		return resultMap;
	}
}