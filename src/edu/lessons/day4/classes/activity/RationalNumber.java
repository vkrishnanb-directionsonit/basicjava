package edu.lessons.day4.classes.activity;

/**
 * A rational number given by a numerator and denominator.
 * 
 * @author pape
 */
public class RationalNumber {

	/**
	 * The numerator is given as an integer number.
	 * It is always 0 if this RationalNumber is 0.
	 */
	private int numerator;
	
	/**
	 * The denominator is given as an integer number greater than zero.
	 * It is always 0 if this RationalNumber is 0.
	 */
	private int denominator;

	/**
	 * Creates a new RationalNumber with given numerator and denominator.
	 * @param numerator an arbitry integer number
	 * @param denominator an integer not equal to zero
	 */
	public RationalNumber(int numerator, int denominator) {
		this.numerator = numerator;
		if (numerator == 0) {
			denominator = 0;
		}
		if (denominator < 0) {
			numerator *= -1;
			this.denominator = -denominator;
		} else {
			this.denominator = denominator;
		}
		reduceFraction();
	}

	/**
	 * Returns the greates common divisor of two positive integer numbers.
	 */
	private int getGcd(int a, int b) {
		while ( a > 0 &&  b > 0) {
			if ( a > b ) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		
		return Math.max(a, b);
	}

	/**
	 * Reduces the fraction of numerator and denominator by their
	 * greates common divisor.
	 */
	private void reduceFraction() {
		int gcd = getGcd(Math.abs(numerator), denominator);
		
		if (gcd > 0) {
			numerator = numerator / gcd;
			denominator = denominator / gcd;
		}
	}

	/**
	 * Adds the given <code>rationaleNumber</code> to this RationalenNumber
	 * and returns the sum as a new RationalNumber.
	 */
	public RationalNumber add(RationalNumber rationaleNumber) {
		return new RationalNumber(this.numerator * rationaleNumber.denominator + this.denominator * rationaleNumber.numerator,
							     this.denominator * rationaleNumber.denominator);
	}

	/**
	 * Multiplies the given <code>rationalNumber</code> to this RationalNumber
	 * and returns the product as a new RationalNumber.
	 */
	public RationalNumber multiply(RationalNumber rationalNumber) {
		return new RationalNumber(this.numerator * rationalNumber.numerator, this.denominator * rationalNumber.denominator);
	}

	/**
	 * Returns the denominator of this RationalNumber.
	 * It is zero, if this RationalNumber is zero.
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * Returns the numerator of this RationalNumber.
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * Returns the value of this RationalNumber as a double value.
	 */
	public double getDoubleValue() {
		return (double) numerator / (double) denominator;
	}
}
