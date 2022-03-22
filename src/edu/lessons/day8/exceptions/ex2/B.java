package edu.lessons.day8.exceptions.ex2;
import java.io.*;
	class Granary
	{
	    public void canal() throws IOException
	    {
	    	System.out.println("canal");
	    }
	}
	public class B extends Granary
	{
//	    public void canal() throws Exception // InValid
//	    {
//	    	System.out.println("canal");
//	    }
//	    public void canal() throws IOException // Valid
//	    {
//	    	System.out.println("canal");
//	    }
	    public void canal(int i) throws Exception
	    {
	    	System.out.println("mmill.canal");
	    }
	    public void  canal(long i) 
	    {
	    	System.out.print("i");
	    }
	}