package Strings;
public class ImmutableString {

    public static void main(String[] args) {

        String name1 = "Java";// Creates string object in string Pool
        String name2 = "Java"; //Does not create string object in string pool as this "Java" literal already present there
        String name3 = name1; //name3 and name1 are pointing to same string literal "Java"
        String name4 = new String("Java");//creates new object in heap and does not create new object in string pool as it already present there
        String name5 = new String("Java");//creates new object in heap and does not create new object in string pool as it already present there

        System.out.println(name1 == name2);//prints true
        System.out.println(name1 == name3);//prints true
        System.out.println(name2 == name3);//prints true

        System.out.println(name1 == name4);//prints false
        System.out.println(name1 == name5);//prints false
        System.out.println(name4 == name5);//prints false
    }
}