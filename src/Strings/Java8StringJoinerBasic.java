package Strings;
import java.util.StringJoiner;
 
public class Java8StringJoinerBasic 
{
    public static void main(String[] args) 
    {
        StringJoiner stringJoiner = new StringJoiner(" | ");//Joining the strings with delimiter
        stringJoiner.add("Facebook");
        stringJoiner.add("Twitter");
        stringJoiner.add("YouTube");
        stringJoiner.add("WhatsApp");
        stringJoiner.add("LinkedIn");
        System.out.println(stringJoiner);
    }
}