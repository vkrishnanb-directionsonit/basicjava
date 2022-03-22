package edu.lessons.day8.exceptions.ex1;
import java.util.Scanner;

public class DemoA
{
   public static void main(String[] args)
   {
		m1();
   }
    public static void m0()
    {
	   	java.util.Scanner sc=new Scanner(System.in);
		int x=0;
		int y=0;
		int z=0;
		System.out.println("Enter value for X");
		x=sc.nextInt();
		System.out.println("Enter value for Y");
		y=sc.nextInt();
		z=x/y;
		System.out.println("Result "+z);
		sc.close();
   }
    
   public static void m1()
   {
	   System.out.println("Before Try");
	   java.util.Scanner sc=null;
	   int x=0; int y=0;  int z=0;	   
	try
	{
   		System.out.println("Inside Try");
   		sc=new Scanner(System.in);
 	   System.out.println("Enter value for X");
 	   x=sc.nextInt();sc.nextLine();
    	System.out.println("Enter value for Y");
    	y=sc.nextInt();sc.nextLine();
		z=x/y;
   		System.out.println("Result "+z);
	 } catch(Exception err)
	  {
	   	 System.out.println("Inside Catch Message- "+err.getMessage());
	   	 System.out.println("Error Type "+err.getClass().getName());
 	   }
	   finally
	   {
	   	   	System.out.println("Inside Finally");
	   	   	sc.close();
   	   }
	   System.out.println("After Finally ");
   }
    public static void m2()
   {
	 System.out.println("Before Try");
     int x=0;  int y=0;    	int z=0;
     String s1=null;	String s2=null;
   	 java.util.Scanner sc=new Scanner(System.in);
   	 System.out.println("Enter value for X");
     s1=sc.nextLine();
   	  try
   	   {
   		 System.out.println("Inside Try");
	    
	     System.out.println("Enter value for Y");
	     s2=sc.nextLine();
		 x=Integer.parseInt(s1);
		 y=Integer.parseInt(s2);
		 z=x/y;
		 System.out.println("Result "+z);
   	   }catch(Exception err)
   	   {
   	   	System.out.println("Inside Catch");
   	   	System.out.println("Message "+err.getMessage());	   	
   	   }finally
   	   {   	System.out.println("Inside Finally");
	   	   	sc.close();
	   }
	   System.out.println("After Finally ");
   }
    public static void m3()
   {
	    int x=0;
		int y=0;
		System.out.println("Before Try1");
		java.util.Scanner sc=new Scanner(System.in);
		try//try1
		{
			System.out.println("Inside Try1");
			System.out.println("Enter value for X");
		     
			y=sc.nextInt();
		}catch(Exception err)
		{
			System.out.println("Inside Catch1");
		}
		finally
		{
			System.out.println("Inside Finally1");
		}//end of try1
		System.out.println("After Finally 1");

		System.out.println("Before Try2");
		try//try 2
		{
			System.out.println("Inside Try2");
		}catch(Exception err)
		{
			System.out.println("Inside Catch2");
		}
		finally
		{
			System.out.println("Inside Finally2");
		}//end of try2
	   System.out.println("After Finally 2");
   }
    public static void m4()
    {
 	   	System.out.println("Before Try");
     	int x=0;int y=0;int z=0;
     	String s1=null;String s2=null;
    	java.util.Scanner sc=null;
    	try
    	{
    		sc=new Scanner(System.in);
    		System.out.println("Inside Try");
 	    	System.out.println("Enter value for X");
 	    	s1=sc.nextLine();
 	    	System.out.println("Enter value for Y");
			s2=sc.nextLine();
			x=Integer.parseInt(s1);
			y=Integer.parseInt(s2);
			z=x/y;
			System.out.println("Result "+z);
 	   	}
    	/*catch(Exception err)
	   	  {
	   	   	System.out.println("Inside Catch3 "+err.getMessage());
		   	 System.out.println("ErrorType "+err.getClass().getName());
	   	  }*/
    	catch(ArithmeticException err)
	   	{
	   	   	System.out.println("Inside Catch1 "+err.getMessage());
	   	   	System.out.println("ErrorType "+err.getClass().getName());
	   	}
    	catch(NumberFormatException err)
	   	{
  	   	   	System.out.println("Inside Catch2 "+err.getMessage());
  		   	System.out.println("ErrorType "+err.getClass().getName());
	   	}
    	catch(Exception err)
 	   	{
  	   	   	System.out.println("Inside Catch3 "+err.getMessage());
  		   	System.out.println("ErrorType "+err.getClass().getName());
 	   	}
 	   	finally
 	   	{
 	   	   	System.out.println("Inside Finally");
 	   	}
 	   System.out.println("After Finally ");
    }
  }