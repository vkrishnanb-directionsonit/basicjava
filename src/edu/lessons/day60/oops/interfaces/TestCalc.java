package edu.lessons.day60.oops.interfaces;

public class TestCalc {
	public static void main(String[] args)
	{
		//ICalculator c1=new ICalculator();
		//CalculatorA a1=new CalculatorA();
		ICalculator c1=new CalculatorB();
		int x=100;
		int y=20;
		int z=0;
		z=c1.add(x, y);
		System.out.println("Result "+z);
		
		CalculatorB b1=new CalculatorB();
		if (b1 instanceof ICalculator) {
			ICalculator new_calc = (ICalculator) b1;
			z=new_calc.add(x, y);
			System.out.println("Result "+z);
		}else
		{
			System.out.println(b1.getClass().getName()+
					" does not Implement ICalculator");
		}
		if (b1 instanceof IVehicle) {
			System.out.println("b1 is a Vehicle ");
		}else
			System.out.println("b1 is Not a Vehicle ");
	}
}
