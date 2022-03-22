package edu.lessons.day32.flowControl;

/**
 * Prints out a multiplication table for all
 * number from 1 to 10.
 * 
 * @author 
 *
 */
public class MultiplicationTable {

    /**
     * Prints out the multiplication table.
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print( i * j );
                System.out.print("\t");
            }
            System.out.println();
        }
    }

}
