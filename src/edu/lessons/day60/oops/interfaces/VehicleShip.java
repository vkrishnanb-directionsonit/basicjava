package edu.lessons.day60.oops.interfaces;

public class VehicleShip implements IVehicle {

	@Override
	public void echo() {
		System.out.println("Ship.Echo");
	}

	@Override
	public void start() {
		System.out.println("Ship.Start");
	}

	@Override
	public void stop() {
		System.out.println("Ship.Stop");
	}

}
