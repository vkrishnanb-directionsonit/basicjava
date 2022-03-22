package edu.lessons.day4.classes.latebindingearlybinding;

public  class Phone 
{
	public final long phoneNo;
	public int frontCameraPixel;
	public int rearCameraPixel;
	public float cost;
	public String model;
	public String manufacturer;
	public int memory;
	public int ram;
	public java.util.Date dataofPurchase;
	public String planDetails;
	
	public Phone(long no){phoneNo=no;}
	
	public void sendMSG(long toNo ,String outmsg)
    {
    	System.out.println("Phone.sendMSG");
    }
	public void receiveMSG(String incomingmsg )
    {
    	System.out.println("Phone.receiveMSG "+incomingmsg);
    }
	public void makeCall(long no)
    {
    	System.out.println("Phone.makeCall to "+no);
    }
	public void receiveCall(long fromNo)
    {
    	System.out.println("Phone.receiveCall from "+fromNo);
    }
}
