package set_interface;
import java.util.ArrayList;
import java.util.HashSet;
 
public class RemoveDuplicateFromList
{
    public static void main(String[] args)
    {
        //Constructing An ArrayList
        ArrayList<String> listWithDuplicateElements = new ArrayList<String>();
        listWithDuplicateElements.add("JAVA");
        listWithDuplicateElements.add("J2EE");
        listWithDuplicateElements.add("JSP");
        listWithDuplicateElements.add("JAVA");
 
        //Printing listWithDuplicateElements
        System.out.print("ArrayList With Duplicate Elements :");
        System.out.println(listWithDuplicateElements);
 
        //Constructing HashSet using listWithDuplicateElements
        HashSet<String> set = new HashSet<String>(listWithDuplicateElements);
        System.out.println(set);
 
        //Constructing listWithoutDuplicateElements using set
        ArrayList<String> listWithoutDuplicateElements = new ArrayList<String>(set);
 
        //Printing listWithoutDuplicateElements
        System.out.print("ArrayList After Removing Duplicate Elements :");
        System.out.println(listWithoutDuplicateElements);
    }
}