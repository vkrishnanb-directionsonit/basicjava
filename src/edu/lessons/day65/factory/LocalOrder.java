package edu.lessons.day65.factory;
class LocalOrder implements IOrder
{
	int price;
	public LocalOrder(int amt)
	{
		 System.out.println("LocalOrder "+amt);
		price=amt;
	}
public void getProduct()
{

     System.out.println("product from local");
}
public void getPrice()
{
    System.out.println("price from local "+price);
}
}