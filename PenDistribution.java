public class PenDistribution {
    public static void main(String[] args) {
        // Given values
        int totalPens = 14;
        int students = 3;
        
        // Calculating distribution
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;
        
        // Display output
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
