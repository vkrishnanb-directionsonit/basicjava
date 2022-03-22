package edu.lessons.day38.arrays;

/**
 * DigitSum is responisble for
 * calculation the sum of digits for a given
 * character sequence.
 *
 * @author pape
 */
public class DigitSum {

    /**
     * Returns the digit sum from the given sequence
     * of digits <code>number</code> ('0' to '9').
     * <code>number</code> must only consists of digit characters.
     */
    public long getDigitSum(char [] number)
    {
        long digitSum = 0L;
        for (char c : number)
        {
            digitSum += c - '0';
        }
        return digitSum;
    }
}
