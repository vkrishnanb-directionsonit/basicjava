package edu.lessons.day33.searching;


public class FindZeroTest  {

	
	public void testSearchZero() {
		Function f = new APolynomial();
		FindZero findZero = new FindZero(f, 0.0001);
		
//		assertEquals(0.0, f.f(findZero.searchZero(-1, 1)), 0.0001);
	}

	public void testSearchZero1() {
		Function f = new Function() {

			public double f(double x) {
				return (x + 1) * (x - 1);
			}
			
		};
		
		FindZero findZero = new FindZero(f, 0.0001);

//		assertEquals(0.0, f.f(findZero.searchZero(0, -2)), 0.0001);
//		assertEquals(0.0, f.f(findZero.searchZero(2, 0)), 0.0001);

	}
}
