package edu.lessons.day60.oops.interfaces;

import java.util.Comparator;

import edu.lessons.day34.compare.ChemicalElement;

/**
 * Compares two chemical elements with respect to their electronegativity.
 * 
 * @author pape
 */
@SuppressWarnings("rawtypes")
public class ChemicalElementComparator implements Comparator {

    /**
     * Compares two chemical elements with respect to their electronegativity.
     */
    public int compare(Object o1, Object o2) {
    	ChemicalElement c2 = (ChemicalElement) o2;
    	ChemicalElement c1 = (ChemicalElement) o1;
        
        // Note: NEVER compare floating point values with the identity operator ==
        if ( Math.abs(c1.getElectronegativity()- c2.getElectronegativity()) <= 0.000000000001) {
            return 0;
        } else if ( c1.getElectronegativity() < c2.getElectronegativity()) {
            return -1;
        } else {
            return 1;
        }
    }
    
}
