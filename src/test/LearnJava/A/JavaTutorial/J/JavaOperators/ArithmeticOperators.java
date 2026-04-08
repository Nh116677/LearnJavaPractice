package A.JavaTutorial.JavaOperators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        //https://www.w3schools.com/java/java_operators_arithmetic.asp
        //Java Arithmetic JavaOperators.Operators
        /*
        Arithmetic JavaOperators.Operators

        Arithmetic operators are used to perform common mathematical operations.

        Operator    Name            Description                                 Example
        -------------------------------------------------------------------------------
        +           Addition        Adds together two values                    x + y
        -           Subtraction     Subtracts one values from another           x - y

        *           Multiplication  Multiplies two values                       x * y
        /           Division        Divides one value by another                x / y
        %           Modulus         Returns the division remainder              x % y
        ++          Increment       Increases the value of a variable by 1      ++x
        --          Decrement       Decreases the value of the variable by 1    --x

         */
        //Here is an example using different arithmetic operators in one example:
        //Example
        int x = 10;
        int y = 3;
        int z = 5;
        System.out.println("Here is an example using different arithmetic operators in one example:");
        System.out.println("int x = 10;");
        System.out.println("int y = 3;");
        System.out.println("int z = 5;");
        System.out.println("System.out.println(x + y);");
        System.out.println(x + y); //13
        System.out.println("System.out.println(x - y);");
        System.out.println(x - y); //7
        System.out.println("System.out.println(x * y);");
        System.out.println(x * y); //30
        System.out.println("System.out.println(x / y);");
        System.out.println(x / y); //3
        System.out.println("System.out.println(x % y);");
        System.out.println(x % y); //1
        System.out.println("Increment z by 1");
        ++z;
        System.out.println(z);//6
        System.out.println("Decrement z by 1");
        --z;
        System.out.println(z);//5

        System.out.println("---------------------------------------------------------------------------");


        /*
        Note: When dividing two integers in Java, the result will also be an integer.
        For example, 10 / 3 give 3.
        If you want a decimal result, use double values, like 10.0 / 3.

         */

        //Example
        int a = 10;
        int b = 3;
        System.out.println("When dividing two integers in Java, the result will also be an integer.");
        System.out.println("For example, 10 / 3 give 3.");
        System.out.println("int a = 10;");
        System.out.println("int b = 3;");
        System.out.println(a / b); //Integer division, result is 3.

        System.out.println("---------------------------------------------------------------------------");


        double c = 10.0d;
        double d = 3.0d;
        System.out.println("If you want a decimal result, use  double values, like 10.0 /3.");
        System.out.println("double c = 10.0d;");
        System.out.println("double d = 3.0d;");
        System.out.println("System.out.println(c / d);");
        System.out.println(c / d); //Decimal division, result is 3.333.

        System.out.println("---------------------------------------------------------------------------");


        /*
        Incrementing and Decrementing

        Incrementing and decrementing are very common in programming, especially when working
        with counters, loops, and arrays (which you will learn more about in later chapters).

        The ++ operator increases a value by 1, while the -- operator decreases a value by 1:
         */

        //Example
        System.out.println("Incrementing and decrementing are very common in programming,");
        System.out.println("especially when working with counters, loops, and arrays (which you will learn more about in later chapters).");
        System.out.println("The ++ operator increases a value by 1, while the -- operator decreases a value by 1;");
        int e = 5;
        ++e;//Increment e by 1
        System.out.println("int e = 5;");
        System.out.println("++e;// Increment e by 1");
        System.out.println(e); //6

        //Example
        int f = 5;
        --f;//Decrement f by 1
        System.out.println("int f = 5;");
        System.out.println("--f; //Decrement f by 1");
        System.out.println(f);//4

        System.out.println("---------------------------------------------------------------------------");


        /*
        Sometimes, you might both increment and decrement the same variable.
        Remember that if you increase a value and later decrease it, it will go up by one
        and back down by one - ending up where it started.
         */

        //Example
        int g = 5;
        int h = 5;
        ++g;// Increment g by 1 (g becomes 6)
        --h;// Decrement g by 1 (h becomes 5)

        System.out.println("Sometimes, you might both increment and decrement the same variable.");
        System.out.println("Remember that if you increase a value and later decrease it, it will go up by one");
        System.out.println("and back down by one - ending up where it started.");
        System.out.println("int g = 5;");
        System.out.println("int h = 5;");
        System.out.println("++g;// Increment g by 1 (g becomes 6)");
        System.out.println("--h;// Decrement h by 1 (h becomes 4)");
        System.out.println(g);
        System.out.println(h);

        System.out.println("---------------------------------------------------------------------------");


        /*
        Real Life Example: Counting People

        Imagine you are building a program to count how many people enter and leave a room.
        You can use ++ to increase the counter when someone enters,
        and -- to decrease it when someone leaves:
         */

        //Example
        int peopleInRoom = 0;
        //3 people enter
        peopleInRoom++;
        peopleInRoom++;
        peopleInRoom++;
        System.out.println("Imagine you are building a program to count how many people enter and leave a room.");
        System.out.println("You can use ++ to increase the counter when someone enters,");
        System.out.println("and -- to decrease it when someone leaves:");
        System.out.println("int peopleInRoom = 0;");
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("3 people enter");
        System.out.println("peopleInRoom++;");
        System.out.println("peopleInRoom++;");
        System.out.println("peopleInRoom++;");
        System.out.println(peopleInRoom);//3
        System.out.println("---------------------------------------------------------------------------");

        //1 person leaves
        peopleInRoom--;
        System.out.println("1 person leaves");
        System.out.println("peopleInRoom--;");
        System.out.println(peopleInRoom);//2
        System.out.println("---------------------------------------------------------------------------");



    }
}
