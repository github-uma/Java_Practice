package algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class SearchUniqueNumber {

	public static void main(String[] args) {
		// Print unique number from the list- Amazon  
		//print the string in reverse
		int[] a= {4,5,5,5,4,6,6,9,4,10,11,7}; ;
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				System.out.println(a[i]+"-"+k);
				if(k==1)
				{
					System.out.println(a[i]+" is unique number in array");
				}
			}
		}
		System.out.println("Distinct array is printed as "+al);
	}
}
