import java.util.Scanner;
import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("=== Array In-Class Practice ===\n");
        
        // Part 1: Pet Store Inventory - Fill in the blanks
        System.out.println("Part 1: Pet Store Inventory");
        
        // Create an array of pet types available in the store
        String[] pets = {______, ______, ______, ______}; // Fill with: "Dogs", "Cats", "Birds", "Fish"
        
        // Create an array of quantities for each pet type
        ______[] quantities = {12, 8, 15, 25};
        
        // Display inventory manually (no loops)
        System.out.println("Current Pet Store Inventory:");
        System.out.println(pets[____] + ": " + quantities[____] + " available");
        System.out.println(pets[____] + ": " + quantities[____] + " available");
        System.out.println(pets[____] + ": " + quantities[____] + " available");
        System.out.println(pets[____] + ": " + quantities[____] + " available");
        
        // Find total number of pets
        int totalPets = quantities[____] + quantities[____] + quantities[____] + quantities[____];
        System.out.println("Total pets in store: " + totalPets);
        
        System.out.println("\n" + "-".repeat(40) + "\n");
        
        // Part 2: Weekly Weather - Fill in the blanks
        System.out.println("Part 2: Weekly Weather Tracker");
        
        // Array of days of the week
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        
        // Create array to store temperatures for each day
        ______[] temperatures = new ______[5];
        
        System.out.println("Enter temperatures for this week:");
        
        // Get temperature input for each day
        System.out.print(days[____] + " temperature: ");
        temperatures[____] = scan.____________();
        
        System.out.print(days[____] + " temperature: ");
        temperatures[____] = scan.____________();
        
        System.out.print(days[____] + " temperature: ");
        temperatures[____] = scan.____________();
        
        System.out.print(days[____] + " temperature: ");
        temperatures[____] = scan.____________();
        
        System.out.print(days[____] + " temperature: ");
        temperatures[____] = scan.____________();
        
        // Display the weather report
        System.out.println("\nWeekly Weather Report:");
        System.out.println(days[0] + ": " + temperatures[____] + "°F");
        System.out.println(days[1] + ": " + temperatures[____] + "°F");
        System.out.println(days[2] + ": " + temperatures[____] + "°F");
        System.out.println(days[3] + ": " + temperatures[____] + "°F");
        System.out.println(days[4] + ": " + temperatures[____] + "°F");
        
        // Calculate average temperature
        double avgTemp = (temperatures[0] + temperatures[1] + temperatures[2] + 
                         temperatures[3] + temperatures[4]) / _____;
        System.out.println("Average temperature: " + avgTemp + "°F");
        
        System.out.println("\n" + "-".repeat(40) + "\n");
        
        // Part 3: Library Book Checkout - Fill in the blanks
        System.out.println("Part 3: Library Book Checkout System");
        
        // Pre-defined arrays for book titles and their availability status
        String[] bookTitles = {"Java Programming", "Data Structures", "Web Development"};
        ______[] available = {true, false, true}; // boolean array
        
        System.out.println("Library Catalog:");
        System.out.println("1. " + bookTitles[____] + " - Available: " + available[____]);
        System.out.println("2. " + bookTitles[____] + " - Available: " + available[____]);
        System.out.println("3. " + bookTitles[____] + " - Available: " + available[____]);
        
        // Simulate checking out a book (change availability)
        System.out.println("\nChecking out: " + bookTitles[0]);
        available[____] = ______; // Set first book to not available
        
        System.out.println("Updated availability for " + bookTitles[0] + ": " + available[0]);
        
        System.out.println("\n" + "-".repeat(40) + "\n");
        
        // Part 4: Restaurant Menu Prices - Fill in the blanks
        System.out.println("Part 4: Restaurant Menu");
        
        scan.nextLine(); // Clear buffer
        
        // Create arrays for menu items and prices
        String[] menuItems = new String[3];
        ______[] prices = new ______[3];
        
        System.out.println("Enter 3 menu items and their prices:");
        
        // Get menu item input
        System.out.print("Menu item 1: ");
        menuItems[____] = scan.____________();
        System.out.print("Price for item 1: $");
        prices[____] = scan.____________();
        
        System.out.print("Menu item 2: ");
        menuItems[____] = scan.____________();
        System.out.print("Price for item 2: $");
        prices[____] = scan.____________();
        
        System.out.print("Menu item 3: ");
        menuItems[____] = scan.____________();
        System.out.print("Price for item 3: $");
        prices[____] = scan.____________();
        
        // Display menu
        System.out.println("\n--- Today's Menu ---");
        System.out.println(menuItems[____] + " - $" + prices[____]);
        System.out.println(menuItems[____] + " - $" + prices[____]);
        System.out.println(menuItems[____] + " - $" + prices[____]);
        
        // Pick a random daily special
        int specialIndex = rand.nextInt(____);
        System.out.println("\nToday's Special: " + menuItems[____________]);
        
        scan.close();
    }
}