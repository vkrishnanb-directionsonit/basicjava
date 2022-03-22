package edu.lessons.day99.rmi.server;

import java.rmi.Naming;
public class MathHost
{
	public static void main(String args[])
	{
		try
		{
			MathServerImpl obj1 = new MathServerImpl();
			Naming.rebind("Mathrmi",obj1);
			System.out.println("Service started");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}