package Z.CodeChallenges;

public class JavaDataTypeExcercise {
    public static void main(String[] args) {
        //Java Data Type Excercise
        // https://www.w3schools.com/java/exercise.asp?x=xrcise_data_types1
        //Which is the correct integer value to complete the code. int myNum = ____; "10", 10, 10.5, true
        String myNum = ("a.\"10\"");
        String myNum1 = ("b. 10");
        String myNum2 = ("c. 10.5");
        String myNum3 = ("d. true");
        System.out.println("1. Which is the correct integer value to complete the code. int myNum = ____;");
        System.out.println("    a. \"10\"");
        System.out.println("    b. 10");
        System.out.println("    c. 10.5");
        System.out.println("    d.true");
        System.out.println("The correct int myNum = ____ is '" +myNum1 + "'.");
        System.out.println("---------------------------------------------------------------------------");

        //Which is the correct decimal value to assign to the double variable.
        //10, 10.75, "10.75", false
        String num1 = ("a. 10");
        String num2 = ("b. 10.75");
        String num3 = ("c. \"10.75\"");
        String num4 = ("d. false");
        System.out.println("2. Which is the correct decimal value to assign to the double variable. double myDecimal = ____; System.out.println(myDecimal);");
        System.out.println("    a. 10");
        System.out.println("    b. 10.75");
        System.out.println("    c. \"10.75\"");
        System.out.println("    d. false");
        System.out.println("The correct answer is '" + num2 + "'.");
        System.out.println("---------------------------------------------------------------------------");

        //Which is the correct Java data type keyword to declare a variable that can store true or false.
        //int, boolean, String, double
        String a1 = "int";
        String a2 = "boolean";
        String a3 = "String";
        String a4 = "double";
        System.out.println("3. Which is the correct Java data type keyword to declare a variable that can store true or false. _______ is JavaFun = true; System.out.println(isJavaFun)");
        System.out.println("    a. int");
        System.out.println("    b. boolean");
        System.out.println("    c. String");
        System.out.println("    d. double");
        System.out.println("The correct answer is '" + a2 + "'.");
        System.out.println("---------------------------------------------------------------------------");

        //Which is an int in Java?
        String integers = "a. A data type representing integers";
        String strings = "b. A data type representing strings";
        String decimals = "c. A data type representing decimals";
        System.out.println("4. Which is an int in Java?: " + integers + "." );
        System.out.println("    a. A data type representing integers");
        System.out.println("    b. A data type representing strings");
        System.out.println("    c. A data type representing decimals");
        System.out.println(" The correct answer is '" + integers + "'.");
        System.out.println("---------------------------------------------------------------------------");

        //Add the correct data type for the following variables:
        String b1 = "int";
        String b2 = "float";
        String b3 = "char";
        String b4 = "boolean";
        String b5 = "String";

        System.out.println("5. Add the correct data type for the following variable");
        System.out.println("    1. ___ myNum = 9  ==> " + b1 + " myNum = 9");
        System.out.println("    2. _____ myFloatNum = 8.99f  ==> " + b2 + " myFloatNum = 8.99f");
        System.out.println("    3. ____ myLetter = 'A' ==> " + b3 + " myLetter = 'A'" );
        System.out.println("    4. _______ myBool = false  ==> " + b4 + " myBool = false" );
        System.out.println("    5. ______ myText = \"Hello World\"  ==> " + b5 + " myText = \"Hello World\" ");
        System.out.println("---------------------------------------------------------------------------");

        //byte, short, int, long, float, double, boolean, and char are called:
        String dataTypesP = "a. primitive data types";
        String dataTypesNP = "b. non-primitive data types";
        System.out.println("6. byte, short, int, long, float, double, boolean, and char are called: " );
        System.out.println("    a. primitive data types");
        System.out.println("    b. non-primitive data types");
        System.out.println("The correct is '"  + dataTypesP + "'.");
        System.out.println("---------------------------------------------------------------------------");

    }
}
