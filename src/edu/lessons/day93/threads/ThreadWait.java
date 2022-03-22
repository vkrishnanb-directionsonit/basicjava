package edu.lessons.day93.threads;
public class ThreadWait{
	public static void main(String args[])
	{
	  try{
	  WaitWorker obj=new WaitWorker();
	  Thread t1=new Thread(obj);
	  Thread t2=new Thread(obj);
  	  Thread t3=new Thread(obj);
	  t1.setName("first Thread ");
	 // t1.setPriority(Thread.MAX_PRIORITY);
	  t2.setName("Second Thread ");
  	  t3.setName("3 T");
	  //t3.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		 System.out.println("From Main AMT: " + obj.amount);
		 }catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		}
	}
}
