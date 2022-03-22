package edu.lessons.day8.exceptions.ex2;

public class CalculatorB
{
	public int divide(int v1,int v2)throws NumberIsZeroException
	{
       int result=0;
       boolean flag=(0==v2);         
       if(flag)
       {
    	 NumberIsZeroException err=
    	   new NumberIsZeroException("Value is == Zero!!!");   
          throw err;
       }
       /*if(flag)
       {
    	ArithmeticException err1=new ArithmeticException("Test Msg");
    	NumberIsZeroException err=
    	   new NumberIsZeroException("Value is == Zero!!!",err1);   
          throw err;
       }*/
        result=v1/v2;
		return result;
	}
}