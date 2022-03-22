package edu.lessons.day32.misc;

/**
 * Implements getDezimalWert() with
 * if-else. 
 * 
 * @author pape
 */
public class HexadecimalDigitIf extends AbstractHexadecimalDigit {

	public int getDecimalValue() {
		if ( '0' <= digit && digit <= '9') {
			return digit - '0';
		} else if ('a' <= digit && digit <= 'f') {
			return digit - 'a' + 10;
		} else if ('A' <= digit && digit <= 'F') {
			return digit - 'A' + 10;
		}
		
		return -1;
	}

}
