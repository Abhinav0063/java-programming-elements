import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        // user input obj
        Scanner input = new Scanner(System.in);
        
        // Take user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        
        // Calculate the maximum number of handshakes using the formula (n * (n - 1)) / 2
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        // Display the output
        System.out.println("The maximum number of handshakes among " + numberOfStudents + 
                           " students is " + maxHandshakes);

        // Close scanner
        input.close();
    }
}
