package A.JavaTutorial;

public class TypeCasting {
    public static void main(String[] args) {
        //https://www.w3schools.com/java/java_type_casting.asp
        //Java Type Casting
        /*Java Type Casting
        Type casting means converting one data type into another. For example, turning an int into a double.

        In Java, there are two main types of casting:

        -Widening Casting (automatic) - converting a smaller type to a larger type size.
        byte -> short -> char -> int -> long -> float -> double

        -Narrowing Casting (manual) - converting a larger type to a smaller type size.
        double -> float -> long -> int -> char -> short -> byte
         */

        /*Widening Casting
        Widening casting is done automatically when passing a smaller size type into a larger size type.

        This works because there is no risk of losing information.  For example, an int value can safely fit
        inside a double:
        */

        //Example

        int myInt = 9;
        double myDouble = myInt; //Automatic casting: int to double
        System.out.println(myInt);// Output 9
        System.out.println(myDouble);// Output 9.0

        /*Narrowing Casting

        Narrowing casting must be done manually by placing the type in parentheses() in front of the value.

        This is required because narrowing may result in data loss
        (For example, dropping decimals when converting a double to an int).
         */

        //Example
        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble1;//Manual casting: double to int
        System.out.println(myDouble1);//Outputs 9.78
        System.out.println(myInt1);//Outputs 9

        /*Real-Life Example

        Here is a real-life example of type casting.
        We calculate the percentage of a user's score in relation to the maximum score in a game.
        We use type casting to make sure that the result is a floating-point value,
        rather than an integer.
         */

        //Example
        //Set the maximum possible score in the game to 500
        int maxScore = 500;

        //The actual score of the user
        int userScore = 423;

        /*Calculate the percentage of the user's score in relation to the maximum available score.
        Convert userScore to double to make sure that the division is accurate */

        double percentage = (double) userScore/maxScore * 100.0d;
        System.out.println("User's percentage is " +percentage);



    }

}

