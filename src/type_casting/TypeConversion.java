package type_casting;

//Java Pogram to illustrate Type Conversion

//Importing input output classes

//Main Class
class TypeConversionCompatible {

 // Main driver method
 public static void main(String[] args)
 {
     // Declaring and initializing variables to values
     // but to different data types
     long a = 3;
     byte b = 2;
     double c = 2.0;

     // Type Conversion
     // As long and byte data types are converted to
     // double return type
     double final_datatype = (a + b + c);

     // Printing the sum of all three initialized values
     System.out.print(final_datatype);
 }
}