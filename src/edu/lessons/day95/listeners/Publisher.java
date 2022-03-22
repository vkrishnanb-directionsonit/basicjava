package edu.lessons.day95.listeners;
import java.util.Scanner;
public class Publisher 
{
	ISignalListener s1=null;
	
	public void setListener(ISignalListener signal)
	{
		s1=signal;// register for the event notification
	}
	public void changeSignal()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Which color do u want"+
	   " the signal to change (Green/Yellow/Red");
	   String signalColor=sc.next();
	   if(null!=s1)
	   {
		   if(signalColor.equals("Green"))
			   s1.changedToGreen(); // raising the event
		   else if(signalColor.equals("Red"))
			   s1.changedToRed();// raising the event
	   }
	   sc.close();
   }
}
