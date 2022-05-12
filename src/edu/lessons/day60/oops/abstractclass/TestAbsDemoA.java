package edu.lessons.day60.oops.abstractclass;

public class TestAbsDemoA {
	public static void main(String[] args) {

	}

	public static void testDemoA() {
//		AbsDemoA a1=new AbsDemoA();//abstract class
		AbsDemoA.show();// static method

		DemoAChild b1 = new DemoAChild();// child class
		b1.echo();// parent.echo()
	}

	public static void testDemoB() {
		// abstract class can not be instantiated
//		AbsDemoB objectDemob=new AbsDemoB();
		AbsDemoB objectDemob=new DemoBChild();
		objectDemob.echo();
	}
}
