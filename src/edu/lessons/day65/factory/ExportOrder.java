package edu.lessons.day65.factory;
class ExportOrder implements IOrder
{
	public ExportOrder(int x,int y)
	{
		       System.out.println("ExportOrder "+x+" "+y);
	}
public void getProduct()
   {
       System.out.println("product from export");
   }
public void getPrice()
   {
 System.out.println("price from export");
   }
}