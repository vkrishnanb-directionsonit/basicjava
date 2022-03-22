package edu.lessons.day32.labex;
//Write a program to differentiate the normal AND (&) 
//and the short-circuit version (&&) operation?.
 public class Document95  //LogicalOp
 {
	 public static void main(String args[])
	{
 		int n, d; n = 10; d = 2; 
		if(d != 0 && (n % d) == 0) 
			System.out.println("1st IF--> "+d + " is a factor of " + n); 
		else
 			System.out.println(d + " is Zero-->1st if");
		d = 0; // now, set d to zero
 		// Since d is zero, the second operand is not evaluated.
 		if(d != 0 && (n % d) == 0) 
 			System.out.println(d + " is a factor of " + n);
 		else
 			System.out.println(d + " is Zero-->2nd if");
		 /* Now, try same thing without short-circuit operator.
		 This will cause a divide-by-zero error. */
 		if(d != 0 & (n % d) == 0) 
 			System.out.println(d + " is a factor of " + n); 
 		else
 			System.out.println(d + " is Zero-->3rd if");
	} 
 }