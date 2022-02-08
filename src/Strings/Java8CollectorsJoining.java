package Strings;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
public class Java8CollectorsJoining 
{
    public static void main(String[] args) 
    {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        
    	//Joining list of strings without delimiter
        String joinedString1 = listOfStrings.stream().collect(Collectors.joining());
        System.out.println(joinedString1);
        
        //Joining list of strings with delimiter
        String joinedString2 = listOfStrings.stream().collect(Collectors.joining(" | "));
        System.out.println(joinedString2);
        
        //oining list of strings with delimiter, prefix and suffix
        String joinedString3= listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println(joinedString3);
    }
}