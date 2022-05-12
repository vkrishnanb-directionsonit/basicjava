package edu.lessons.day60.oops.interfaces;

public class ExpliciteImplementor implements  InterfaceA, InterfaceB {

	@Override
	public void m3() {}

	@Override
	public void m4() {
	}

	@Override
	public void m1() {}

	@Override
	public void m2() {}

	@Override
	public void print() {
		System.out.println("Impl PrintA ");
	}
	public void print(String type)
	{
		System.out.println("Overriding default Impl Print "+type);
	}

}
