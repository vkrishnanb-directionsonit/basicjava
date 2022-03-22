package edu.lessons.day60.oops.interfaces;

public class SmartPhone implements MPhone,ICalculator // child class
{
	public SmartPhone()
	{
		System.out.println("SmartPhone Created");
	}
	@Override
	public void sendMessage() 
	{ 
		System.out.println("Msg Sent");
	}
	@Override
	public void receiveMessage() { System.out.println("receiveMessage");	}
	@Override
	public void makeACall() { System.out.println("makeACall");	}
	@Override
	public void receiveACall() { System.out.println("receiveACall");	}
	
	public void resume()
	{
		System.out.println("SmartPhone.Continue");
	}
	public void echo()
	{
		System.out.println("SmartPhone.echo");
	}
	@Override
	public int add(int v1, int v2) {
		return v1+v2;
	}
	@Override
	public int multiply(int v1, int v2) {
		return v1*v2;
	}
	@Override
	public int divide(int v1, int v2) {
		return v1/v2;
	}
}
