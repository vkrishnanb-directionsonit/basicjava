package edu.lessons.day60.oops.interfaces;

public class VehicleCar implements IVehicle 
{
	@Override
	public void echo() 
	{
		System.out.println("Car.Echo");
	}
	@Override
	public void start() 
	{
		System.out.println("Car.Start");
	}
	@Override
	public void stop() 
	{
		System.out.println("Car.Stop");
	}
	public void park() 
	{
		System.out.println("Car.Parked");
	}
}
