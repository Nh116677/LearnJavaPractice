package A.JavaTutorial.JavaDataTypes;

public class Numbers {
    public static void main(String[] args) {
        //https://www.w3schools.com/java/java_data_types_numbers.asp
        /* Java JavaDataTypes.Numbers

        JavaDataTypes.Numbers
        ----------------------------------------------------------------------------------------------


        Primitive number types are divided into two groups:

        Integers types - stores whole numbers, positive or negative (such as 123 or -456),
        without decimals.  Valid types are byte, short, int and long.  Which type you should use,
        depends on the numeric value.

        Floating point types -  represents numbers with a fractional part,
        containing one or more decimals.  There are two types: float and double

        Even though there are many numeric types in Java,
        the most used for numbers are int (for whole numbers) and double (for floating point numbers).
        However, we will describe them all as you continue to read.

       ----------------------------------------------------------------------------------------------

        Integer Types

        Byte - The byte data type can store whole numbers from -128 to 127.
        This can be used instead of int or other integer types to save memory when
        you are certain that the value will be within -128 and 127:

        ----------------------------------------------------------------------------------------------

         */

        byte myNum = 100;
        System.out.println(myNum);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("The java data type in byte store whole numbers from -128 to 127, in this data it display the product order is " + myNum + ".");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");

        /*
        ----------------------------------------------------------------------------------------------
        Short

        The short data type can store whole number -32768 to 32767

         */
        //Example
        short myNum1 = 5000;
        System.out.println(myNum1);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("The java data type in short store whole numbers from -32768 to 32767, in this data we gain " + myNum1 + " viewers.");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");

        /*
        ----------------------------------------------------------------------------------------------
        Int

        The int data type can store whole numbers from -2147483648 to 2147483647.
        In general, and in our tutorial, the int data type is the preferred data type
        when we create variables with a numeric value.

         */
        //Example
        int myNum2 = 100000;
        System.out.println(myNum2);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("The java data type in int store whole numbers from -2147483648 to 2147483647. Based on our data we gain " + myNum2 + " viewers.");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");

        /*
         ----------------------------------------------------------------------------------------------
         Long

         The long data type can store whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
         This is used when int is not large enough to store the value.
         *****Note that you should end the value with an "L":

         */
        //Example
        long myNum3 = 234000453453453L;
        System.out.println(myNum3);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("The java data type in long store whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. Based on our data we gain " + myNum3 + " viewers.");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");

        /*Floating Point Types

        You should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.

        The float and double data types can store fractional numbers.
        Note that you should end the value with an "f" for floats and "d" for doubles:

       */
        //Float Example
        float myNum4 = 5.75f;
        System.out.println(myNum4);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("The price of the Matcha tonic beverage is $" + myNum4 + ".");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");

        //Double Example
        double myNum5 = 19.99d;
        System.out.println(myNum5);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("The ticket to see the elephant show is $" + myNum5 + ".");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");


        /*Use float or double?

        The precision of a floating point value indicates how many digits the value can have after the decimal point.
        The precision of float is only 6-7 decimal digits, while double variables have a precision of about 16 digits.

        Therefore, it is safer to use double for most calculations.
         */

        /*Scientifc JavaDataTypes.Numbers

        A floating point numbers can also be scientific number with an e to indicate the power of 10:
         */

        //Example
        float f1 = 35e3f;
        double d1 =12E4d;
        System.out.println(f1);
        System.out.println(d1);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("This car is price at $" + f1 + ".");
        System.out.println("This RV is price at $" + d1 + ".");






    }
}
