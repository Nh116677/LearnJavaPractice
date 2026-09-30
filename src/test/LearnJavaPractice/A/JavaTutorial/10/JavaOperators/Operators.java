package A.JavaTutorial.J.JavaOperators;

public class Operators {
    public static void main(String[] args) {
        //https://www.w3schools.com/java/java_operators.asp
        //Java JavaOperators.Operators

        /*Java JavaOperators.Operators
        JavaOperators.Operators are used to perform operations on variables and values.

        In the example below, we use the  + operator to add together two values:

         */
        //Example
        int x = 100 + 5;
        System.out.println(x);

        System.out.println("---------------------------------------------------------------------------");

        /*Although the + operator is often used to add together two values, like in the example above,
        it can also be used to add together a variable and a value, or a variable and another variable:
         */
        //Example
        int sum1 = 100 + 50; // 150 (100 + 50)
        int sum2 = sum1 + 250; //400 (150 + 250)
        int sum3 = sum2 + sum2; //800 (400 + 400)
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println("---------------------------------------------------------------------------");

    }
}
