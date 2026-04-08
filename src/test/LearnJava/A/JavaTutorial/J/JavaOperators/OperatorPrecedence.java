package A.JavaTutorial.JavaOperators;

public class OperatorPrecedence {
    public static void main(String[] args) {
        /*Java Operator Precedence

        Java Operator Precedence

        When a calculation contains more than one operator,
        Java follows order of operations rules to decide which part to calculate first.

        For example, multiplication happens before addition:

         */
        //Example
        int result1 = 2 + 3 * 4; // 2 + 12 = 14
        // BEDMAS Bracket, Exponent, Division, Multiply, Addition, Substraction
        int result2 = (2+3) * 4; //5 * 4 = 20
        System.out.println(result1);
        System.out.println(result2);

        /*Why Does This Happen?
        in 2 + 3 * 4, the multiplication is done first, so the answer is 14.
        If you want the addition to happen first, you must use parentheses: (2 + 3) * 4, which gives 20.

        Tip:  Always use parentheses () if you want to make sure the calculation
        is done in the order you expect.  It also makes your code easier to read.
         */

        /*Order of Operations

        Here are some common operations, from highest to lowest priority:
        - ()                -> Parentheses
        - *, /, %           -> Multiplication, Division, Modulus
        - +, -              -> Addition, Subtraction
        - >, <, >=, <=      -> Comparison
        - ==, !=, ->        -> Equality
        - &&                -> Logical AND
        - ||                -> Logical OR
        - =                 -> Assignment

        Another Example

        Subtraction and addition are done from left to right, unless you add parentheses:
         */
        //Example
        int result3 = 10 - 2 + 5; //(10-2) + 5 = 13
        int result4 = 10 - (2 + 5); // 10 - 7 = 3
        System.out.println(result3);
        System.out.println(result4);

        /*Remember: Parentheses always come first. Use them to control the order of your calculation.

         */
    }
}
