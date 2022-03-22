package edu.lessons.day8.exceptions.ex2;
public class ClassB
{
	//Avoid re throwing Exceptions 
	   public  int execute(int x,int y)throws Exception
	   {
	   		int result=0;
	   		CalculatorA c1=null;
	   		try
	   		{
				c1=new CalculatorA();
				result=c1.divide(x,y);
			}catch(Exception err)
			{
				System.out.println("Inside ClassB "+err.getMessage());
				throw err; //re throw Error
			}
			return result;
	   }
	//avoid this way of implementation
	//Catch suppresses the Exception
   public  int executeTaskA(int x,int y)
   {
   		int result=0;
   		CalculatorB c1=null;			
		try
   		{
			c1=new CalculatorB();
			result=c1.divide(x,y);
		}catch(NumberIsZeroException err)
		{
		  System.out.println(err.getMessage());
		}
		return result;
   }
   public  int executeTaskB(int x,int y)throws NumberIsZeroException
   {
   		int result=0;
   		CalculatorB c1=null;
		c1=new CalculatorB();
		result=c1.divide(x,y);
		return result;
   }
   
   //“throws ArrayIndexOutOfBoundsException
   public  int executeTaskC(int args[])
		   						throws ArrayIndexOutOfBoundsException
   {
   		int result=0;
		result=args[0]/args[1];
		return result;
   }
}











