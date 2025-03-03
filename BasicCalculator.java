import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // user input obj
        Scanner input = new Scanner(System.in);
        
        // Taking user input for two numbers
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();
        
        // Performing arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number2 != 0 ? number1 / number2 : Double.NaN; // Handling division by zero
        
        // Display output
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 +
                " is " + addition + ", " + subtraction + ", " + multiplication + " and " + division);
        
        // Closing scanner object
        input.close();
    }
}
