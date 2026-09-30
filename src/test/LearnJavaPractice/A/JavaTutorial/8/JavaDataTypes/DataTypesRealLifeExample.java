package A.JavaTutorial.H.JavaDataTypes;

public class DataTypesRealLifeExample {
    public static void main(String[] args) {
        //https://www.w3schools.com/java/java_data_types_reallife.asp
        /*Java Data Types Example

        Real-Life Example

        Here's a real-life example of using different data types,
        to calculate and output the total cost of a number of items:
         */

        //Example
        //Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';
        System.out.println("---------------------------------------------------------------------------");

        //Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost of item: " + currency + costPerItem);
        System.out.println("Total cost = " + currency + totalCost);
        System.out.println("---------------------------------------------------------------------------");

    }
}
