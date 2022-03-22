package edu.lessons.day38.arrays;


public class MinimumDistanceTest {

    private MinimumDistance minimumDistance = new MinimumDistance();
    
    public void testGetIndexOfMinimumDistance() {
        int [] numbers = {1, 1};
        
//        assertEquals(0, minimumDistance.getIndexOfMinimumDistance(numbers));
    }

    public void testGetIndexOfMinimumDistance1() {
        int [] numbers = {1, 3, 2};
        
//        assertEquals(1, minimumDistance.getIndexOfMinimumDistance(numbers));
    }

    public void testGetIndexOfMinimumDistance2() {
        int [] numbers = {1, 3, 2, 3, 7, 9, 9, 8, 2, 2};
        
//        assertEquals(5, minimumDistance.getIndexOfMinimumDistance(numbers));
    }
}
