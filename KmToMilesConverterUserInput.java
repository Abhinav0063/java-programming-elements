import java.util.Scanner;

public class KmToMilesConverterUserInput {
    public static void main(String[] args) {
        // user input obj
        Scanner input = new Scanner(System.in);
        
        // Taking user input for kilometers
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();
        
        // Conversion factor
        double miles = km / 1.6;
        
        // Display output
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        
        // Closing scanner object
        input.close();
    }
}
