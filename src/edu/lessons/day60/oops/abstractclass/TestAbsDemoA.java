package edu.lessons.day60.oops.abstractclass;

public class TestAbsDemoA {
	public static void main(String[] args) {
		//AbsDemoA a1=new AbsDemoA();//abstract class
		AbsDemoA.show();//static method
		
		DemoB b1=new DemoB();//child class
		b1.echo();//parent.echo()
	}
}
