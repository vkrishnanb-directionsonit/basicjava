package edu.lessons.day96.jdbc.mysql;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class EmployeeViews
{
	public static void main(String args[])
	{
		showAllEmployees();
		System.out.println("====================");
		findAndRemoveEmployee();
		System.out.println("====================");
		showAllEmployees();
	}

	public static void showAllEmployees()
	{
		Set<Employee> empset=EmployeeController.getAllEmployees();
		Iterator<Employee> empiterator=empset.iterator();
		while(empiterator.hasNext())
		{
		   Employee emp= empiterator.next();
		   System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getCity()+" "+emp.getSalary());
		}	 
	}

	public static void showEmployee()
	{
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter Emp ID");
			int id = scanner.nextInt();
			Employee emp = EmployeeController.getEmployeeByID(id);
			if (emp != null)
				System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getCity() + " " + emp.getSalary());
			else
				System.out.println("Employee NOT FOUND!!!");
		} finally {
			scanner.close();
		}
	}

	public static void findAndModifyEmployee()
	{
		Scanner scanner = new Scanner(System.in);
		Employee emp =null;
		try {
			System.out.println("Enter Emp ID");
			int id = scanner.nextInt();
			scanner.nextLine();
			emp= EmployeeController.getEmployeeByID(id);
			if (emp == null) {
				System.out.println("Employee NOT FOUND!!!");
				return;
			}
			System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getCity() + " " + emp.getSalary());
			System.out.println("Enter New Name");
			emp.setName(scanner.nextLine());
			System.out.println("Enter New City");
			emp.setCity(scanner.nextLine());
			System.out.println("Enter New Salary");
			emp.setSalary(scanner.nextDouble());
			int output=EmployeeController.modifyEmployeeByID(emp);
			if(output>0)
				System.out.println("Updated "+output );
			else
				System.out.println("Update Failed");
		} finally {
			scanner.close();
		}
		
	}
	
	public static void addNewEmployee()
	{
		Scanner scanner = new Scanner(System.in);
		Employee emp =null;
		try {
			System.out.println("Enter Emp ID");
			int id = scanner.nextInt();
			scanner.nextLine();
			emp=new Employee(id);
			System.out.println("Enter New Name");
			emp.setName(scanner.nextLine());
			System.out.println("Enter New City");
			emp.setCity(scanner.nextLine());
			System.out.println("Enter New Salary");
			emp.setSalary(scanner.nextDouble());
			int output=EmployeeController.addNewEmployee(emp);
			if(output>0)
				System.out.println("Inserted "+output );
			else
				System.out.println("Insert Failed");
		}
		finally {
			scanner.close();
		}
	}

	public static void findAndRemoveEmployee()
	{
		Scanner scanner = new Scanner(System.in);
		Employee emp =null;
		try {
			System.out.println("Enter Emp ID");
			int id = scanner.nextInt();
			scanner.nextLine();
			emp= EmployeeController.getEmployeeByID(id);
			if (emp == null) {
				System.out.println("Employee NOT FOUND!!!");
				return;
			}
			System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getCity() + " " + emp.getSalary());
			
			int output=EmployeeController.removeEmployee(id);
			if(output>0)
				System.out.println("Deleted "+output );
			else
				System.out.println("Delete Failed");
		} finally {
			scanner.close();
		}
		
	}
	
}