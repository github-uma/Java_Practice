package list_interface;

import java.util.ArrayList;

public class ArrayListInit
{
    public static void main(String[] args)
    {
    	//It creates an empty ArrayList with initial capacity of 10
        ArrayList<Integer> list1 = new ArrayList<Integer>(); 
        
        //It creates an empty ArrayList with supplied initial capacity.
        ArrayList<String> list2 = new ArrayList<String>(20);
        
        //It creates an ArrayList containing the elements of the supplied collection.
        ArrayList<Integer> list3 = new ArrayList<Integer>(list1);
    }	
}