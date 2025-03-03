import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // user input obj
        Scanner input = new Scanner(System.in);
        
        // Take user input for distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();
        
        // Convert feet to yards
        double distanceInYards = distanceInFeet / 3;
        
        // Convert yards to miles
        double distanceInMiles = distanceInYards / 1760;
        
        // Display output
        System.out.println("The distance in yards is " + distanceInYards + 
                           " and in miles is " + distanceInMiles);

        // Close scanner
        input.close();
    }
}
