public class CourseFeeDiscount {
    public static void main(String[] args) {
        // Given values
        int fee = 125000;
        int discountPercent = 10;
        
        // Calculating discount
        double discount = (fee * discountPercent) / 100.0;
        double finalFee = fee - discount;
        
        // Display output
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
