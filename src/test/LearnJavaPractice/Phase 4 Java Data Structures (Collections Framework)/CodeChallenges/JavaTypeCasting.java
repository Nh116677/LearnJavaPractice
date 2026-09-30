package Z.CodeChallenges;

public class JavaTypeCasting {
    public static void main(String[] args) {
        //https://www.w3schools.com/java/exercise.asp?x=xrcise_type_casting1
        //Java Type Casting
        //1.Which is the correct value to show widening casting (automatic type conversion).
        //int myInt = 9;
        //double myDouble = __________;
        String a0 = "myInt";
        String a1 = "(int)myInt";
        String a2 = "double";
        String a3 = "String";
        System.out.println("1. Which is the correct value to show widening casting (automatic type conversion");
        System.out.println("    a. myInt");
        System.out.println("    b. (int)myInt");
        System.out.println("    c. double");
        System.out.println("    d. String");
        System.out.println("The correct answer is " + a0 + ".");

        //2.Which is the correct syntax to perform narrowing casting (manual).
        //double myDouble = 9.78;
        //int myInt = _______ myDouble;
        String b0 = "(int)";
        String b1 = "(i)";
        String b2 = "int()";
        String b3 = "(Int)";
        System.out.println("2. Which is the correct syntax to perform narrowing casting (manual)");
        System.out.println("double myDouble = 9.78");
        System.out.println("int myInt = _______ myDouble");
        System.out.println("    a. (int)");
        System.out.println("    b. (i)");
        System.out.println("    c. int()");
        System.out.println("    d. (Int)");
        System.out.println("The correct answer is " + b0  + ".");
        System.out.println("The output is like this --> int myInt = " +  b0 +"myDouble.");
        System.out.println("---------------------------------------------------------------------------");


        //3.What is Type Casting?
        //When you accidentally uses the wrong data type.
        //When you assign a value of one primitive data type to another type.
        //A concept that occurs when you are using constant variables.
        String c0 = "When you accidentally uses the wrong data type.";
        String c1 = "When you assign a value of one primitive data type to another type.";
        String c2 = "A concept that occurs when you are using constant variables.";
        System.out.println("3.What is Type Casting");
        System.out.println("    a. When you accidentally uses the wrong data type.");
        System.out.println("    b. When you assign a value of one primitive data type to another type.");
        System.out.println("    c. A concept that occurs when you are using constant variables.");
        System.out.println("The correct answer to type casting is '" + c1 + "'.");
        System.out.println("---------------------------------------------------------------------------");

        //4.Passing a smaller size type to a larger size type, is called:
        String d0 = "Widening Casting";
        String d1 = "Narrowing Casting";
        String d2 = "Manual Casting";
        System.out.println("4. Passing a smaller size type to a larger size type, is called:");
        System.out.println("    a. Widening Casting");
        System.out.println("    b. Narrowing Casting");
        System.out.println("    c. Manual Casting");
        System.out.println("The correct answer is passing a smaller size type to a larger size type is called " + d0 + ".");

        //5.True or False
        //Narrowing casting must be done manually
        String e0 = "true";
        String e1 = "false";
        System.out.println("Narrowing casting must be done manually.");
        System.out.println("    a. true");
        System.out.println("    b. false");
        System.out.println("The correct answer is " + e0 + ".");

        //6. What is the output of the following code?
        //double myDouble = 5.99d;
        //int myInt = (int) myDouble;
        //System.out.println(myInt);
        String f0 = "Error";
        String f1 = "5.99";
        String f2 = "5";
        String f3 = "5.9";
        System.out.println("6. What is the output of the following code?");
        System.out.println("double myDouble = 5.99d;");
        System.out.println("int myInt = (int) myDouble;");
        System.out.println("System.out.println(myInt);");
        System.out.println("    a. Error");
        System.out.println("    b. 5.99");
        System.out.println("    c. 5");
        System.out.println("    d. 5.9");
        System.out.println("The correct output is " + f2 + ".");

        //7. Convert the following double type (myDouble) to an int type:
        //double myDouble = 9.78d;
        //int myInt = ______ myDouble;
        String g0 = "(int)";
        String g1 = "double myDouble = 9.78d";
        String g2 = "int myInt = ______ myDouble";
        System.out.println("7. Convert the following double type (myDouble) to an int type.");
        System.out.println(g1);
        System.out.println(g2);
        System.out.println("int myInt = " + g0 + "myDouble");




    }
}
