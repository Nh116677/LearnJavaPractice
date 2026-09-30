package A.JavaTutorial.F.JavaComments;

public class Comments {
    public static void main(String[] args) {
        /*
        Java JavaTutorial.Comments
        JavaTutorial.Comments can be used to explain Java code, and to make it more readable. It can also be used to prevent execution when testing alternative code.

        Single-line JavaTutorial.Comments
        Single-line comments start with two forward slashes (//).

        Any text between // and the end of the line is ignored by Java (will not be executed).

        This example uses a single-line comment before a line of code:
         */
        //This example uses a single-line comment before a line of code:
        // This is a comment
        System.out.println("Hello World");

        //This examples uses a single-line comment at the end of a line of code:
        System.out.println("Hello World");//This is a comment

        //Java Multi-line JavaTutorial.Comments
        // Multi-line comments start with /* and ends with */ .
        // Any text between /* and */ will be ignored by Java.
        // This example uses a multi-line comment (a comment block) to explain the code:
        /* The code below will print the words Hello World
        to screen, and it is amazing
         */

        System.out.println("Hello World");
    }
}
