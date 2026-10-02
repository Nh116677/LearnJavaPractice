package Phase1_JavaTutorial.ch05_JavaOutput;

public class PrintText {
    public static void main(String[] args) {
        /* Java Output/Print

        Print Text
        You Learned from the previous chapter that you can use the println() method to output values or print text in Java:

         */

        //You can add as many println() methods as you want.  Note that it will add a new line for each method:

        System.out.println("Hello World");
        System.out.println("I am learn Java.");
        System.out.println("It is awesome!");

        /* Double Quotes

        Text must be wrapped inside double quotations marks " ".
        If you forget the double quotes, an error occurs:

         */

        System.out.println("This sentence will work!");
        //System.out.println(This sentence will produce an error);

        /* The Print() Method

        There is also a print() method, which is similar to println().
        The only difference is that it does not insert a new line at the end of the output:

         */

        System.out.print("Hello World! ");
        System.out.print("I will print on the same line.");

        //Note that we add an extra space (after "Hello World! " in the example above for better readability.



    }
}
