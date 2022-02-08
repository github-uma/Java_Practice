package type_casting;

//Java Program to Implement Type Casting of the Datatype

//Importing input output classes
import java.io.*;

//Main class
public class TypeCasting {

 // Main driver method
 public static void main(String[] args)
 {
     // Declaring an Integer dataype
     int a = 3;

     // Casting to Large datatype
     double db = a;

     // Print and display the casted value
     System.out.println(db);

     // Narrow Casting conversion
     int db1 = (int)db;
       
     // Print an display narrow casted value
     System.out.println(db1);
 }
}