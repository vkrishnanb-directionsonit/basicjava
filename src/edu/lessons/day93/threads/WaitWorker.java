package edu.lessons.day93.threads;

public class WaitWorker implements Runnable{
	int amount=0;
	public void run()
	{
		callme();
	}
	public synchronized void callme()
	{
		long thid=Thread.currentThread().getId();
	 amount=0;
	 try{
	   for(int i=0;i<10;i++)
	   {
		 amount+=i;
	     System.out.println(Thread.currentThread().getName() + "  " + amount);
   	     if(2==i)
   	     {
       	  if(Thread.currentThread().getName().equals("3 T"))
			notify();
       	  
		  System.out.println(Thread.currentThread().getName() + "Wait");
	   	  wait();
		 }
		 notify();
	    }
	  }catch(Exception e){System.out.println(e.getMessage());}
	}
}
