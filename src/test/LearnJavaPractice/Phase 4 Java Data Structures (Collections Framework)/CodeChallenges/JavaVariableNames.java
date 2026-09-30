package Z.CodeChallenges;

public class JavaVariableNames {
    public static void main(String[] args) {
       //https://www.w3schools.com/java/exercise.asp?x=xrcise_variables_identifiers1
        //Java Variable Names

        //1. What is the correct variable name to replace the blank so the code complies.
        //int _____ = 10; System.out.println(myVar);
        String option1 = "int";
        String option2 = "10";
        String option3 = "myVar";
        String option4 = "System";
        System.out.println("1. What is the correct variable name to replace the blank so the code complies.");
        System.out.println("int _____ = 10;");
        System.out.println("System.out.println(myVar);");
        System.out.println("    a. int");
        System.out.println("    b. 10");
        System.out.println("    c. myVar");
        System.out.println("    d. System");
        System.out.println("The correct variable name to replace the blank so that the code compiles is '" + option3 + "'.");
        System.out.println("int myVar = 10");
        System.out.println("System.out.println output " + option3 + ".");
        System.out.println("---------------------------------------------------------------------------");


        //2. What is the identifier that makes this code invalid because it duplicates the first variable name.
        //in myNum = 5;
        //int _____ = 10; //Illegal  - same name used twice
        String var1 = "myNum";
        String var2 = "myVar";
        String var3 = "num";
        String var4 = "x";
        System.out.println("2. What is the identifier that makes this code invalid because it duplicates the first variable name. ");
        System.out.println("    a. myNum");
        System.out.println("    b. myVar");
        System.out.println("    c. num");
        System.out.println("    d. x");
        System.out.println("The correct answer is " + var1 + ".");
        System.out.println("---------------------------------------------------------------------------");


        //3. Which is Not a legal variable name?
        String varNum1 = "int myInteger = 20";
        String varNum2 = "int int = 20";
        String varNum3 = "int myNum = 20";
        String varNum4 = "int num = 20";
        System.out.println("3. Which is NOT a legal variable name?");
        System.out.println("    a. int myInteger = 20");
        System.out.println("    b. int int = 20");
        System.out.println("    c. int myNum = 20");
        System.out.println("    d. int num = 20");
        System.out.println("The correct answer is '" + varNum2 + "'.");
        System.out.println("---------------------------------------------------------------------------");

        //4. True or False: All Java variables must be identified with unique names.
        boolean a = true;
        boolean b = false;
        System.out.println("4. True or False: All Java variables must be identified with unique names.");
        System.out.println("    a. true");
        System.out.println("    b. false");
        System.out.println("The correct answer is " + a + ", all java variables must be identified with unique names.");
        System.out.println("---------------------------------------------------------------------------");

        //5. Create a variable named maxSpeed and assign the value 120 to it.
        String datatype = "int";
        String varName = "maxSpeed";
        String varValue = "120";
        System.out.println("5. Create a variable named maxSpeed and assign the value 120 to it.");
        System.out.println(datatype + " " + varName + " = " + varValue + ";");



    }
}
