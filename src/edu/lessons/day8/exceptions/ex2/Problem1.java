package edu.lessons.day8.exceptions.ex2;

import java.io.IOException;

public class Problem1 
{

}
  class ExceptionA
 {
  public static void main(String args[]) throws IOException
  {
	  System.out.println("A");
	  throw new java.io.IOException("Testing");
	  /*try
	  {
		  throw new java.io.IOException("Testing");
	  }
	  catch(java.io.IOException t)
	  {
		  System.out.println("B");
	  }*/
	  //System.out.println("C");
  }
 }
