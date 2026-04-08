package A.JavaTutorial.JavaDataTypes;

public class Characters {
    public static void main(String[] args) {
        //https://www.w3schools.com/java/java_data_types_characters.asp
        /*Java JavaDataTypes.Characters

        JavaDataTypes.Characters

        The char data types used to store a single character.
        The character must be surrounded by single quotes, like 'A' or 'c':
         */
        //Example
        char myGrade = 'B';
        System.out.println(myGrade);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("My grade is " + myGrade + ".");
        System.out.println("---------------------------------------------------------------------------");

        /*Alternatively, if you are familiar with ASCII values,
        you can use those to display certain characters:
         */

        //Example
        /*Tip: A list of all ASCII values can be found in our ASCII Table Reference.
        https://www.w3schools.com/charsets/ref_html_ascii.asp

        In ASCII Table Reference:
        Char A = Number 65 = Description = uppercase A
        Char B = number 66 = Description = uppercase B
        Char C = number 67 = Description = uppercase C
        Therefore the value of char in the examples below indicate A, B, C

         */

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1); //Output A
        System.out.println(myVar2); //Output B
        System.out.println(myVar3); //Output C
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("There are three groups, " + myVar1 + ", " + myVar2 + " , " + myVar3 + ".");
        System.out.println("---------------------------------------------------------------------------");

        /*Strings

        The String data type is used to store a sequence of characters (text).
        String values must be surrounded by double quotes:
         */

        String greeting = "Welcome guest, thank you for attending today's webinar, we are please to have you here today.";
        System.out.println(greeting);
        System.out.println("---------------------------------------------------------------------------");

        /*
        The String type is so much used and integrated in Java, that some call it "the special ninth type".

        A String in Java is actually a non-primitive data type, because it refers to an object.
        The String object has methods that are used to perform certain operations on strings.
        Don't worry if you don't understand the term "object" just yet.  We will learn more about strings
        and objects in a later chapter.
         */



    }
}
