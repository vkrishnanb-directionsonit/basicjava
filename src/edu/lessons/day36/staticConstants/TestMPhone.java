package edu.lessons.day36.staticConstants;


public class TestMPhone {

	public static void main(String[] args) 
	{
		MPhone.type="SmartPhone 3G";
		
		MPhone m1=new MPhone("Galaxy s4");
		//MPhone.type="4G";//static field
		MPhone m2=new MPhone();
		MPhone m3=new MPhone("Iphone");
		//m1.model="Note"; //Final field
		//MPhone.planType="";// The final field MPhone.planType cannot be assigned
		m1.print();
		m2.print();
		m3.print();
		
	}

}
