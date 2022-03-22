package edu.lessons.day8.exceptions.ex2;
public class ClassA
{
   public  double execute(int v1,int v2)throws Exception
   {
		double z=0;
		ClassB b1=new ClassB();
		try
		{
			z=b1.execute(v1,v2);
		}
		catch(Exception err)
		{
			System.out.println("Error Inside ClassA "+err.getMessage());
			err.printStackTrace();
			throw err; // re throw
		}
		return z;
   }
}
