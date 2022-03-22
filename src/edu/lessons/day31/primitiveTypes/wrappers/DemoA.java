package edu.lessons.day31.primitiveTypes.wrappers;
public class DemoA
{
	public static void test()
	{
		int x=100;
		int y=200;
		//System.out.println("x= "+x.toString());
		//System.out.println("x.equals(y) "+x.equals(y));
  	     System.out.println("x==y "+(x==y));

		Integer i=1000;
		Integer j=1000;
		System.out.println("i= "+i.toString());
	     System.out.println("j= "+j.toString());
   	     System.out.println("i.equals(j) "+i.equals(j));
   	     System.out.println("i==j "+(i==j));

   	     Object obj1=new Object();//(Object)i;
   	     Object obj2=new Object();//(Object)j;
   	     System.out.println("obj1.equals(obj2) "+obj1.equals(obj2));
   	     System.out.println("obj1==obj2 "+(obj1==obj2));

		 Integer k=i;
	     System.out.println("k= "+k.toString());
		 System.out.println("i.equals(k) "+i.equals(k));
		 System.out.println("i==k "+(i==k));

    }
	public static void Reflect()
	{
		int x=1000;
		System.out.println("x="+x);
		Integer i=x;
		System.out.println("toString "+i.toString());
		System.out.println("hashCode "+i.hashCode());
		System.out.println("getClass "+i.getClass().getName());
		System.out.println("getSuperclass "+i.getClass(). getSuperclass().getName());

		System.out.println("isInstance "+i.getClass().isInstance(i));
		System.out.println("isLocalClass "+i.getClass().isLocalClass());
		System.out.println("isMemberClass "+i.getClass().isMemberClass());
		System.out.println("isPrimitive "+i.getClass().isPrimitive());
		System.out.println(i+" equals(250) "+i.equals(250));
	}
}