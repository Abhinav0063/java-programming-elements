import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        // user input obj
        Scanner input = new Scanner(System.in);
        
        // Take user input for base and height in cm
        System.out.print("Enter the base of the triangle in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double height = input.nextDouble();
        
        // Calculate the area in square cm
        double areaCm2 = 0.5 * base * height;
        
        // Convert area to square inches (1 cm² = 0.155 square inches)
        double areaInches2 = areaCm2 * 0.155;

        // Display output
        System.out.println("The area of the triangle in square centimeters is " + areaCm2 + 
                           " and in square inches is " + areaInches2);

        // Close scanner
        input.close();
    }
}
