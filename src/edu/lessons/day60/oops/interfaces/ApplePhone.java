package edu.lessons.day60.oops.interfaces;

public class ApplePhone implements MPhone {
	public void sendMessage() 
	{ 
		System.out.println("Msg Sent by IPhone Xs");
	}
	public void receiveMessage() 
	{ 
		System.out.println("receiveMessage by IPhone Xs");	
	}
	public void makeACall() 
	{ 
		System.out.println("makeACall by IPhone Xs");	
	}
	public void receiveACall() 
	{ 
		System.out.println("receiveACall by IPhone Xs");
	}
	

}
