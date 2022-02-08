package Strings;

import java.util.Arrays;
import java.util.List;

public class Java8StringJoinMethod 
{
    public static void main(String[] args) 
    {
    	//Joining the strings
        String joinedString = String.join(" | ", "Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        System.out.println(joinedString);
        
        //Joining an array of strings
        String[] strArray = new String[] {"Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn"};
        String joinedStringArray = String.join(" | ", strArray);
        System.out.println(joinedStringArray);
        
        //Joining list of strings
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String joinedStringList = String.join(" | ", listOfStrings);
        System.out.println(joinedStringList);
    }
}