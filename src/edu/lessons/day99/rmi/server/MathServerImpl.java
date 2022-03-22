package edu.lessons.day99.rmi.server;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class MathServerImpl extends UnicastRemoteObject 
							implements MathServerInf
{
	private String strName;
	public MathServerImpl() throws RemoteException
	{
		System.out.println("MathServerImpl created");
	}
	public void setName(String value)throws RemoteException
	{
		System.out.println("setName "+value);
		strName=value;
	}
	public String getName()throws RemoteException
	{
		System.out.println("getName "+strName);
		return strName;
	}
	public long add(int a, int b) throws RemoteException
	{
		System.out.println("Add Called "+a+"-"+b);
		return (a+b);
	}

	public long sub(int a, int b) throws RemoteException
	{
		System.out.println("Sub Called "+a+"-"+b);
		return (Math.abs(a-b));
	}

	public long product(int a, int b) throws RemoteException
	{
		System.out.println("Product Called "+a+"-"+b);
		return (a*b);
	}

	public float div(int a, int b) throws RemoteException
	{
		System.out.println("Div Called "+a+"-"+b);
		return (a/b);
	}
}