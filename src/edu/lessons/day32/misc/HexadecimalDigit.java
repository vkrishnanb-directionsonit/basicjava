package edu.lessons.day32.misc;

/**
 * An abstract data type encapsulating one hexadecimal digit.
 * 
 * @author pape
 *
 */
public interface HexadecimalDigit {

	/**
	 * Returns the decimal value of this digit (0 - 15).
	 * Returns -1 if this digit is not in the range 0-9,'a'-'f', 'A'-'F'
	 */
	public int getDecimalValue();
	
	/**
	 * Sets the digit of this hexadecimal digit 
	 * to a new value. The valid range are characters
	 * '0'-'9', 'a'-'f', and 'A'-'F'.
	 */
	public void setDigit(char digit);
}
