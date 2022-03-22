package edu.lessons.day32.misc;

/**
 * Contains a main-Methode to measure the
 * average execution time in nano seconds of
 * calls to getDecimalValue().
 * 
 * <p>
 * My average measures with JDK 1.6, no optimization  during
 * compiling on a 
 * Athlon 64 3500+:
 * <pre>
 *  switch: 11.996048504545454
 *  if: 17.546552072727273
 *  array: 14.882158081818181
 * </pre>
 * <p/>
 *
 * @author pape
 *
 */
public class HexadecimalDigitPerformanceMeasure {

	/**
	 * performance measure
	 */
	public static void main(String[] args) {
		final int numberOfCalls = 10000000;
		HexadecimalDigit[] hexadecimalDigits = new HexadecimalDigit[22];
		char [] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'a', 'b', 'c', 'd', 'e', 'f',
				'A', 'B', 'D', 'E', 'E', 'F' };
		double divisor = numberOfCalls * digits.length;
		
		for (int i = 0; i < digits.length; i++) {
			hexadecimalDigits[i] = new HexadecimalDigitSwitch();
			hexadecimalDigits[i].setDigit(digits[i]);
		}
		System.out.println("Switch: "
				+ getNanoTime(numberOfCalls, hexadecimalDigits)
				     / divisor);

		for (int i = 0; i < digits.length; i++) {
			hexadecimalDigits[i] = new HexadecimalDigitIf();
			hexadecimalDigits[i].setDigit(digits[i]);
		}
		System.out.println("If: "
				+ getNanoTime(numberOfCalls, hexadecimalDigits)
				     / divisor);

		for (int i = 0; i < digits.length; i++) {
			hexadecimalDigits[i] = new HexadecimalDigitArray();
			hexadecimalDigits[i].setDigit(digits[i]);
		}
		System.out.println("Array: "
				+ getNanoTime(numberOfCalls, hexadecimalDigits)
				     / divisor);
	}

	private static long getNanoTime(int numberOfCalls,
								HexadecimalDigit [] hexadecimalDigits) {
		long nanoTime = 0;
		
		long timeNs = System.nanoTime();
		for (int i = 0; i < numberOfCalls; i++) {
			for (HexadecimalDigit hexadezimalZiffer : hexadecimalDigits) {
				hexadezimalZiffer.getDecimalValue();
			}
		}
		
		nanoTime = System.nanoTime() - timeNs;
	
		return nanoTime;
	}

}
