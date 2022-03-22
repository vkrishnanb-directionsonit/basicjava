package edu.lessons.day95.listeners;

public class TestSignal 
{
	public static void main(String[] args) 
	{
		ISignalListener s=new VehicleDriver();// Load the listener
		Publisher p1=new Publisher();// load the publisher
		p1.setListener(s);// register the listener with the Publisher
		p1.changeSignal();// change data
	}
}
