package Collection_Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AddElementsToListFromSet {

	public static void main(String[] args) {
		// Create arraylist with constructor
		ArrayList<String> names = new ArrayList<>();

		// 1. Add elements one by one
		names.add("alex");
		names.add("brian");
		names.add("charles");

		System.out.println("names: " + names);

		ArrayList<Integer> nums = new ArrayList<Integer>();

		// 1. Add elements one by one
		nums.add(11);
		nums.add(23);
		nums.add(45);

		System.out.println("nums: " + nums);

		Map<String, Integer> details = new HashMap<>();

		details.put("keanu", 23);
		details.put("max", 24);
		details.put("john", 53);

		for (Map.Entry<String, Integer> entry : details.entrySet()) {
			System.out.print(entry.getKey() + ":" + entry.getValue().toString() + " ");
		}

		// 2. Add elements from other collection
		names.addAll(details.keySet());

		System.out.println("\nnames after addAll():" + names);

		// 2. Add elements from other collection
		nums.addAll(details.values());

		System.out.println("nums after addAll():" + nums);
	}
}
