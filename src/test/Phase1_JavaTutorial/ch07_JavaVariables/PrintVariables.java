package Phase1_JavaTutorial.ch07_JavaVariables;

public class PrintVariables {
    public static void main(String[] args) {
        /* Java Print Variables

        Display Variables

        The println() method is often used to display variables.

        To combine both text and variable, use the + character:

         */

        //Example
        String name = "John";
        System.out.println("Hello " + name);

        // You can also use the + character to add a variable to another variable:
        // Example

        String firstName = "John ";
        String lastName = "Doe ";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        /* In Java, the + symbol has two meanings:
        ~ For text (strings), it joins them together (called concatenation).
        ~ For numbers, it adds values together.

        For numeric values, the + character works as a mathematical operator (notice that we use int (integer) variables here):
         */

        // Example
        int x = 5;
        int y = 6;
        System.out.println(x + y); // Print the value of x + y

        /* From the example above, here's what happens step by step:
        ~ x stores the value 5
        ~ y stores the value 6
        ~ println() displays the result of x + y, which is 11
         */

        /* Mixing Text and Numbers

        Be careful when combining text and numbers in the same line of code.  Without parentheses, Java will treat the numbers as text after the first string:
         */
        //Example

        System.out.println("The sum is " + x + y); // Prints: The sum is 56
        System.out.println("The sum is " + (x + y)); // Prints: The sum is 11

        /* Explanation:
        In the first line, Java combines "The sum is " with x, creating the string "The sum is 5".  Then y is added to that string, so it becomes " The sum is 56".

        In the second line, the parentheses make sure x + y is calculated first ( resulting is 11), so the output is "The sum is 11".


         */




    }
}
