package edu.lessons.day4.classNmethods;

public class TestBox {
	public static void main(String[] args) 
	{
		m1();
	}
	//Similar Objects but not the same
		public static void m1()
		{
			Box b1=new Box();
			//Similar Objects but not the same
			Box b2=new Box();
			//Same Object
			Box b3=b1;			
			System.out.println("HashCode "+b1.hashCode());
			System.out.println("HashCode "+b2.hashCode());
			System.out.println("HashCode "+b3.hashCode());
			System.out.println("B1.equals(b2) "+b1.equals(b2));//false
			System.out.println("B1.equals(b3) "+b1.equals(b3));//true
		}

		public static void m2() 
		{
			Box b1=new Box();
			Box b2=new Box();
			Box b3=new Box();
			
			System.out.println("Box 1 HC "+b1.hashCode());
			System.out.println("b1.getClass() "+b1.getClass().getName());
			System.out.println("b1.toString() "+b1.toString());
			System.out.println("b1.equals(b2) "+b1.equals(b2));
		}
		
		public static void m3()
		{
			WoodenBox wb1=new WoodenBox();
			wb1.echo();
			WoodenBox wb2=new WoodenBox(10,20);
			wb2.echo();
		}
}
