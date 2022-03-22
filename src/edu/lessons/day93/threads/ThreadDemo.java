package edu.lessons.day93.threads;
public class ThreadDemo
{
	public static void main(String args[])
	{
		 try
		 {
		   Thread t1=Thread.currentThread();
		   System.out.println("MainThread ID: " +t1.getId() );
		   Worker w=new Worker();
		   w.callme();
		   System.out.println("In Main After callme");		   
		 }catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
   	}
}