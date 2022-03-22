package edu.lessons.day93.threads;
public class SynchronizedWorker implements Runnable
{
	public void run()
	{
		doWork();
	}

	int amount=0;
	public synchronized void doWork()
	{
		amount=0;
		long id=Thread.currentThread().getId();
		 try{
		   for(int i=0;i<5;i++)
		   {
			amount+=i;
			System.out.println("ID=" +id+ " Amt= " + amount);
			Thread.sleep(3000);
			}
		  }catch(Exception e)
		  {
			  System.out.println(e.getMessage());
		  }
	}
}
