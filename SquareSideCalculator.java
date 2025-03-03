import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {
        // user input obj
        Scanner input = new Scanner(System.in);
        
        // Take user input for perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();
        
        // Calculate the side of the square
        double side = perimeter / 4;
        
        // Display the output
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        
        // Close scanner
        input.close();
    }
}
