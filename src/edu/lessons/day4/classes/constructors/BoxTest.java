package edu.lessons.day4.classes.constructors;

public class BoxTest {
	
	//Similar Objects but not the same
		public static void m1()
		{
			Box b1=new Box(10,20);
			//Similar Objects but not the same
			Box b2=new Box(10,20);
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
			Box b2=new Box(1000);
			
			System.out.println("Box 1 HC "+b1.hashCode());
			System.out.println("b1.getClass() "+b1.getClass().getName());
			System.out.println("b1.toString() "+b1.toString());
			System.out.println("b1.equals(b2) "+b1.equals(b2));
		}
}
