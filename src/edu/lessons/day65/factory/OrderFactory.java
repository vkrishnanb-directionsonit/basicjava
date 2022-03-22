package edu.lessons.day65.factory;
public class OrderFactory extends IOrderFactory
{
 protected  IOrder create()
  {
        return new LocalOrder(150);
  }
}