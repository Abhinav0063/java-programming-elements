import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for base and height
        System.out.print("Enter the base of the triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = input.nextDouble();

        // Calculate area
        double areaCm2 = 0.5 * base * height;

        // Convert to square inches
        double areaInches2 = areaCm2 / (2.54 * 2.54);

        System.out.println("The area of the triangle in square inches is " + areaInches2 + " and in square cm is " + areaCm2);

        input.close();
    }
}
