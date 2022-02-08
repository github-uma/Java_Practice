package Collection_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class InitializeArraylistfromArray {

	public static void main(String[] args) {

		//Create arraylist in single statement
		ArrayList<String> names = new ArrayList<String>( Arrays.asList("alex", "brian", "charles") );
		System.out.println(names);
		
	}
}
