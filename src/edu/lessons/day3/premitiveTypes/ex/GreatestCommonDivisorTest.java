package edu.lessons.day3.premitiveTypes.ex;


public class GreatestCommonDivisorTest {

	private GreatestCommonDivisor gcd = new GreatestCommonDivisor();
	
	public void testGetGcd() {
		System.out.println(1== gcd.getGcd(41, 3));
	}

	public void testGetGcd1() {
		System.out.println(4== gcd.getGcd(40, 4));
	}
	

	public void testGetGcd2() {
		System.out.println(14== gcd.getGcd(2*7*3*11, 2*2*7*7*41));
	}

	public void testGetGcd3() {
		System.out.println(786== gcd.getGcd(786, 786));
	}

}
