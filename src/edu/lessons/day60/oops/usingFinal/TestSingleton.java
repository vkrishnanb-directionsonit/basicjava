package edu.lessons.day60.oops.usingFinal;

public class TestSingleton {
	public static void main(String[] args) {
		
	}
	public static void testSingleton() {
		//MySingleton s1=new MySingleton();
				MySingleton s1=MySingleton.getObject();
				s1.x=100;
				s1.name="Jobs";
				s1.echo();
				MySingleton s2=MySingleton.getObject();
				s2.name="Sam";
				s2.echo();
				s1.echo();
	}
	public static void testPrivateConstructor() {
		ShapeAPrivateConstructor refShapeA=
				ShapeAPrivateConstructor.getObject();
		refShapeA.height=123;
		refShapeA.width=500;
		refShapeA.echo();
	}
}
