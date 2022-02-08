package list_interface;
import java.util.ArrayList;
import java.util.Arrays;
 
public class ArrayListToArrayExample 
{   
    public static void main(String[] args) 
    {   
        ArrayList<String> list = new ArrayList<String>();
        list.add("JAVA");
        list.add("JSP");
        list.add("ANDROID");
        
        String[] array = new String[list.size()]; //declare array of list size
        list.toArray(array); // copy all list elements into array
        
        System.out.println(Arrays.toString(array));
    }   
}