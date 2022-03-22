package edu.lessons.day65.factory;
class PurchaseOrder implements IOrder
{
	public PurchaseOrder()
	{
		System.out.println("PurchaseOrder");
	}
   public void getProduct()
   {
       System.out.println("PurchaseOrder called for product");
}
   public void getPrice()
   {
      System.out.println("PurchaseOrder called for price");
	}
}