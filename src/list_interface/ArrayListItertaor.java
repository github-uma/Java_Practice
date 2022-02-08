package list_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListItertaor {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<Integer>( Arrays.asList(1,3,11,6,5));
		Iterator<Integer> itr=nums.iterator();
		
		while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
	}
}
