package edu.lessons.day39.object;
public class TestObject {
	public static void main(String[] args) {
		java.lang.Object obj=new Object();
		m1(obj);
		System.out.println("***************");
		String s1="Hello";
		m1(s1);
		System.out.println("***************");
		//System.out.println(1200.hashCode());
		m1(1200); // Boxing
	}
	public static void m1(Object obj)
	{
		System.out.println("Hash Code "+obj.hashCode());
		Class c1=obj.getClass();
		System.out.println("getClass() "+c1.getName());
		Object obj2=new Object();
		System.out.println("equals "+obj.equals(obj2));//false
		System.out.println("toString() "+obj.toString());		
	}
}
