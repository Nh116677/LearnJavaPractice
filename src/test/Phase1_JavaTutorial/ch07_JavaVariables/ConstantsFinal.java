package Phase1_JavaTutorial.ch07_JavaVariables;

import java.sql.SQLOutput;

public class ConstantsFinal {
    public static void main(String[] args) {
        /* Java Constants (final)

        Constants (final keyword)

        When you do not want a variable's value to change, use the final keyword.
        A variable declared with final becomes a constant, which means unchangeable and read-only:

         */

        //Example
        final int myNum = 15;
        //myNum = 20; //Error: cannot assign a value to final variable 'myNum'

        /*  When to Use Final?

        You should declare variables as final when their values should never change.  For example, the number of minutes in an hour, or your birth year:

         */

        //Example
        final int MINUTES_PER_HOUR = 60;
        final int BIRTHYEAR = 1980;
        System.out.println(MINUTES_PER_HOUR);
        System.out.println(BIRTHYEAR);
    }
}
