package edu.lessons.day91.generics.samplec;

import java.util.List;

public class DemoC
{
  public static void main(String[] args)
  {
		Customer<Order> c1=new Customer<Order>(10);
		Customer<Complaint> c2=new Customer<Complaint>(5);

		c1.CID=123;
		c1.CName="Jobs";
		c1.Address="Street 122";
		c1.City="Chennai";
         //adding Orders
		for(int i=0;i<10;i++)
		{
			Order or=new Order();
			or.No=i;
			or.Amount=i*25.50;
			c1.add(or);
			
		}

		List<Order> data=c1.getAll();
		 System.out.println("Order count "+data.size());
		 System.out.println("***********");


		for(int i=0;i<10;i++)
		{
			Complaint c=new Complaint();
			c.TicketNo=i;
		    c.Description="Product Fault No"+i*253;
			c2.add(c);
		}
		List<Complaint> data2=c2.getAll();
	  System.out.println("Complaint count "+data2.size());
	  System.out.println("***********");
  }
}
