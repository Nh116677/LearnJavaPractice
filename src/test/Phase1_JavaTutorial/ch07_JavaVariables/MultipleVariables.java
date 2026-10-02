package Phase1_JavaTutorial.ch07_JavaVariables;

public class MultipleVariables {
    public static void main(String[] args) {
        /* Java Declare Multiple Variables

        Declare Many Variables

        To declare more than one variable of the same type, you can use a comma-separated list:

         */

        // Example
        // Instead of writing:
        int x = 5;
        int y = 6;
        int z = 50;
        System.out.println(x + y + z); // 61

        //You can write:
        int x1 = 5, y1 = 6, z1 = 50;
        System.out.println(x1 + y1 + z1); // 61

        //Note: Declaring many variables in one line is shorter, but writing one variable per line can sometimes make the code easier to read.

        /* One Value to Multiple Variables

        You can also assign the same value to multiple variables in one line:

         */

        int x2, y2, z2;
        x2 = y2 = z2 = 50;
        System.out.println(x2 + y2 + z2); // 150


    }
}
