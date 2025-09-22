import java.util.Scanner;

public class CustomMethodsExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("=== Custom Methods In-Class Practice ===\n");
        
        // Part 1: Employee Payroll System - Fill in the blanks
        System.out.println("Part 1: Employee Payroll Calculator");
        
        System.out.print("Enter employee name: ");
        String name = scan.nextLine();
        System.out.print("Enter hours worked: ");
        double hours = scan.nextDouble();
        System.out.print("Enter hourly rate: $");
        double rate = scan.nextDouble();
        
        // Call custom method to calculate gross pay
        double grossPay = ____________(hours, rate); // Fill in method name
        System.out.println(name + "'s gross pay: $" + grossPay);
        
        // Call custom method to calculate taxes (assume 20% tax rate)
        double taxes = ____________(grossPay); // Fill in method name
        System.out.println("Taxes owed: $" + taxes);
        
        // Call custom method to calculate net pay
        double netPay = ____________(grossPay, taxes); // Fill in method name
        System.out.println("Net pay: $" + netPay);
        
        System.out.println("\n" + "-".repeat(40) + "\n");
        
        // Part 2: Bank Account Manager - Fill in the blanks
        System.out.println("Part 2: Bank Account Manager");
        
        System.out.print("Enter current balance: $");
        double balance = scan.nextDouble();
        System.out.print("Enter deposit amount: $");
        double deposit = scan.nextDouble();
        System.out.print("Enter withdrawal amount: $");
        double withdrawal = scan.nextDouble();
        
        // Call custom method to process deposit
        double newBalance = ____________(balance, deposit); // Fill in method name
        System.out.println("Balance after deposit: $" + newBalance);
        
        // Call custom method to process withdrawal
        newBalance = ____________(newBalance, withdrawal); // Fill in method name
        System.out.println("Final balance: $" + newBalance);
        
        // Call custom method to calculate interest (2% annual rate)
        double interest = ____________(newBalance); // Fill in method name
        System.out.println("Annual interest earned: $" + interest);
        
        System.out.println("\n" + "-".repeat(40) + "\n");
        
        // Part 3: Pizza Order Calculator - Fill in the blanks
        System.out.println("Part 3: Pizza Order Calculator");
        
        System.out.print("Enter pizza diameter (inches): ");
        double diameter = scan.nextDouble();
        System.out.print("Enter price per square inch: $");
        double pricePerInch = scan.nextDouble();
        System.out.print("Enter number of pizzas: ");
        int quantity = scan.nextInt();
        
        // Call custom method to calculate pizza area
        double area = ____________(diameter); // Fill in method name
        System.out.println("Pizza area: " + area + " square inches");
        
        // Call custom method to calculate single pizza cost
        double singleCost = ____________(area, pricePerInch); // Fill in method name
        System.out.println("Cost per pizza: $" + singleCost);
        
        // Call custom method to calculate total order cost
        double totalCost = ____________(singleCost, quantity); // Fill in method name
        System.out.println("Total order cost: $" + totalCost);
        
        System.out.println("\n" + "-".repeat(40) + "\n");
        
        // Part 4: Student Report Card - Fill in the blanks
        System.out.println("Part 4: Student Report Card Generator");
        
        scan.nextLine(); // Clear buffer
        System.out.print("Enter student's first name: ");
        String firstName = scan.nextLine();
        System.out.print("Enter student's last name: ");
        String lastName = scan.nextLine();
        System.out.print("Enter student ID: ");
        int studentId = scan.nextInt();
        System.out.print("Enter GPA: ");
        double gpa = scan.nextDouble();
        
        // Call custom method to format student name
        String fullName = ____________(firstName, lastName); // Fill in method name
        System.out.println("Student: " + fullName);
        
        // Call custom method to generate student email
        String email = ____________(firstName, lastName); // Fill in method name
        System.out.println("Email: " + email);
        
        // Call custom method to format student ID
        String formattedId = ____________(studentId); // Fill in method name
        System.out.println("Student ID: " + formattedId);
        
        // Call custom method to determine academic standing
        String standing = ____________(gpa); // Fill in method name
        System.out.println("Academic Standing: " + standing);
        
        scan.close();
    }
    
    // Part 1: Employee Payroll Methods - Fill in the blanks
    
    // Method to calculate gross pay (hours * rate)
    public static ______ calculateGrossPay(______ hours, ______ rate) {
        return hours * rate;
    }
    
    // Method to calculate taxes (20% of gross pay)
    public static double ____________(double grossPay) {
        return grossPay * ______;
    }
    
    // Method to calculate net pay (gross pay - taxes)
    public static double calculateNetPay(______ grossPay, ______ taxes) {
        return ______ - ______;
    }
    
    // Part 2: Bank Account Methods - Fill in the blanks
    
    // Method to process deposit
    public static ______ processDeposit(______ balance, ______ amount) {
        return balance ______ amount; // Fill in operator
    }
    
    // Method to process withdrawal  
    public static double processWithdrawal(double balance, double amount) {
        return balance ______ amount; // Fill in operator
    }
    
    // Method to calculate annual interest (2% rate)
    public static ______ calculateInterest(______ balance) {
        return balance * ______;
    }
    
    // Part 3: Pizza Methods - Fill in the blanks
    
    // Method to calculate pizza area (π * (diameter/2)²)
    public static double ____________(double diameter) {
        double radius = diameter / ______;
        return ______ * radius * radius; // Use Math.PI
    }
    
    // Method to calculate pizza cost
    public static ______ calculatePizzaCost(______ area, ______ pricePerInch) {
        return ______ * ______;
    }
    
    // Method to calculate total order cost
    public static double calculateTotalCost(double singleCost, ______ quantity) {
        return singleCost ______ quantity; // Fill in operator
    }
    
    // Part 4: Student Report Methods - Fill in the blanks
    
    // Method to format full name (First Last)
    public static ______ formatFullName(______ first, ______ last) {
        return first ______ " " ______ last; // Fill in operators
    }
    
    // Method to generate student email (firstname.lastname@university.edu)
    public static String ____________(String first, String last) {
        return first.toLowerCase() + "." + ______.toLowerCase() + "@university.edu";
    }
    
    // Method to format student ID with leading zeros (e.g., 001234)
    public static ______ formatStudentId(______ id) {
        return String.format("______", id); // Format with 6 digits, leading zeros
    }
    
    // Method to determine academic standing based on GPA
    public static String determineStanding(______ gpa) {
        // Note: This simplified version doesn't use if-statements
        // Return a basic message
        return "GPA: " + gpa + " - See advisor for detailed standing";
    }
}