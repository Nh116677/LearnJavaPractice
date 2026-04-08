package A.JavaTutorial.JavaDataTypes;

public class DataTypes {
    public static void main(String[] args) {
        //https://www.w3schools.com/java/java_data_types.asp
        /*Java Data Types

        Java Data Types

        As explained in the previous chapter, a variable is Java must be specified data type:
         */

        //Example

        int myNum = 5; // Integer (whole number)
        float myFloatNum = 5.99f; // Floating point number
        char myLetter = 'D'; // Character
        boolean myBool = true; // Boolean
        String myText = "Hello"; // String

        System.out.println("My favourite number is " + myNum + ".");
        System.out.println("I purchased this drink for $" + myFloatNum + ".");
        System.out.println("It is " + myBool + " I am studying Java.");
        System.out.println("I want to say " + myText + " to my classmate.");

        /*
        Data types are divided into two groups:
        - Primitive data types - includes bytes, short, int, long, float, double, boolean and char
        - Non-primitive data types - such as String, Arrays and Classes
        (you will learn more about these is a later chapter)

       Primitive Data Types

       A primitive data types specifies the type of a variable and the kind of values it can hold.

       There are eight data types in Java:
       --------------------------------------------------------------------------------------------------
       Data Type    Description
       --------------------------------------------------------------------------------------------------
       byte         Stores whole numbers from -128 to 127
       short        Stores whole numbers from -32,768 to 32,767
       int          Stores whole numbers from -2,147,483,648 to 2,147,483,647
       long         Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
       float        Stores fractional numbers.  Sufficient for storing 6 to 7 decimal digits.
       double       Stores fractional numbers.  Sufficient for storing 15 to 16 decimal digits.
       boolean      Stores true or false values
       char         Stores a single character/letter or ASCII values
       --------------------------------------------------------------------------------------------------
         */
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%-15s %-65s%n", "Data Type", "Description");
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%-15s %-65s%n", "byte", "Stores whole numbers from -128 to 127");
        System.out.printf("%-15s %-65s%n", "short", "Stores whole numbers from -32,768 to 32,767");
        System.out.printf("%-15s %-65s%n", "int", "Stores whole numbers from -2,147,483,648 to 2,147,483,647");
        System.out.printf("%-15s %-65s%n", "long", "Stores whole numbers from very large range");
        System.out.printf("%-15s %-65s%n", "float", "Stores fractional numbers (6 to 7 digits)");
        System.out.printf("%-15s %-65s%n", "double", "Stores fractional numbers (15 to 16 digits)");
        System.out.printf("%-15s %-65s%n", "boolean", "Stores true or false values");
        System.out.printf("%-15s %-65s%n", "char", "Stores a single character or ASCII values");

        /* You Cannot Change the Types

        Once a variable is declared with a type, it cannot change to another type later in the program:

         */
        System.out.println("---------------------------------------------------------------------------");
        //Example
        int myNum1 = 5; //myNum is an int
        //  myNum1 = "Hello"; // Error: cannot assign a String to an int
        System.out.println(myNum1);
        String myText1 = "Hi"; // myText is a String
        //  myText1 = 123; // Error: cannot assign a number to a String
        System.out.println(myText1);
        System.out.println("---------------------------------------------------------------------------");

        /*
        Note: This rule makes Java safer, because the compiler will stop you if you try to mix up
        types by mistakes.

        If you really need to change between types, you must use type casting or conversion methods
        (For example, turning an int into a double).
         */
    }

    public static class JavaDataTypesCodeChallenges {
        //https://www.w3schools.com/java/java_challenges_data_types.asp
        /*Challenge:  Create a Student Report Card

        Test your understanding of Java Data Types by completing a small coding challenge.

        Instructions
        ----------------------------------------------------------------------------------
        Inside main(), complete the following steps:
        1. Declare an int named studentID and assign it a value.
        2. Declare a double named score and assign it a value (use a decimal)
        3. Declare a char named grade and assign it a single character (in single quotes)
        4. Print all three values

        ***Note: Remember semicolon.
         */
        public static void main(String[] args) {
            int studentID = 90234;
            double score = 99.99d;
            char grade = 'A';
            System.out.println(studentID);
            System.out.println(score);
            System.out.println(grade);
            System.out.println("---------------------------------------------------------------------------");


        }

    }
}
