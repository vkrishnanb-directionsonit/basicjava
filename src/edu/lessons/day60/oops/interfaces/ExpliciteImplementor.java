package edu.lessons.day60.oops.interfaces;

public class ExpliciteImplementor implements  InterfaceA, InterfaceB {

	@Override
	public void m3() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Impl PrintA ");
	}
	public void print(String type)
	{
		System.out.println("Overriding default Impl Print "+type);
	}

}
