package edu.lessons.day65.factory;
public abstract class IOrderFactory
{
  protected abstract IOrder create();
  
  public static IOrder createOrder(String str)throws Exception
  {
	  IOrderFactory fac=null;
	 try
	 {
		
	    fac=(IOrderFactory)Class.forName(str).newInstance();
	 } catch(ClassNotFoundException e)
	 {
		throw new RuntimeException("Bad Order creation: ");
	 }
    return fac.create();
  }
}