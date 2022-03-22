package edu.lessons.day33.searching;

/**
 * A polynomial with coefficients of type double.
 * 
 * @author pape
 *
 */
public class Polynomial implements Function {

	private double coefficients[] = {0.0}; // zero-polynomial
	
	/**
	 * Creates a new polynomial with the given <code>coefficients</code>.
	 * The resulting Polynomial is defined by
	 * <code>
	 *   coefficients[0] + coefficients[1] * x + coefficients[2] * x<sup>2</sup> + ... + coefficients[n] * x<sup>n</sup>,
	 * </code>
	 * with <code>n = coefficients.length - 1</code>.
	 */
	public Polynomial(double [] coefficients) {
		this.coefficients = coefficients;
		normalize();
	}
	
	/**
	 * Creates the zero-polynomial with p(x) = 0 for all x.
	 */
	public Polynomial() {
	}
	
	/**
	 * Returns the value of this polynomal for a given x.
	 * It uses Horner's scheme:
	 * <center>
	 *   5 + 2*x - 7*x<sup>2</sup> + 3*x<sup>3</sup>
	 * </center>
	 * is evaluated for a given x with 
	 * <center>
	 *   5 + x * ( 2 + x * ( -7 + x * 3 ) ) 
	 *   </center>
	 * The running time is O(n).
	 */
	public double f(double x) {
		double value = 0.0;
		
		for (int i = getDegree(); i >= 0; i--) {
			value *= x;
			value += getCoeffizient(i);
		}
		
		return value;
	}
	
	/**
	 * Addes this polynomial to the given an and retruns the
	 * sum as a new polynomial.
	 */
	public Polynomial adds(final Polynomial polynomial) {
		int maximalDegree = Math.max(getDegree(), polynomial.getDegree());
		double [] coefficientsOfSum = new double[maximalDegree + 1];
		Polynomial sum = null;
		
		for (int i = 0; i <= maximalDegree; i++) {
			if ( i > getDegree() ) {
				coefficientsOfSum[i] = polynomial.getCoeffizient(i);
			} else if (i > polynomial.getDegree()) {
				coefficientsOfSum[i] = this.getCoeffizient(i);				
			} else {
				coefficientsOfSum[i] = this.getCoeffizient(i) + polynomial.getCoeffizient(i);
			}
		}
				
		sum = new Polynomial(coefficientsOfSum);
		sum.normalize();
		
		return sum;
	}

	/**
	 * Multiplies <code>a</code> to  this polynomial and
	 * returns the result as a new polynomial.
	 */
	public Polynomial multiply(double a) {
		double [] coeffizients = new double[getDegree() + 1];
		Polynomial polynomial = null;
		
		if ( isZero(a) ) {
			return new Polynomial();
		} else {
			for (int i = 0; i <= getDegree(); i++) {
					coeffizients[i] = a * this.getCoeffizient(i);
			}
		}
		
		polynomial = new Polynomial(coeffizients);
		polynomial.normalize();
		
		return polynomial;
	}

	/**
	 * Calculates the degree of this polynomial.
	 */
	private  void normalize() {
		int maximumDegree = coefficients.length - 1;
		
		while ( isZero(coefficients[maximumDegree]) ) {
			maximumDegree--;
		}
		
		if (maximumDegree < coefficients.length - 1) {
			double [] koeffizienten1 = new double[maximumDegree + 1];

			for (int i = 0; i <= maximumDegree; i++) {
				koeffizienten1[i] = coefficients[i];
			}
			
			coefficients = koeffizienten1;
		}
	}
	
	/**
	 * Returns the degree (the largest exponent) of this polynomial.
	 */
	public int getDegree() {
		return this.coefficients.length - 1;
	}
	
	/**
	 * Returns the coefficient of the variable x with degree n
	 * in this polynomial.
	 */
	public double getCoeffizient(int n) {
		return coefficients[n];
	}


	/**
	 * Returns true, if <code>a</code> is very close to zero.
	 */
	private boolean isZero(double a) {
		return Math.abs(a) < Double.MIN_VALUE * 100;
	}
	
	/**
	 * Returns the first derivation of this polynomial.
	 * The first derivation of a polynomal
	 * a<sub>0</sub>x<sup>0</sup> + a<sub>1</sub>x<sup>1</sup> + ... + 
	 * a<sub>n-1</sub>x<sup>n-1</sup> + a<sub>n</sub>x<sup>n</sup> 
	 * is defined as
	 * 1 * a<sub>1</sub>x<sup>0</sup> + ... + 
	 * (n-1)a<sub>n-1</sub>x<sup>n-2</sup> + n a<sub>n</sub>x<sup>n-1</sup>.
	 */
	public Polynomial getFirstDerivation() {
		Polynomial firstDerivation = null;
		
		if ( getDegree() > 0 ) {
			double [] coefficientsOfDerivation = new double[coefficients.length -1];
			for (int i = 1; i < coefficients.length; i++) {
				coefficientsOfDerivation[i-1] = coefficients[i] * i;
			}
			firstDerivation = new Polynomial(coefficientsOfDerivation);
		} else {
			firstDerivation = new Polynomial();
		}
		
		return firstDerivation;
	}
	
}
