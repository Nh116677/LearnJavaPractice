package Phase1_JavaTutorial.ch07_JavaVariables;

public class Variables {
    public static void main(String[] args) {
        /* Java Variables

        Variables are containers for storing data values.

        In Java, there are different types of variables, for example:
        ~ String: stores text, such as "Hello".  String values are surrounded by double quotes.
        ~ int: stores integers (whole numbers), without decimals, such as 123 or -123
        ~ float: stores floating point numbers, with decimals, such as 19.99 or -19.99
        ~ char: stores single characters, such as 'a' or 'B'.  Char values are surrounded by single quotes
        ~ boolean: stores values with two states: true or false

        Declaring (Creating) Variables

        To create a variable in Java, you need to:
        ~ Choose a type (like int or String)
        ~ Give the variable a name (like x, age, or name)
        ~ Optionally assign it a value using =

        Here's the basic syntax:

        Syntax
         type variableName = value;

        For example, if you want to store some text, you can use a String:

        Example
        Create a variable called name of type String and assign it the value "John".
        Then we use println) to print the name variable:

         */

        String name = "John";
        System.out.println(name);

        /*

        Example
        Create a variable called myNum of the type int and assign it the value 15:

         */

        int myNum = 15;
        System.out.println(myNum);

        /*
        Example
        You can also declare a variable without assigning the value, and assign the value later.
         */

        int myNum1;
        myNum1 = 15;
        System.out.println(myNum1);

        /* Note that if you assign a new value to an existing variable, it will overwrite the previous value:
        Example

        Change the value myNum2 from 15 to 20:
         */

        int myNum2 = 15;
        myNum2 = 20; // myNum2 is now 20
        System.out.println(myNum2);

        /* Final Variables

        If you don't want others (or yourself) to overwrite existing values, use the final keyword
        (this will declare the variables as "final" or "constant", which means unchangeable and read-only);

         */

        //Example

        final int myNum3 = 15;
        // myNum3 = 20; //will generate an error: cannot assign a value to a final variable
        System.out.println(myNum3);

        /* Other Types
        A demonstration of how to declare variables of other types:
        */

        //Example
        int myNum4 = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
        System.out.println(myNum4);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);




    }
}
