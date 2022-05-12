package edu.lessons.day60.oops.usingFinal;

public class Phone {
	public void makeACall()
	{
		System.out.println("Call made...");
	}
	public final void sendSMS()
	{
		System.out.println("SMS send...");
	}
}
class Nokia extends Phone
{
	@Override
	public void makeACall()
	{
		System.out.println("Call made from Nokia");
	}
//	@Override
//	public  void sendSMS()
//	{
//		System.out.println("SMS send...");
//	}
}
