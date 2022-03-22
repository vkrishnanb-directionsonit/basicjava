package edu.lessons.day33.searching;

public class NewtonsMethodTest  {

	public void testGetZero() {
		Polynomial polynomial = new Polynomial(new double[]{1.0, 0.0, -1.0});
		NewtonsMethod newtonsMethod = new NewtonsMethod(polynomial);
		
//		assertEquals(1.0, newtonsMethod.getZero(2.0, 0.00001), 0.00001);
//		assertEquals(-1.0, newtonsMethod.getZero(-2.0, 0.00001), 0.00001);
	}
	
	

}
