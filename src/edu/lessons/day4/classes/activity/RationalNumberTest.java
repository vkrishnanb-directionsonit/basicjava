package edu.lessons.day4.classes.activity;


public class RationalNumberTest {

	public void testRationalNumber() {
		RationalNumber rationalNumber = new RationalNumber(1,2);
		
//		assertEquals(1, rationalNumber.getNumerator());
//		assertEquals(2, rationalNumber.getDenominator());
	}

	public void testRationalNumber1() {
		RationalNumber rationalNumber = new RationalNumber(4,8);
		
//		assertEquals(1, rationalNumber.getNumerator());
//		assertEquals(2, rationalNumber.getDenominator());
	}
	
	public void testRationalNumber3() {
		RationalNumber rationalNumber = new RationalNumber(-4,8);
		
//		assertEquals(-1, rationalNumber.getNumerator());
//		assertEquals(2, rationalNumber.getDenominator());
	}
	
	public void testRationalNumber2() {
		RationalNumber rationalNumber = new RationalNumber(2 * 2 * 3 * 7, 2 * 5 * 7 * 7);
		
//		assertEquals(2 * 3, rationalNumber.getNumerator());
//		assertEquals(5 * 7, rationalNumber.getDenominator());
	}
	
	public void testAdd() {
		RationalNumber rationalNumber = new RationalNumber(1, 2).add(new RationalNumber(1, 3));

//		assertEquals(5, rationalNumber.getNumerator());
//		assertEquals(6, rationalNumber.getDenominator());
	}

	public void testAdd1() {
		RationalNumber rationalNumber = new RationalNumber(5, 8).add(new RationalNumber(3, 8));

//		assertEquals(1, rationalNumber.getNumerator());
//		assertEquals(1, rationalNumber.getDenominator());
	}

	public void testAdd2() {
		RationalNumber rationalNumber = new RationalNumber(-5, 8).add(new RationalNumber(5, 8));

//		assertEquals(0, rationalNumber.getNumerator());
//		assertEquals(0, rationalNumber.getDenominator());
	}
	
	public void testMultiply() {
		RationalNumber rationalNumber = new RationalNumber(1, 3).multiply(new RationalNumber(2, 5));
		
//		assertEquals(2, rationalNumber.getNumerator());
//		assertEquals(15, rationalNumber.getDenominator());		
	}
	
	public void testMultiply1() {
		RationalNumber rationalNumber = new RationalNumber(2, 3).multiply(new RationalNumber(3, 6));
		
//		assertEquals(1, rationalNumber.getNumerator());
//		assertEquals(3, rationalNumber.getDenominator());		
	}
	
	public void testGetDoubleValue() {
		RationalNumber rationalNumber = new RationalNumber(1, 3);
		
//		assertEquals(0.3333333333, rationalNumber.getDoubleValue(), 1E-5);
	}
	
	public void testGetDoubleValue1() {
		RationalNumber rationalNumber = new RationalNumber(-3, 4);
		
//		assertEquals(-0.75, rationalNumber.getDoubleValue(), 1E-5);
	}

}
