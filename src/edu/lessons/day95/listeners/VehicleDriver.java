package edu.lessons.day95.listeners;

public class VehicleDriver implements ISignalListener 
{
	@Override
	public void changedToRed() 
	{
		System.out.println("Please STOP!!!");
	}
	@Override
	public void changedToGreen() 
	{
		System.out.println("You can GOooooooooo- Thankyou");
	}
}
