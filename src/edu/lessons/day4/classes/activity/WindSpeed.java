package edu.lessons.day4.classes.activity;

/**
 * WindSpeed is responsible for converting different
 * measurments of wind velocity like km/h, knots and
 * beaufort.
 * 
 * @author pape
 */
public class WindSpeed {

    /**
     * the wind speed in kilometer per hour
     */
    private double kilometerPerHour = 0.0;
    

    /**
     * Creates a new wind speed with the speed
     * of the given kilometer per hour.
     */
    public WindSpeed(double kilometerPerHour) {
        this.kilometerPerHour = kilometerPerHour;
    }
    
    /**
     * Return true if this wind speed is a 
     * European windstorm (orcan, more than
     * 120 km/h).
     */
    public boolean IsOrcan() {
        return getKilometerPerHour() > 120.0;
    }

    /**
     * Return true if this wind speed is 
     * calm (less than 2 km/h).
ger als 2 km/h)
     */
    public boolean isCalm() {
        return getKilometerPerHour() < 2.0;
    }
    
    public double getKilometerPerHour() {
        return kilometerPerHour;
    }
    
    /**
     * Returns the wind speed measured in knots (nautic miles).
     * A nautic mile is 1.852 kilometer.
     */
    public double getKnots() {
        return getKilometerPerHour() / 1.852;
    }
    
    /**
     * Returns the wind speed measured in Beaufort (1-12).
     */
    public int getBeaufort() {
        int beaufort =  (int) (Math.pow(getKilometerPerHour() / 3.01, 0.6666) +0.5);
        
        if (beaufort > 12) {
            beaufort = 12;
        }
        
        return beaufort;
    }
}
