package Z.CodeChallenges;

public class JavaMultipleVariables {
    public static void main(String[] args) {
        //https://www.w3schools.com/java/exercise.asp?x=xrcise_variables_multiple1
        //Java Multiple Variable

        //1. Which is the correct variable name to complete the declaration of multiple string variables.
        //String firstName = "John", _______ = "Doe";
        //System.out.println(firstName + " " + lastName);
        String option1 = "a. x";
        String option2 = "b. y";
        String option3 = "c. lastName";
        String option4 = "d. name";
        String firstName = "John", lastName = "Doe";
        System.out.println("1. What is the correct variable name to complete the declaration of multiple string variables.");
        System.out.println("   String firstName = \"John\", _______ = \"Doe\"");
        System.out.println("   System.out.println(firstName + \" \" + lastname);");
        System.out.println("    a. x");
        System.out.println("    b. y");
        System.out.println("    c. lastName");
        System.out.println("    d. name");
        System.out.println("The correct variable name to complete the declaration of multiple string variable is " + option3 + ".");
        System.out.println(firstName + " " + lastName);
        System.out.println("---------------------------------------------------------------------------");

        //2. Which of the following declares multiple variables of the same type?
        //int x = 1, y = 2, z = 3;
        //int xyz = 1, 2, 3;
        //int x;y;z = 123;
        //int x = 1 + y = 2 + z = 3;
        String a = "x = 1, y = 2, z = 3";
        String b = "xyz = 1, 2, 3";
        String c = "x;y;z = 123";
        String d = "x = 1 + y = 2 + z = 3";
        int x = 1, y = 2, z = 3;
        System.out.println("2. Which of the following declares multiple variables of the same type?");
        System.out.println("    a. x = 1, y = 2, z = 3 ");
        System.out.println("    b. xyz = 1, 2, 3");
        System.out.println("    c. x;y;z = 123");
        System.out.println("    d. x = 1 + y = 2 + z = 3");
        System.out.println("The correct answer is " + a + ".");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println("---------------------------------------------------------------------------");

        //3. Fill in the missing parts to create three variables of the same type, using a comma-separated list:
        //___ x = 5 _ y = 6 _ z = 50;
        //System.out.println(x + y + z)
        int x1 = 5, y1 = 6, z1 = 50;
        System.out.println("3. Fill in the missing parts to create three variables of the same type, using a comma-separated list:");
        System.out.println(x1 + y1 + z1);
        System.out.println("The correct answer is " + ( x1 + y1 + z1) + "." );
        System.out.println("---------------------------------------------------------------------------");

        //4. Fill in the missing parts to assign the same value to multiple variables in one line.
        //int x, y, z;
        //x _ y _ z _ 50;
        //System.out.println(x + y + z);
        int x2,y2,z2;
        x2 = y2 = z2 = 50;
        double result = (double) x2 / y2 /z2;
        System.out.println("4. Fill in the missing parts to assign the same value to multiple variables in one line.");
        System.out.println(x2 + y2 + z2);
        System.out.println(x2 * y2 * z2);
        System.out.println(x2 - y2 - z2);
        System.out.println(result);
        System.out.println("The correct answer is " + (x2 + y2 +z2) + ".");
        System.out.println("The correct answer is " + (x2 * y2 * z2) + ".");
        System.out.println("The correct answer is " + (x2 - y2 - z2) + ".");
        System.out.println("The correct answer is " + result + ".");








    }
}
