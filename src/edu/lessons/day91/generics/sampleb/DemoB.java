package edu.lessons.day91.generics.sampleb;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class DemoB
{
  public static void main(String[] args)
  {
		Customer c1=new Customer();
		//c1.Orders=new ArrayList();
		c1.Orders=new ArrayList<Order>();

		c1.CID=123;
		c1.CName="Jobs";
		c1.Address="Street 122";
		c1.City="Chennai";
		//Store Orders to Customers
		for(int i=0;i<10;i++)
		{
			Order or=new Order();
			or.No=i;
			or.Amount=i*25.50;
			c1.Orders.add(or);
		}

		//c1.Orders.add(new Object());
		//c1.Orders.add("Hello");

		//Get Orders from Customers
	  System.out.println("Size "+c1.Orders.size());
	   Iterator<Order> itr = c1.Orders.iterator();
	  while(itr.hasNext())
	  {
		Object element = itr.next();
		Order ord=null;
		try
		{
			ord=(Order)element;
	    }
	    catch(Exception err)
	    {
			System.out.println(err.getClass().getName());
			System.out.println(err.getMessage());
		}
		System.out.println(ord.No + " "+ord.Amount);
     }
  }
}
