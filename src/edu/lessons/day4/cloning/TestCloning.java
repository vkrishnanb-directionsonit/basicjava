package edu.lessons.day4.cloning;

public class TestCloning {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.regNo=12345;
		System.out.println("1."+ c1.toString() + " HashCode " + c1.hashCode());
		try
		{
			Car c2=c1.createClone();
			c1.regNo=100000;
			System.out.println("2."+ c2.toString() + " HashCode " + c2.hashCode());
			System.out.println("3."+ c1.toString() + " HashCode " + c1.hashCode());
		}catch(CloneNotSupportedException err)
		{
			err.printStackTrace();
		}
	}

}
