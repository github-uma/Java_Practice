package StreamTutorials;

import java.util.ArrayList;

public class StartWithMethod {

	public static void main(String[] args) {

		ArrayList<String> list=new ArrayList();
		list.add("Abhishek");
		list.add("David");
		list.add("Ram");
		list.add("Anuj");
		list.add("Abhishek");
		list.add("Aman");
		
		int count=0;
		for(String str:list)
		{
			if(str.startsWith("A"))
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
