import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {
        // user input obj
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter the student fee: ");
        double fee = input.nextDouble();
        
        System.out.print("Enter the university discount percentage: ");
        double discountPercent = input.nextDouble();
        
        // Calculating discount
        double discount = (fee * discountPercent) / 100.0;
        double finalFee = fee - discount;
        
        // Display output
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        
        // Closing scanner object
        input.close();
    }
}