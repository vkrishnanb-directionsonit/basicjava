package edu.lessons.day4.classNmethods;
public class Radio 
{
   public String Model;
   public String Type;
   public String CurrentStation;
   public int NoofSpeakers;
   public String CurrentFreq;
   public Radio()
   {
	   System.out.println("Radio Loaded");
	   Model="Transister";
	   Type="2in1";
	   NoofSpeakers=2;
   }
   public void powerOn()
   {
	   System.out.println("Radio is on");
   }
   public void setStation(String s1)
   {
	   CurrentStation=s1;
	   System.out.println("The Station is Set to "+CurrentStation);
   }
   public void setFrequency(String f1)
   {
	   CurrentFreq=f1;
	   System.out.println("The Frequency is Set to "+CurrentFreq);
   }
   public void powerOff()
   {
	   System.out.println("Radio is off");
   }
}
