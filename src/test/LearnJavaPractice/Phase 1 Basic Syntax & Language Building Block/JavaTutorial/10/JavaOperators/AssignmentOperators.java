package A.JavaTutorial.J.JavaOperators;

public class AssignmentOperators {
    public static void main(String[] args) {
        //https://www.w3schools.com/java/java_operators_assign.asp
        //Java Assignment JavaOperators.Operators
        /*Assignment JavaOperators.Operators

        Assignment operators are used to assign values to variables.

        In the example below, we use the assignment operator (=) to assign the value 10
        to a variable called x:
         */

        //Example
        int x0 = 10;
        System.out.println("The assignment operator (=) to assign the value 10 to a variable called x:");
        System.out.println("int x0 = 10;");
        System.out.println(x0);
        System.out.println("---------------------------------------------------------------------------");


        //The addition assignment operator (+=) adds a value to a variable:

        //Example
        int a = 10;
        a += 5;
        System.out.println("The addition assignment operator (+=) adds a value to a variable:");
        System.out.println("int a = 10;");
        System.out.println("a += 5;");
        System.out.println(a);
        System.out.println("---------------------------------------------------------------------------");

        /* A list of all assignment operators:

        Operator    Example         Same As
        =           x = 5           x = 5
        +=          x += 3          x = x + 3
        -=          x -= 3          x = x - 3
        *=          x *= 3          x = x * 3
        /=          x /= 3          x = x / 3
        %=          x %= 3          x = x % 3
        &=          x &= 3          x = x & 3
        |=          x |= 3          x = x | 3
        ^=          x ^= 3          x = x ^ 3
        >>=         x >>= 3         x = x >> 3
        <<=         x <<= 3         x = x << 3
         */
        int x = 5;
        System.out.println("Operator     Example     Same As");
        System.out.println("=            x = 5      x = 5");
        System.out.println("int x = 5;");
        System.out.println(x);
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("+=           x1 += 3      x1 = x1 + 3");
        int x1 = 5;
        x1 += 3;
        System.out.println("int x1 = 5;");
        System.out.println("x1 += 3;");
        System.out.println(x1);
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("-=           x2 -= 3       x2 = x2 - 3");
        int x2 = 5;
        x2 -= 3;
        System.out.println("int x2 = 5;");
        System.out.println("x2 -= 3;");
        System.out.println(x2);
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("*=          x3 *= 3      x3 = x3 * 3");
        int x3 = 5;
        x3 *= 3;
        System.out.println("int x3 = 5");
        System.out.println("x3 *= 3;");
        System.out.println(x3);
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("/=          x4 /= 3      x4 = x4 / 3");
        double x4 = 5;
        x4 /= 3;
        System.out.println("double x4 = 5;");
        System.out.println("x4 /= 3;");
        System.out.println(x4);
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("%=          x5 %= 3      x5 = x5 % 3");
        int x5 = 5;
        x5 %= 3;
        System.out.println("int x5 = 5;");
        System.out.println("x5 %= 3;");
        System.out.println(x5);
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("&=          x6 &= 3      x6 = x6 & 3");
        int x6 = 5;
        x6 &= 3;
        System.out.println("int x6 = 5");
        System.out.println("x6 &= 3;");
        System.out.println(x6);
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("|=          x7 |= 3      x7 = x7 | 3");
        int x7 = 5;
        x7 |= 3;
        System.out.println("int x7 = 5;");
        System.out.println("x7 |= 3;");
        System.out.println(x7);
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("^=          x8 ^= 3     x8 = x8 ^ 3" );
        int x8 = 5;
        x8 ^= 3;
        System.out.println("int x8 = 5;");
        System.out.println("x8 ^= 3;");
        System.out.println(x8);
        System.out.println("---------------------------------------------------------------------------");

        System.out.println(">>=         x9 >>= 3    x9 = x9 >> 3");
        int x9 = 5;
        x9 >>= 3;
        System.out.println("int x9 = 5;");
        System.out.println("x9 >>= 3;");
        System.out.println(x9);
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("<<=         x10 <<= 3   x10 = x10 << 3");
        int x10 = 5;
        x10 <<=3;
        System.out.println("int x10 = 5;");
        System.out.println("x10 <<= 3;");
        System.out.println(x10);
        System.out.println("---------------------------------------------------------------------------");

        /*
        Note: Most assignment operators are just shorter ways of writing code.
        For example, x += 5 is the same as x = x + 5, but shorter and often easier to read.
         */

        /*
        Real-Life Example: Tracking Savings

        Assignment operators can also be used in real-life scenarios.
        For example, you can use the += operator to keep track of savings when you add money to an account:

         */

        //Example
        int savings = 100;
        savings += 50; //add 50 to savings
        System.out.println("int savings = 100;");
        System.out.println("savings += 50;// add 50 to savings");
        System.out.println("Total savings: " + savings);


















    }
}
