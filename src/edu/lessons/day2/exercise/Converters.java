package edu.lessons.day2.exercise;

public class Converters {
	
	public static void convertInchestoMeters(int inches) 
	{
		float meters=0;
		float meter2IncheConvertion=39.37f;
		meters=(float)inches/meter2IncheConvertion;
		System.out.println(inches+" inches is "+meters+" meters");
	}
	public static void convertUSDtoINR(int usd) 
	{
		float rupees=0;
		float inr2usdConvertion=64;
		rupees=usd*inr2usdConvertion;
		System.out.println(usd+" USD is "+rupees+" Rupees");
	}
	public static void convertMeterstoInches(int meters) 
	{
		float inches=0;
		float meter2IncheConvertion=39.37f;
		inches=(float)meters*meter2IncheConvertion;
		System.out.println(meters+" meter is "+inches+" inches");
	}
	public static void convertINRtoUSD(int inr) 
	{
		float usd=0;
		float inr2usdConvertion=64;
		usd=inr/inr2usdConvertion;
		System.out.println(inr+" Rupee is "+usd+" US Dollars");
	}
	
	public static void m2()
	{
		int inches=144;
		float meters=0;
		int counter=0;
		float meter2IncheConvertion=1/39.37f;
		int totalinches=144;
		for(inches=1;inches<=totalinches;inches++)
		{
			meters=(float)inches*meter2IncheConvertion;
			System.out.println(inches+" inches is "+meters+" meters");
			counter++;
			if(counter==12)
			{
				System.out.println();
				counter=0;
			}
		}
	}
	public static void testConverters() 
	{
		convertInchestoMeters(144);
		convertUSDtoINR(1000);
		convertMeterstoInches(4);
	}
}
