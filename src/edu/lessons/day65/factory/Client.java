package edu.lessons.day65.factory;
class Client
{
  public static void main(String args[])
  {
	  java.util.Scanner sc=new java.util.Scanner(System.in);
    try{
    	System.out.println("Enter the service Factory Name");
			IOrder i = IOrderFactory.createOrder(sc.next());
			i.getProduct();
			i.getPrice();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	    finally
	    {
	      sc.close();	
	    }
	}
}