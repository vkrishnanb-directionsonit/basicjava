package edu.lessons.day60.oops.introduction;

public class TestObject {

	public static void main(String[] args) {
		/*m1();
		m2();*/
		m4();
	}
	public static void m1()
	{
		Object obj=new Object();
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		Class c1=obj.getClass();
		System.out.println(c1.getName());
		Object anotherObject=new Object();
		System.out.println(obj.equals(anotherObject));
	}
	public static void m2()
	{
		String s1="Hello";
		System.out.println(s1);
		Object obj=s1;
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		Class c1=obj.getClass();
		System.out.println(c1.getName());
		Object anotherObject="Welcome";
		System.out.println(obj.equals(anotherObject));
	}
	public static void m3()
	{
		String s1="Hello";
		System.out.println(s1.toString());
		System.out.println(s1.hashCode());
		Class c1=s1.getClass();
		System.out.println(c1.getName());
		String s2="Welcome";
		System.out.println(s1.equals(s2));
	}
	@SuppressWarnings("unlikely-arg-type")
	public static void m4()
	{
		Box s1=new Box(1);
		System.out.println(s1.toString());
		System.out.println(s1.hashCode());
		@SuppressWarnings("rawtypes")
		Class c1=s1.getClass();
		System.out.println(c1.getName());
		String s2="Welcome";
		System.out.println(s1.equals(s2));
		s1.echo();
	}
}
