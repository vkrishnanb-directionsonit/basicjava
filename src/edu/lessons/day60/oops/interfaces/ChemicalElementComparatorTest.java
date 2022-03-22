package edu.lessons.day60.oops.interfaces;

import java.util.Arrays;

import edu.lessons.day34.compare.ChemicalElement;

public class ChemicalElementComparatorTest  {

    private ChemicalElementComparator comparator = new ChemicalElementComparator();
    
    public void testCompare() {
//        assertEquals(0, comparator.compare(ChemicalElement.HYDROGEN,
//        		ChemicalElement.HYDROGEN));
    }

    public void testCompare1() {
    	ChemicalElement [] elements = {
    			ChemicalElement.GALLIUM,
    			ChemicalElement.POTASSIUM,
    			ChemicalElement.OXYGEN,
    			ChemicalElement.HYDROGEN,
    			ChemicalElement.ZINC
        };

        Arrays.sort(elements, comparator);

//        assertEquals(ChemicalElement.POTASSIUM, elements[0] );
//        assertEquals(ChemicalElement.ZINC, elements[1] );
//        assertEquals(ChemicalElement.GALLIUM, elements[2] );
//        assertEquals(ChemicalElement.HYDROGEN, elements[3] );
//        assertEquals(ChemicalElement.OXYGEN, elements[4] );
    }
    
}
