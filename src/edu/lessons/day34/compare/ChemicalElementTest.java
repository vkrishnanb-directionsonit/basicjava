package edu.lessons.day34.compare;


public class ChemicalElementTest  {

    public void testIsMetal() {
//        assertTrue( ChemicalElement.GALLIUM.isMetal() );
    }

    public void testIsMetal1() {
//        assertFalse( ChemicalElement.ZINC.isMetal() );
    }

    
    public void testIsAlkaliMetal() {
//        assertTrue( ChemicalElement.POTASSIUM.isAlkaliMetal() );
    }

    public void testIsAlkaliMetal1() {
//        assertFalse( ChemicalElement.HYDROGEN.isAlkaliMetal() );
    }

    public void testIsTransitionMetal() {
//        assertTrue( ChemicalElement.ZINC.isTransitionMetal());
    }

    public void testIsTransitionMetal1() {
//        assertFalse( ChemicalElement.POTASSIUM.isTransitionMetal());
    }
    
    public void testGetSymbol() {
//        assertEquals("H", ChemicalElement.HYDROGEN.getSymbol());
    }

    public void testGetAtomicNumber() {
//        assertEquals(31, ChemicalElement.GALLIUM.getAtomicNumber());
    }

    public void testComparable1() {
//        assertEquals(0, ChemicalElement.OXYGEN.compareTo(ChemicalElement.OXYGEN));
    }
    
    public void testComparable2() {
//        assertEquals(1, ChemicalElement.OXYGEN.compareTo(ChemicalElement.HYDROGEN));
    }

    
}
