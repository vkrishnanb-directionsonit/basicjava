package edu.lessons.day60.oops.interfaces;

public class VehicleClassA extends VehicleCar  
					implements ICalculator
{

	@Override
	public void echo() {
		System.out.println("ClassA.Echo");
	}

	@Override
	public void start() {
		System.out.println("ClassA.Start");
	}

	@Override
	public void stop() {
		System.out.println("ClassA.Stop");
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
