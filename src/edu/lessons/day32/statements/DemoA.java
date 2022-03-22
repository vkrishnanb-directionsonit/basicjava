package edu.lessons.day32.statements;

import java.util.Scanner;

public class DemoA 
{
	public static void testA() 
	{
		m4();
	}
	//acceptable types for switch - int, String, enum
	public static void m1()
	{
		byte x=10; //true
		//long x=10;
		//char x=67; //ok
		//float x=10;
		//short x=10; //ok
		//Long x=new Long(10);
		//int x=10;
		switch(x)
		{
		    default:  
		        System.out.println("Hello " +x);
		}

	}
	public void testB(int x)
	{
	    int odd = x % 2;
	    if(odd!=0)  
	    {
	        System.out.println("odd");
	    }
	    else
	    {
	        System.out.println("even");
	    }
	}
	public void loop()
    {
        int x= 0;
        /*while ( 1 )  
        {
            System.out.print("x plus one is " + (x + 1));  
        }*/
    }
	// Which will be the first line to cause an error in the following code?
	/*(a) Line no. 54
	(b) Line no. 58
	(c) Line no. 61
	(d) Line no. 65*/

	public static void m2()
	{
		/*while(false)
		{
			System.out.println("Hello");
		}*/
		/*while(false)
		{
		}*/
		do;
		while(false);
		do
		{
			;
		}
		while(false);
	}
	public static void switchCaseDefaultAttheBegin()
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number");
		char k=(char)scanner.nextInt();
		switch(k)
		{

			default:
			  System.out.println("This is the default output");
			  break;
			case 10:
			    System.out.println("ten");
			    break;
			case 20:
			    System.out.println("twenty");
			    break;
		}
		scanner.close();
	}
	public static void m4()
	{
	    int k=10;
		switch(k){			
			case 10:
			  System.out.println("ten");
			  break;
			case 20:
			  System.out.println("twenty");
			  break;
			default: 
			  System.out.println("This is the default output");
			  break;
		}
    }
}
