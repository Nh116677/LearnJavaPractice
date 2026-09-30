package Z.CodeChallenges;

public class JavaOperators {
    public static void main(String[] args) {
        //https://www.w3schools.com/java/exercise.asp?x=xrcise_operators1
        //1.Which is the correct operator to add the numbers.
        //int sum = 5 _ 3 ;
        String a0 = "+";
        String a1 = "-";
        String a2 = "*";
        String a3 = "/";
        System.out.println("1.Which is the correct operator to add the numbers");
        System.out.println("int sum = 5 _ 3");
        System.out.println("    a. +");
        System.out.println("    b. -");
        System.out.println("    c. *");
        System.out.println("    d. /");
        System.out.println("The correct operator to add the number is " + a0 + ".");
        System.out.println("The filled in answer it is 'int sum = 5 " + a0 + " 3'.");
        System.out.println("---------------------------------------------------------------------------");


        //2.Which is the correct operator to perform division.
        //int result = 10 _ 2;
        String b0 = "/";
        String b1 = "*";
        String b2 = "-";
        String b3 = "+";
        System.out.println("2. Which is the correct operator to perform division");
        System.out.println("int result = 10 _ 2;");
        System.out.println("    a. /");
        System.out.println("    b. *");
        System.out.println("    c. -");
        System.out.println("    d. +");
        System.out.println("The correct answer is 'int result = 10 " + b0 + " 2;'.");
        System.out.println("---------------------------------------------------------------------------");


        //3. JavaOperators.Operators are used to:
        String c0 ="Create constant variables and values";
        String c1 ="Perform operations on variables and values";
        String c2 ="Create objects and classes";
        String c3 ="Access comments to display them to the screen";
        System.out.println("3.Operator are used to:");
        System.out.println("    a. Create constant variables and values");
        System.out.println("    b. Perform operations on variables and values");
        System.out.println("    c. Create objects and classes");
        System.out.println("    d. Access comments to display them to the screen");
        System.out.println("The correct answer is '" +c1 + "'.");
        System.out.println("---------------------------------------------------------------------------");


        //4. Multiply 10 with 5, and print the result.
        //System.out.println(10 _ 5);
        int d0 = 10;
        int d1 = 5;
        int result = d0 * d1;
        System.out.println("4. Multiply 10 with 5, and print the result.");
        System.out.println("    - int d0 = 10;");
        System.out.println("    - int d1 = 5;");
        System.out.println("    - int result = d0 * d1;");
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("    Example a. System.out.println(d0 * d1);");
        System.out.println(d0 * d1);
        System.out.println("Therefore, the print result is: " + d0 * d1 + ".");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("    Example b. System.out.println(result)");
        System.out.println(result);
        System.out.println("Therefore, the print result is: " + result + ".");
        System.out.println("Both a. and b. input result the same output.");
        System.out.println("---------------------------------------------------------------------------");

        //5. Divide 10 by 5, and print the result.
        //System.out.println(10 _ 5);
        int e0 = 10;
        int e1 = 5;
        int result1 = e0 / e1;

        System.out.println("5. Divide 10 by 5, and print the result.");
        System.out.println("    - int e0 = 10;");
        System.out.println("    - int e1 = 5;");
        System.out.println("    - 10/5");
        System.out.println("    - int result1 = e0 / e1");
        System.out.println("    Example a. System.out.println(e0 / e1);");
        System.out.println(e0 / e1);
        System.out.println("Therefore, the print result is " + e0 / e1 + ".");
        System.out.println("    Example b. System.out.println(result1);");
        System.out.println(result1);
        System.out.println("Therefore, the print result is " + result1 + ".");
        System.out.println("    Example c. System.out.println(10/5);");
        System.out.println(10/5);
        System.out.println("Therefore, the print result is " + 10/5);
        System.out.println("Both Example a. , b. and c. input,  result the same output.");
        System.out.println("---------------------------------------------------------------------------");


        //6. Use the correct operator to increase the value of the variable x by 1.
        //int x = 10;
        // _ x;
        int x = 10;
        ++x;
        System.out.println("6. Use the correct operator to increase the value of the variable x by 1");
        System.out.println("   int x = 10;");
        System.out.println("   ++x;");
        System.out.println("    a. System.out.println(x)");
        System.out.println(x);
        System.out.println("    b. System.out.println(++x)");
        System.out.println(++x);
        System.out.println("---------------------------------------------------------------------------");


        //7. Use the addition assignment operator to add the value 5 to the variable x.
        //int x1 = 10;
        //x _ 5;
        int x1 = 10;
        x1 += 5;
        System.out.println("int x1 = 10;");
        System.out.println("x1 += 5;");
        System.out.println(x1);
        System.out.println("---------------------------------------------------------------------------");





    }
}
