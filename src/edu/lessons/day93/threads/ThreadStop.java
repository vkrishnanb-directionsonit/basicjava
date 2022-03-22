package edu.lessons.day93.threads;
public class ThreadStop {
	public static void main(String args[])
	{
	  try{
	  RunnableWorker obj=new RunnableWorker();
	  Thread t1=new Thread(obj);
	  Thread t2=new Thread(obj);
	  
		t1.start();
		t2.start();
		//Thread.sleep(15000);
		t1.join(10000);
		if(t1.isAlive()) t1.stop();
		t2.join(12000);
		if(t2.isAlive()) t2.stop();
		
		System.out.println("From Main AMT: " + obj.amount);
		System.out.println("T1 State "+t1.getState());
		System.out.println("T2 State "+t2.getState());
	 }catch(Exception e)
	  {
		 System.out.println(e.getMessage());}
	}
}
