package edu.lessons.day38.arrays;

/**
 * Find the minimum distance
 * of two neighbouring numbers in a int array.
 *
 * 
 */
public class MinimumDistance {

    /**
     * Returns the index of the first number
     * of two neighbouring numbers with minimum distance to
     * each others.
     */
    public int getIndexOfMinimumDistance(int [] numbers)
    {
        int index = 0;
        for (int i = 1; i < numbers.length - 1; i++)
        {
            if ( Math.abs( numbers[index] - numbers[index + 1]) >
                Math.abs( numbers[i] - numbers[i + 1]))
                {
                	index = i;
            	}
        }

        return index;
    }
}
