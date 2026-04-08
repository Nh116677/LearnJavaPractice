package A.JavaTutorial.H.JavaDataTypes;

import java.util.ArrayList;

public class TheVarKeyword {
    public static void main(String[] args) {
        //https://www.w3schools.com/java/java_var.asp
        /*Java var Keyword

        The var Keyword

        The var keyword was introduced in Java 10 (released in 2018).

        The var keyword lets the compiler automatically detect
        the type of a variable based on the value you assign to it.

        This helps you write cleaner code and avoid repeating types,
        especially for long or complex types.

        For example, instead of writing int x = 5; you write:
         */

        //Example
        var x = 5; // x is an int
        System.out.println(x);System.out.println("---------------------------------------------------------------------------");
        System.out.println("The little boy is " + x + " years old.");
        System.out.println("---------------------------------------------------------------------------");

        /* When using var, the compiler understands that 5 is an int.

        Example with Different Types

        Here are some examples showing how var can be used to create
        variables of different types, based on the values you assign:
         */

        //Example
        var myNum = 5; // the compiler understands that 5 is an int.
        var myDouble = 9.98; // the compiler understands that 9.98 is a double.
        var myChar = 'D'; // the compiler understands that D is a char.
        var myBoolean = true; // the compiler understands that true is a boolean.
        var myString ="Hello Guest"; // the compiler understands that 'Hello Guest' is a String.
        var currency = '$';

        System.out.println(myNum);
        System.out.println("The first " + myNum + " will get a prize.");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(myDouble);
        System.out.println("I see that the price on this toy cost " + currency + myDouble + "." );
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(myBoolean);
        System.out.println("It is " + myBoolean + " that ice-cream melt fast in hot weather.");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(myString);
        System.out.println("Before you start your presentation, start by saying " + myString + ".");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("The milk cost " + currency + myNum + ", and the shrimps cost " + currency + myDouble + ".");
        System.out.println("---------------------------------------------------------------------------");

        /*Important Notes

        1. var only works when you assign a value at the same time ( you can't declare var x; without assigning a value);

         */

        //Example
        // var x; //This is an error without assigning a value
        var x1 = 5; // This is the correct way to declare var with a variable and assign it with a value.
        System.out.println(x1);
        System.out.println("---------------------------------------------------------------------------");

        /*
        2. Once the type is chosen, it stays the same.  See example below:
         */

        var x2 = 6; // x is now an int
        x2 = 10;    // declaring a different value after the first data value will update the new value for x2,
                    // using var at the beginning help the compiler declare x is still an int
        //x2 = 9.99; //Error - can't assign a double to an int.

        System.out.println(x2);
        System.out.println("The previous value for x2 was 6, since the new value has been changed, Java declare the updated value to " + x2 + "." );
        System.out.println("---------------------------------------------------------------------------");

        /* When to Use var

        For simple variables, it's usually clearer to write the type directly
        (int, double, char, etc.)

        But for more complex types such as ArrayList or HashMap, var can make the code shorter and easier to read:

         */
        //Example
        //Without var
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Tesla");
        cars.add("BMW");
        cars.add("Lexus");
        cars.add("Mercedes");
        System.out.println(cars);
        //System.out.println("We currently have these cars in stock " + cars ".");
        // The above print line shows an error message java: ')' or ',' expected
        //With var
        var cars1 = new ArrayList<String>();
        cars1.add("Toyota");
        cars1.add("Honda");
        cars1.add("Hyundai");
        cars1.add("Ford");
        System.out.println(cars1);

        /*
        Don't worry if the example above looks a bit  advanced
        - you will learn more about these complex types later. For now, just remember
        that var was introduced in Java 10, and if you work with others, you might see it in
        their code - so it's good to know what it means.
         */


    }
}
