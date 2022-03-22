package edu.lessons.expressions;

/**
 * <p>
 * Computes the current passing through a wire.
 * </p>
 * <p>
 * The length of the wire, its diameter, its resistivity are given.
 * </p> 
 * @author pape
 */
public class ElectricalResistance {

    /**
     * Computes the electrical resistance for 
     * a wire.
     */
    public static void main(String[] args) {
        double length = 1; // 2 meter
        double diameter = 0.001; // 1 mm
        double resistivity = 1.78E-8; // copper
        double area = (diameter * diameter / 4) * Math.PI;
        double resistance = resistivity * ( length / area);
        
        System.out.println( resistance + " Ohm");
        
        double current = 1; // 1 Ampere
        
        System.out.println("Potential difference " + ( resistance * current ) + " Volt " +
        		"are neccesary to pass " + 
                + current + " Ampere through the wire"); 
    }

}
