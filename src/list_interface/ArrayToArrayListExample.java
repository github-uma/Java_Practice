package list_interface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
 
public class ArrayToArrayListExample 
{   
    public static void main(String[] args) 
    {   
        String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
        
        //Using Arrays.asList() Method 
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(array));
        System.out.println(list1);
        
        //Using ArrayList.addAll() Method 
        ArrayList<String> list3 = new ArrayList<String>();
        list3.addAll(Arrays.asList(array));
        System.out.println(list3);
        
        //Using Collections.addAll() Method
        ArrayList<String> list2 = new ArrayList<String>();
        Collections.addAll(list2, array);
        System.out.println(list2);
        

    }   
}