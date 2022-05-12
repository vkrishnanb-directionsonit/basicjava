package edu.lessons.day91.collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ComparableDemo {
	public static void main(String[] args) {
		sortComparableEmp();
	}
	public static void compareEmp() {
		Emp e1=new Emp(100);
		e1.Name="Sam";
		Emp e2=new Emp(200);
		e2.Name = "Musk";
		Emp e3=new Emp(300);
		e3.Name = "Jobs";
		List<Emp> empList =new ArrayList<>();
		empList.add(e2);
		empList.add(e3);
		empList.add(e1);
		System.out.println(empList);
//		Collections.sort( empList);
		System.out.println(empList);
		/**
		 * The method sort(List<T>) in the type Collections 
		 * is not applicable for the arguments (ArrayList<Player>)
		 */
	}
	public static void sortComparableEmp() {
		EmpComparable e1=new EmpComparable(100);
		e1.Name="Sam"; e1.setAge(25);
		EmpComparable e2=new EmpComparable(200);
		e2.Name = "Musk"; e2.setAge(51);
		EmpComparable e3=new EmpComparable(300);
		e3.Name = "Zack"; e3.setAge(30);
		List<EmpComparable> empList =new ArrayList<>();
		empList.add(e2);
		empList.add(e3);
		empList.add(e1);
//		System.out.println(empList);
		Iterator<EmpComparable> emp_iterator=empList.iterator();
		while(emp_iterator.hasNext())
		{
			System.out.println(emp_iterator.next().getID());
		}
		Collections.sort( empList);
		System.out.println("----");
		emp_iterator=empList.iterator();
		while(emp_iterator.hasNext())
		{
			EmpComparable emp=emp_iterator.next();
			System.out.println(emp.getID()+" "+emp.Name+" "+emp.getAge());
		}
		EmpNameComparator empComparator=new EmpNameComparator();
		Collections.sort(empList,empComparator);
		System.out.println("----");
		emp_iterator=empList.iterator();
		while(emp_iterator.hasNext())
		{
			EmpComparable emp=emp_iterator.next();
			System.out.println(emp.getID()+" "+emp.Name+" "+emp.getAge());
		}
		EmpAgeComparator empAgeComparator=new EmpAgeComparator();
		Collections.sort(empList,empAgeComparator);
		System.out.println("----");
		emp_iterator=empList.iterator();
		while(emp_iterator.hasNext())
		{
			EmpComparable emp=emp_iterator.next();
			System.out.println(emp.getID()+" "+emp.Name+" "+emp.getAge());
		}
	}
}
