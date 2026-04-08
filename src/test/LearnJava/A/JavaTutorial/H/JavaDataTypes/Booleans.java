package A.JavaTutorial.JavaDataTypes;

public class Booleans {
    public static void main(String[] args) {
        //https://www.w3schools.com/java/java_data_types_boolean.asp
        /*Java Boolean Data Types

        Boolean Types
        Very often in programming, you will need a data type that can only have one of two values, like:
        - YES/NO
        - ON/OFF
        - TRUE/FALSE

        For this, Java has no boolean data types, which can only take the values true or false:
         */

        //Example
        boolean isJavaFun = true;
        boolean isBeefTasty = false;
        System.out.println(isJavaFun);//Outputs true
        System.out.println(isBeefTasty);//Outputs false
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Is Java fun: " + isJavaFun);
        System.out.println("Is beef tasty: " + isBeefTasty);
        System.out.println("---------------------------------------------------------------------------");

        /*Boolean values are mostly used for conditional testing.

        You will learn much more about booleans and conditions later in this tutorial.
         */

    }
}
