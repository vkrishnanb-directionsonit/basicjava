package edu.lessons.day99.rmi.server;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MathServerInf extends Remote
{
	public long add(int a, int b) throws RemoteException;
	public long sub(int a, int b) throws RemoteException;
	public long product(int a, int b) throws RemoteException;
	public float div(int a, int b) throws RemoteException;
	public void setName(String value)throws RemoteException;
	public String getName()throws RemoteException;
}