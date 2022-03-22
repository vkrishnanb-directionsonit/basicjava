package edu.lessons.day4.classes;

public class TestEmployee {

	public static void main(String[] args) 
	{
		Employee e1;// e1 is null
		
		e1=new Employee();
		
		e1.eno=123454;
		e1.basicSalary=100000;
		e1.dA=(float) (e1.basicSalary)*0.15f;
		e1.ename="Steave";
		e1.hRA=(float)(e1.basicSalary)*0.20f;
		e1.pF=(float)(e1.basicSalary)*0.13f;
		e1.grossSalary=(float)(e1.basicSalary+e1.dA+e1.hRA+e1.pF);
		e1.incomeTax=(float)(e1.grossSalary*.30);		
		e1.netSalary=e1.grossSalary-e1.incomeTax;
		
		System.out.println(e1.netSalary);
	}
}
