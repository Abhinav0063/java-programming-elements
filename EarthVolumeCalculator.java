public class EarthVolumeCalculator {
    public static void main(String[] args) {
        // Given values
        double radiusKm = 6378;
        // Conversion from km to miles
        double radiusMiles = radiusKm * 0.621371;
        
        // Calculating volume
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        
        // Display output
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 + 
                           " and in cubic miles is " + volumeMiles3);
    }
}
