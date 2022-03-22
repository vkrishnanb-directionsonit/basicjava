package edu.lessons.day97.garbageCollections;

public class ClassA {
	  public Object obj=new Object();
	  public void m1()
	  {
		  Object obj2=new Object();
		  System.out.println("obj "+obj.hashCode());
		  System.out.println("obj2 "+obj2.hashCode());
	  }
	  public void m2()
	  {
		  Object obj3=new Object();
		  System.out.println("obj "+obj.hashCode());
		  System.out.println("obj3 "+obj3.hashCode());
	  }

}
