package list_interface;

import java.util.ArrayList;

public class IncreaseSizeofArray
{
    public static void main(String[] args)
    {
        //Now 'list' can hold 10 elements (Default Initial Capacity)
        ArrayList<String> list = new ArrayList<String>();
        
        //Now 'list' can hold 20 elements.
        list.ensureCapacity(20);
        
        list.add("Google");
        
        //reducing the current capacity to current size of an ArrayList.
        list.trimToSize(); 
        
    }
}