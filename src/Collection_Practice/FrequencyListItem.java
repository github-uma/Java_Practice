package Collection_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FrequencyListItem
{
    public static void main(String[] args)
    {
        // Let us create a list of strings
        List<String>  mylist = new ArrayList<String>();
        mylist.add("practice");
        mylist.add("code");
        mylist.add("code");
        mylist.add("quiz");
        mylist.add("quiz");
        mylist.add("quiz");
        
        String str="";
   
        // Here we are using frequency() method to get  frequency of element "code"
        //Set<String> uniqueList=new HashSet<String>(mylist);
        Set<String> uniqueList=new TreeSet<String>(mylist);

        for(String code:uniqueList)
        {
            int freq = Collections.frequency(mylist, code);
            str=str+code+freq;
        }
        System.out.println(str);
    }
}