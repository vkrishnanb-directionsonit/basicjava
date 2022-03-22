package edu.lessons.day39.object;

public class TestObjectA {

	public static void main(String[] args) {
		Object ob1=new Object();
		System.out.println("OBJECT 1 HC "+ob1.hashCode());
		Class c1=ob1.getClass();
		System.out.println("OB1.getClass() "+c1.getName());
		System.out.println("OB1.toString() "+ob1.toString());
		
		Object ob2=ob1;
		Object ob3=new Object();
		System.out.println("OBJECT 2 HC "+ob2.hashCode());
		System.out.println("OBJECT 3 HC "+ob3.hashCode());
		
		System.out.println("OB1.equals(ob2) "+ob1.equals(ob2));
		System.out.println("OB1.equals(ob3) "+ob1.equals(ob3));
	}
}
