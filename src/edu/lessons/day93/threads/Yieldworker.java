package edu.lessons.day93.threads;
public class Yieldworker implements Runnable{
	int amount=0;
	public void run()
	{
		callme();
		}
	public  void callme()
	{
	amount=0;
	 try{
	   for(int i=0;i<5;i++)
	   {
			amount+=i;
	   	System.out.println(Thread.currentThread().getName() + "  " + amount);
	   	//Thread.sleep(1000);
	   	if(Thread.currentThread().getName().equals("first Thread "))
     	  Thread.yield();
	   }
	   //Thread.yield();
	  }catch(Exception e)
	  {
		  System.out.println(e.getMessage());
	 }
	}
}
