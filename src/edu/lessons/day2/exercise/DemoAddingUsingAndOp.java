package edu.lessons.day2.exercise;

public class DemoAddingUsingAndOp {

	public static void testAddIterative() 
	{
		int x=123;
		int y=567;
		int z=addIterative(x,y);
		System.out.println(z);
	}
	public static int addIterative(int a, int b){  
		System.out.println(" a="+a+" "+" b="+b);
        while (b != 0){
            int carry = (a & b) ; //CARRY is AND of two bits
          System.out.print(carry+" ");
            a = a ^b; //SUM of two bits is A XOR B
            System.out.print(" a="+a+" ");
            b = carry << 1; //shifts carry to 1 bit to calculate sum
            System.out.print(" b="+b+" ");
        }
        System.out.println(); 
        return a;
 }
}
