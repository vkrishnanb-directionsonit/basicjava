package edu.lessons.day93.threads;
public class ThreadYeild{
	public static void main(String args[])
	{
	  Yieldworker obj=new Yieldworker();
	  Thread t1=new Thread(obj);
	  Thread t2=new Thread(obj);
	  t1.setName("first Thread ");
	  t2.setName("Second Thread ");
		t1.start();
		t2.start();
	}
}
