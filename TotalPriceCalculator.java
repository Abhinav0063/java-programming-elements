import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        // user input obj
        Scanner input = new Scanner(System.in);
        
        // Take user input for unit price
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = input.nextDouble();
        
        // Take user input for quantity
        System.out.print("Enter the quantity to be bought: ");
        int quantity = input.nextInt();
        
        // Calculate total purchase price
        double totalPrice = unitPrice * quantity;
        
        // Display the output
        System.out.println("The total purchase price is INR " + totalPrice + 
                           " if the quantity is " + quantity + 
                           " and the unit price is INR " + unitPrice);

        // Close scanner
        input.close();
    }
}
