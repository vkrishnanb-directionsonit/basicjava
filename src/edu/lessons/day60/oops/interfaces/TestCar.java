package edu.lessons.day60.oops.interfaces;

public class TestCar {
	public static void main(String[] args) 
	{
	   VehicleCar obj=new VehicleCar();
	   m2(obj);
	   String s1="HelloCar";
	   m2(s1);
	}
	public static void m1()
	{
		IVehicle v1;//=new IVehicle();
		v1=new VehicleCar();
		v1.echo();
		v1.start();
		v1.stop();
		//v1.park();
		// type cast the Object to the Car class
		VehicleCar c1=(VehicleCar)v1;			
		c1.park();
	
	}
	public static void m2(Object obj)
	{
		if(obj instanceof IVehicle)
		{
			IVehicle v1=(IVehicle)obj;
			v1.echo();
			v1.start();
			v1.stop();
		}
		else
			System.out.println(obj+" is Not a Vehicle...");
	}
	
	
	
	
	
	
	
	public static void m3()
	{
		VehicleCar v1=new VehicleCar();
		runVehicle(v1);
		VehicleShip v2=new VehicleShip();
		runVehicle(v2);
		String s1="I am also a Vehicle";
		runVehicle(s1);
	}
    public static void runVehicle(Object obj)
    {
		if(obj instanceof IVehicle)
		{
			IVehicle v1=(IVehicle)obj; 
			v1.echo();
			v1.start();
			v1.stop();
		}
		else
			System.out.println(obj+" is Not a Vehicle");
    }

}
