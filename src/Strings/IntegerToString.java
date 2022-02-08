package Strings;
public class IntegerToString
{
    public static void main(String[] args) 
    {
        int i = 2015;
        String s1 = Integer.toString(i);
        String s2 = String.valueOf(i);
        
        System.out.println(s1);     //Output : 2015
        System.out.println(s2);     //Output : 2015

    }
}