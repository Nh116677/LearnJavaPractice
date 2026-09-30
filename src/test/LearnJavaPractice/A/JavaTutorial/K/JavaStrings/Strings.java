package A.JavaTutorial.K.JavaStrings;

import java.sql.SQLOutput;

public class Strings {
    public static void main (String[] args){
      /*Java Strings

      Java Strings
      Strings are used for storing text.

      A String variable contains a collection of characters surrounded by double quotes (""):
      Example
      Create a variable of type String and assign it a value:
       */

        String greeting = "Hello";

        /*String Length

        A string in Java is actually an object, which means it contains methods
        that can perform certain operations on strings.

        For example, you can find the length of a string with the length() method:

        Example:
         */
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        //Example
        String text = "Hello World";
        System.out.println(text.toUpperCase()); //Outputs "HELLO WORLD"
        System.out.println(text.toLowerCase()); //Outputs "hello world"

        /* Finding a Character in a String

        In indexOf() method returns the index (the position) of the first occurrence
        of a specified text in a string (including whitespace):

         */

        //Example
        String text1 = "Please locate where 'locate' occurs!";
        System.out.println(text1.indexOf("locate"));//Outputs 7

        /*
        Java counts positions from zero.
        0 is the first position in a string, 1 is the second, 2 is the third...

        You can use the charAt() method to access a character at a specific position in a string:

         */
        //Example
        String text2 = "Hello";
        System.out.println(text2.charAt(0));//H
        System.out.println(text2.charAt(4));//o

        /*Comparing Strings
        To compare two strings, you can use the equals() method:

         */

        //Example
        String text3 = "Hello";
        String text4 = "Hello";

        String text5 = "Greetings";
        String text6 = "Great things";

        System.out.println(text3.equals(text4));//true
        System.out.println(text5.equals(text6));//false

        /*Removing Whitespace
        The trim() method removes whitespace from the beginning and the end of a string:
         */
        //Example
        String txt1 = "    Hello World   ";
        System.out.println("Before: " + txt1);







    }
}
