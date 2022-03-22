package edu.lessons.day65.factory;
class ExportOrderFactory extends IOrderFactory
{
 protected  IOrder create()
  {
        return new ExportOrder(100,20);
  }
}