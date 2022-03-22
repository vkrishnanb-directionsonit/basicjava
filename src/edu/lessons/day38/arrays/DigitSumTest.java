package edu.lessons.day38.arrays;


public class DigitSumTest  {
	public static void main(String[] args)
	{
		DigitSumTest test=new DigitSumTest();
		test.testGetDigitSum();
		test.testGetDigitSum1();
		test.testGetDigitSum2();
	}
    private DigitSum digitSum = new DigitSum();
    
    public void testGetDigitSum() {
        char [] number = {'0'};
       System.out.println(digitSum.getDigitSum(number)); 
//        assertEquals(0, digitSum.getDigitSum(number));
    }

    public void testGetDigitSum1() {
        char [] number = {'1', '2', '3', '4', '5'};
        System.out.println(digitSum.getDigitSum(number)); 
//        assertEquals(15, digitSum.getDigitSum(number));
    }
    
    public void testGetDigitSum2() {
        char [] number = new char[1000];
        for (int i = 0; i < number.length; i++) {
            number[i] = '1';
        }
        System.out.println(digitSum.getDigitSum(number)); 
//        assertEquals(1000, digitSum.getDigitSum(number));
    }
}
