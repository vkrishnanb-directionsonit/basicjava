package edu.lessons.day60.oops.usingFinal;

public  class MySingleton 
{
  private final static MySingleton obj=new MySingleton();
  public int x;
  public String name;
  
  private MySingleton(){}//private constructor
  
  public static MySingleton getObject() // factory method
  {
	  return obj;
  }
  public void echo()
  {
	  System.out.println("Hashcode "+hashCode());
	  System.out.println("X="+x+" name="+name);
  }
}
