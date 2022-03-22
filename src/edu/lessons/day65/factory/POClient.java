package edu.lessons.day65.factory;

public class POClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IOrder ord=PurchaseOrderFactory.createPO();
		ord.getPrice();
		ord.getProduct();
	}

}
