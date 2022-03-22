package edu.lessons.day60.oops.interfaces;

public interface PaymentServices {
	public void pay();
}

interface BitCoinService {
	 public void pay();	  
	public void transfer();	   
}
interface GooglePayService extends PaymentServices,BitCoinService {
	public void receive();
}
class OnlinePayment implements GooglePayService {
	   public void pay() {
	      System.out.println("pay");
	   }
	   public void transfer() {
	      System.out.println("transfer");
	   }
	   public void receive() {
	      System.out.println("receive");
	   }	  
}
class TestMultipleInhetitanceOfInterfaces
{
	public static void main(String[] args)
	{
		OnlinePayment payment =  new OnlinePayment();
		payment.pay();
		payment.transfer();
		payment.receive();
	}
}