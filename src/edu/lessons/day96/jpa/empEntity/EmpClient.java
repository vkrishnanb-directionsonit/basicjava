package edu.lessons.day96.jpa.empEntity;
import java.util.ArrayList;
import java.util.List;
public class EmpClient {
	public static void main(String[] args) throws Exception
	{
		EmpDAO es=new EmpDAO();
		Emp e1=null;
		List<Emp> emps=new ArrayList<Emp>();
		for(int i=290;i<298;i++)
		{
			e1= new Emp();
			e1.setNo(i);
			e1.setName("Emp "+i);
			e1.setSalary(1000*i);
			e1.setCv(0);
			emps.add(e1);
		}
		es.addManyEmp(emps);
	}
}
