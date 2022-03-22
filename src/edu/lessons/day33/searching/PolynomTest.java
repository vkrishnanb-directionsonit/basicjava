package edu.lessons.day33.searching;

public class PolynomTest  {

	/**
	 * Test für das Null-Polynomial p(x) = 0.
	 */
	public void testF() {
		Polynomial polynom = new Polynomial();
		
//		assertEquals(0.0, polynom.f(7.0), 0.000001);
	}

	/**
	 * x*x -  1 = (x + 1)(x - 1)
	 */
	public void testF1() {
		double [] p = {-1.0, 0.0, 1.0};
		
		Polynomial polynom = new Polynomial(p);
		
//		assertEquals(0.0, polynom.f(1.0), 0.000001);
//		assertEquals(-1.0, polynom.f(0.0), 0.000001);
//		assertEquals(0.0, polynom.f(-1.0), 0.000001);
	}
	
	public void testGetGrad1() {
		double [] p = {-1.0, 0.0, 1.0};
		
		Polynomial polynom = new Polynomial(p);
		
//		assertEquals(2, polynom.getDegree());		
	}
	
	public void testGetGrad2() {
		Polynomial polynom = new Polynomial();
		
//		assertEquals(0, polynom.getDegree());		
	}
	
	public void testGetStelle() {
		double [] p = {-1.0, 2.0, 1.0};
		
		Polynomial polynom = new Polynomial(p);
		
//		assertEquals(-1.0, polynom.getCoeffizient(0), 0.00001);		
//		assertEquals(2.0, polynom.getCoeffizient(1), 0.00001);		
//		assertEquals(1.0, polynom.getCoeffizient(2), 0.00001);		
	}
	
	public void testAddiere1() {
		double [] p1 = {-1.0, 4.0, 1.0};
		double [] p2 = {1.0, 2.0, 1.0};
		
		Polynomial polynom = new Polynomial(p1).adds(new Polynomial(p2));
		
//		assertEquals(0.0, polynom.getCoeffizient(0), 0.000001);
//		assertEquals(6.0, polynom.getCoeffizient(1), 0.000001);
//		assertEquals(2.0, polynom.getCoeffizient(2), 0.000001);
	}
		
	public void testAddiere2() {
		double [] p1 = {-1.0, 4.0};
		double [] p2 = {1.0, 2.0, 1.0, -3.0};
		
		Polynomial polynom = new Polynomial(p1).adds(new Polynomial(p2));
		
//		assertEquals(0.0, polynom.getCoeffizient(0), 0.000001);
//		assertEquals(6.0, polynom.getCoeffizient(1), 0.000001);
//		assertEquals(1.0, polynom.getCoeffizient(2), 0.000001);
//		assertEquals(-3.0, polynom.getCoeffizient(3), 0.000001);
	}



	public void testAddiere3() {
		double [] p1 = {-1.0, 4.0, -1.0};
		double [] p2 = {2.0, 2.0, 1.0};
		
		Polynomial polynom = new Polynomial(p1).adds(new Polynomial(p2));
		
//		assertEquals(1.0, polynom.getCoeffizient(0), 0.000001);
//		assertEquals(6.0, polynom.getCoeffizient(1), 0.000001);
//		assertEquals(1, polynom.getDegree());
	}

	public void testGetErsteAbleitung1() {
		double [] p1 = {-1.0, 4.0, -1.0};
		
		Polynomial polynom = new Polynomial(p1);
		Polynomial ableitung = polynom.getFirstDerivation();
		
//		assertEquals(4.0, ableitung.getCoeffizient(0), 0.000001);
//		assertEquals(-2.0, ableitung.getCoeffizient(1), 0.000001);
//		assertEquals(1, ableitung.getDegree());
	}

	public void testGetErsteAbleitung2() {
		double [] p1 = {-1.0};
		
		Polynomial polynom = new Polynomial(p1);
		Polynomial ableitung = polynom.getFirstDerivation();
		
//		assertEquals(0.0, ableitung.getCoeffizient(0), 0.000001);
//		assertEquals(0, ableitung.getDegree());
	}
	
	public void testGetErsteAbleitung3() {
		Polynomial polynom = new Polynomial();
		Polynomial ableitung = polynom.getFirstDerivation();
		
//		assertEquals(0.0, ableitung.getCoeffizient(0), 0.000001);
//		assertEquals(0, ableitung.getDegree());
	}
	
	public void testGetErsteAbleitung4() {
		double [] p1 = {2.0, 4.5, 8.0, -2.0};
		
		Polynomial polynom = new Polynomial(p1);
		Polynomial ableitung = polynom.getFirstDerivation();
		
//		assertEquals(4.5, ableitung.getCoeffizient(0), 0.000001);
//		assertEquals(16.0, ableitung.getCoeffizient(1), 0.000001);
//		assertEquals(-6.0, ableitung.getCoeffizient(2), 0.000001);
//		assertEquals(2, ableitung.getDegree());
	}
	
}
