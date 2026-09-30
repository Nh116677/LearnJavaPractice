package A.JavaTutorial.J.JavaOperators;

public class ComparisonOperators {
    public static void main(String[] args) {
        /*
        Java Comparison JavaOperators.Operators

        Comparison JavaOperators.Operators

        Comparison operators are used to compare two values (or variables).
        This is important in programming, because it helps us to find answers and make decisions.

        The return value of a comparison is either true or false.
        These values are known as Boolean values, and you will learn more about them in the
        JavaDataTypes.Booleans and If..Else chapter.

        In the following example, we use the greater than operator (>) to find out if 5 is greater than 3:

         */
        //Example
        int x = 5;
        int y = 3;
        System.out.println("int x = 5;");
        System.out.println("int y = 3;");
        System.out.println("System.out.println( x > y ) ;");
        System.out.println(x > y);// returns true, because 5 is higher than 3
        System.out.println("returns true, because 5 is higher than 3.");
        System.out.println("---------------------------------------------------------------------------");

        /* A list of all comparison operators:
        Operator        Name                        Example
        ==              Equal to                    x == y
        !=              Not equal to                x != y
        >               Greater than                x > y
        <               Less than                   x < y
        >=              Greater than or equal to    x >= y
        <=              Less than or equal to       x <= y
         */

        int x0 = 5;
        int y0 = 3;
        System.out.println("int x0 = 5;");
        System.out.println("int y0 = 3;");
        System.out.println("== Equal to operator");
        System.out.println("System.out.println(x == y)");
        System.out.println(x == y); //returns false because 5 is not equal to 3
        System.out.println("returns false, because 5 is not equal to 3.");
        System.out.println("---------------------------------------------------------------------------");

        int x1 = 5;
        int y1 = 3;
        System.out.println("int x1 = 5;");
        System.out.println("int y1 = 3;");
        System.out.println("!= Not equal to operator");
        System.out.println("System.out.println(x1 != y1);");//returns true because 5 is not equal to 3
        System.out.println(x1 != y1);
        System.out.println("returns true because 5 is not equal to 3");
        System.out.println("---------------------------------------------------------------------------");

        int x2 = 5;
        int y2 = 3;
        System.out.println("int x2 = 5;");
        System.out.println("int y2 = 3;");
        System.out.println("> Greater than operator");
        System.out.println("System.out.println(x2 > y2);");//returns true becasuse 5 is greater than 3
        System.out.println(x2 > y2);
        System.out.println("returns true because 5 is greater than 3");
        System.out.println("---------------------------------------------------------------------------");

        int x3 = 5;
        int y3 = 3;
        System.out.println("int x3 = 5;");
        System.out.println("int y3 = 3;");
        System.out.println("< Less than operator");
        System.out.println("System.out.println(x3 < y3);");//returns false because 5 is not less than 3
        System.out.println(x3 < y3);
        System.out.println("returns false because 5 is not less than 3");
        System.out.println("---------------------------------------------------------------------------");

        int x4 = 5;
        int y4 = 3;
        System.out.println("int x4 = 5;");
        System.out.println("int y4 = 3;");
        System.out.println("Greater than of equal to");
        System.out.println("System.out.println(x4 >= y4);");//returns true because 5 is greater, or equal to 3
        System.out.println(x4 >= y4);
        System.out.println("returns true because 5 is greater, or equal to 3");
        System.out.println("---------------------------------------------------------------------------");

        int x5 = 5;
        int y5 = 3;
        System.out.println("int x5 = 5;");
        System.out.println("int y5 = 3;");
        System.out.println("Less than or equal to");
        System.out.println("System.out.println(x5 <= y5);");//returns false because 5 is neither less than or equal to 3
        System.out.println(x5 <= y5);
        System.out.println("returns false because 5 is neither less than or equal to 3");
        System.out.println("---------------------------------------------------------------------------");

        /*
        Real-Life Examples

        Comparison operators are often used in real-world conditions,
        such as checking if a person is old enough to vote:

         */

        //Example

        int age = 18;
        System.out.println("If the person is older is 18 years or older, the anwser is true, and is able to vote.");
        System.out.println("(int age = 18);");
        System.out.println("(age >= 18);");
        System.out.println(age >= 18);//true, old enough to vote
        System.out.println("If the person is younger than 18, the answer is false, and is not able to vote.");
        System.out.println("(age < 18);");
        System.out.println(age < 18);//false, not old enough to vote
        System.out.println("---------------------------------------------------------------------------");

        //Another common use is checking if a password is long enough:
        //Example

        int passwordLength = 5;
        System.out.println("Is the password longer than 5 characters?");
        System.out.println("int passwordLength = 5;");
        System.out.println("System.out.println(passwordLength >= 8)");//false, too short
        System.out.println(passwordLength >= 8);
        System.out.println("false, password length is too short");
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("System.out.println(passwordLength < 8);");//true, needs more characters
        System.out.println(passwordLength < 8);
        System.out.println("true, password length needs more characters");










    }
}
