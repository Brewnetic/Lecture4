public class slideExamples {
    
    public static void main(String[] args) {

        /* Recap: String and String Operations*/

        // Define now
        //String classProfessor;
        // Assign value later
        //classProfessor = "Professor: Sarah Lin";
        // Print value
        //System.out.println(classProfessor);
        
        // Declare now String testMessage;
        //String testMessage;
        // Assign later
        //testMessage = "This is a test";

        // Method to return the String's length (number of characters) 
        //int msgLength = testMessage.length(); // Value is 14

        // Methods to convert String to lower or upper case
        //String lowerMessage = testMessage.toLowerCase();
        //String upperMessage = testMessage.toUpperCase();

        // Print the results
        //System.out.println("Original: " + testMessage);
        //System.out.println("Lowercase: " + lowerMessage);
        //System.out.println("Uppercase: " + upperMessage);

        /* Array */
        //int[] itemIDs = {10, 20, 30, 40, 50};
        // Accessing sixth element that isn't there 
        //itemIDs[5] = 60; // <- This will cause an error

        // Check array's length using .length property
        //int[] prices = {10, 20, 30, 40};
        //int pricesLength = prices.length; // Value is 4

        //int[] prices = {10, 20, 30, 40};
        // Printing element by element
        //System.out.println(prices[0]);
        //System.out.println(prices[1]);

        // Printing whole thing 
        //System.out.println(prices);

        // Declare and assign
        int[] prices = {10, 20, 30, 40};

        // Retrieve
        int secondElement = prices[1];

        //Update 
        prices[1] = 25;

        // Length
        // Value is 4
        int pricesLength = prices.length;
        System.out.println("Length of prices array: " + pricesLength);

    }
}