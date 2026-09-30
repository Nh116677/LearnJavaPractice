package Z.CodeChallenges;

public class JavaPrintVariables {
    public static void main(String[] args) {
        //https://www.w3schools.com/java/exercise.asp?x=xrcise_variables_print1
        //Java Print Variables

        //1. Which is the correct method to print the variable myNum.
        //int myNum = 10;
        //System.out._______(myNum);
        //display, echo, printvar, println, output
        int myNum = 10;
        String a = "display";
        String b = "echo";
        String c = "printvar";
        String d = "println";
        String e = "output";
        System.out.println("1. Which is the correct method to print the variable myNum");
        System.out.println("    a. display");
        System.out.println("    b. echo");
        System.out.println("    c. printvar");
        System.out.println("    d. println");
        System.out.println("    e. output");
        System.out.println("The correct answer is " + d + ".");
        System.out.println("---------------------------------------------------------------------------");


        //2. Which is the correct variable to complete the print statements.
        //String name = "Jenny";
        //System.out.println("Hello " + ________);

        String a1 = "\"name\"";
        String b1 = "name";
        String name = "Jenny";
        String c1 = "println";
        System.out.println("2. Which is the correct variable to complete the print statements.");
        System.out.println("String name " + "= \"Jenny\";");
        System.out.println("System.out.println(\"Hello \" +           )");
        System.out.println("Hello " + "__________");
        System.out.println("    a. \"name\"");
        System.out.println("    b. name");
        System.out.println("    c. Jenny");
        System.out.println("    d. println");
        System.out.println("The correct answer is " + b1 + ", to complete the print statement inside System.out.println(\"Hello \" + name).");
        System.out.println("Hello " + name + ".");
        System.out.println("---------------------------------------------------------------------------");

        //3. Which is correct expression to print the sum of x and y on one line.
        //int x = 5, y = 7;
        //System.out.println(           );
        int x = 5, y = 7;
        String a2 = "x";
        String b2 = "y";
        String c2 = "x + y";
        String d2 = "\"x + y\"";
        System.out.println("3. Which is correct expression to print the sum of x and y on one line.");
        System.out.println("int x = 5, y = 7");
        System.out.println("    a. x");
        System.out.println("    b. y");
        System.out.println("    c. x + y");
        System.out.println("    d. \"x + y\"");
        System.out.println("The correct answer is " + c2 + ", to print the sum of x and y on one line.");
        System.out.println(x + y);
        System.out.println("The answer to x + y = "  + (x + y) + ".");
        System.out.println("---------------------------------------------------------------------------");

        //4. Which is the correct expression to print Total:7.
        //int a3 = 3, b3 = 4;
        int a3 = 3, b3 = 4;
        String option0 = "a3";
        String option1 = "b3";
        String option2 = "(a3 + b3)";
        String option3 = "a3 + b3";
        String option4 = "\"a3 + b3\"";
        String answer = " + (a3 + b3) + \".\"";
        System.out.println("4. Which is the correct expression to print Total:7.");
        System.out.println("int a3 = 3, b3 = 4;");
        System.out.println("    a. a3");
        System.out.println("    b. b3");
        System.out.println("    c. (a3 + b3)");
        System.out.println("    d. a3 + b3");
        System.out.println("    d. \"a3 + b3\"");
        System.out.println("The correct answer is " + option2 +".");
        System.out.println("System.out.println(\"Total: \" + answer);");
        System.out.println("Total: " + (a3 +b3) + ".");






    }
}
