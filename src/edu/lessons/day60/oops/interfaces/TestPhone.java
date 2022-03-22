package edu.lessons.day60.oops.interfaces;

public class TestPhone {
	public static void main(String[] args) {
		m2();
	}
	public static void m1()
	{
		MPhone m1=new ApplePhone();
		callMphoneMethods(m1);
	}
	
	public static void m2()
	{
		Object obj=new ApplePhone();

		callMphoneMethods(obj);
	}
	public static void callMphoneMethods(Object ob)
	{
//		ob.makeACall();
//		ob.receiveACall();
//		ob.receiveMessage();
//		ob.sendMessage();
		if(ob instanceof MPhone)
		{
			MPhone m1=(MPhone)ob;
			m1.makeACall();
			m1.receiveACall();
			m1.receiveMessage();
			m1.sendMessage();
		}
		else
			System.out.println("Object is not a MPhone");
	}
	public static void m3()
	{
		MPhone m1=null;
		Object obj=new ApplePhone();
		if(obj instanceof MPhone)
		{
			m1=(MPhone)obj;
			System.out.println("m1 is a Mobile Phone");
			m1.makeACall();
			m1.receiveACall();
			m1.receiveMessage();
			m1.sendMessage();
		}
		
		m1=new SmartPhone();
		m1.sendMessage();
		//m1.echo();
		
		SmartPhone s1=(SmartPhone)m1;
		s1.echo();
		
		if(m1 instanceof ICalculator)
		{
			ICalculator c1=(ICalculator)m1;
			System.out.println(	c1.add(100,50));
			System.out.println(	c1.multiply(100,50));
			System.out.println(	c1.divide(100,50));
		}
		else
			System.out.println("Not A Calculator");
		
		
	}
}
