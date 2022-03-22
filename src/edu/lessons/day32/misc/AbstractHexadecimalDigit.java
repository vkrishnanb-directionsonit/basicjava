package edu.lessons.day32.misc;

/**
 * One hexadecimal digit as a char-value
 * in the range '0'-'9', 'a'-'f', and 'A'-'F'.
 * 
 * @author pape
 */
public abstract class AbstractHexadecimalDigit implements HexadecimalDigit {

	protected char digit;
	
	public void setDigit(char digit) {
		this.digit = digit;
	}
}
