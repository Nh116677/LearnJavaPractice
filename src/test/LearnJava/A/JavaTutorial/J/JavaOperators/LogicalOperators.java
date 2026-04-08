package A.JavaTutorial.JavaOperators;

public class LogicalOperators {
    public static void main(String[] args) {
        /*
        Java Logical JavaOperators.Operators

        Logical JavaOperators.Operators

        As with comparison operators, you can also test for true or false
        values with logical operators.

        Logical operators are used to determine the logic between variables or values,
        by combining multiple conditions::

        Operator    Name                Description                     Example
        --------------------------------------------------------------------------------
        &&          Logical and         Returns true if both            x < 5 && x < 10
                                        statements are true
        --------------------------------------------------------------------------------
        ||          Logical or          Returns true if one of the      x < 5 || x < 4
                                        statements is true
        --------------------------------------------------------------------------------
        !           Logical not         Reverse the result, returns     !(x < 5 && x < 10)
                                        false if the result is true
         */

        int x0= 5;
        System.out.println("&&  Logical and  => Returns true if both statements are true.");
        System.out.println("Is 5 greater than 3 and less than 10");
        System.out.println("int x0 = 5;");
        System.out.println("System.out.println(x0 > 3 && x0 < 10);");
        System.out.println(x0 > 3 && x0 < 10);//returns true because 5 is greater than 3 and 5 is less than 10
        System.out.println("The answer returns \"true\" because 5 is greater than 3 and 5 is less than 10.");
        System.out.println("---------------------------------------------------------------------------");

        int x1 = 5;
        System.out.println("|| Logical or  => Returns true if one of the statements is true.");
        System.out.println("Is one of the statements true?");
        System.out.println("int x1 = 5;");
        System.out.println("System.out.println(x > 3 || x < 4);");
        System.out.println(x1 > 3 || x1 <4);
        //returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4
        System.out.println("The answer returns \"true\" because one of the conditions are true (5 is greater than 3, but 5 is not less than 4.");
        System.out.println("---------------------------------------------------------------------------");

        int x2 = 5;
        System.out.println("! Logical not  => Reverse the result, returns false if the result is true.");
        System.out.println("Is one of the statement true?");
        System.out.println("int x2 = 5;");
        System.out.println("System.out.println(!(x2 > 3 && x2 < 10));");
        System.out.println(!(x2 > 3 && x2 < 10));
        //returns false because !(not) is used to reverse the result.
        System.out.println("The answer returns \"false\" because ! (not) is used to reverse the result");
        System.out.println("---------------------------------------------------------------------------");


        /*
        Real-Life Example: Login Check

        The example below shows how logical operators can be used in a real situation,
        e.g. when checking login status and access rights:
         */

        boolean isLoggedIn = true;
        boolean isAdmin = false;
        System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
        System.out.println("Has access: " + (isLoggedIn || isAdmin));
        System.out.println("Not logged in: " + (!isLoggedIn));
    }
}
