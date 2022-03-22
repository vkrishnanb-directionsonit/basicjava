package edu.lessons.day65.factory;
class PurchaseOrderFactory extends IOrderFactory
{
 protected  IOrder create()
  {
        return new PurchaseOrder();
  }
 public static IOrder createPO()
 {
	 return new PurchaseOrder();
 }
}