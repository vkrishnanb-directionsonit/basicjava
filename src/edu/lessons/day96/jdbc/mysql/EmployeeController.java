package edu.lessons.day96.jdbc.mysql;


import java.util.Set;

public class EmployeeController {
   public static Set<Employee> getAllEmployees()
   {
	   EmployeeDataAccessControl empdac=new EmployeeDataAccessControl();
	   Set<Employee> empset=empdac.findAllEmployees();	   
	   return empset;
   }
   public static Employee getEmployeeByID(int id)
   {
	  EmployeeDataAccessControl empdac=new EmployeeDataAccessControl();
	  Employee emp=empdac.findEmployee(id);	  
	  return emp;
   }
   public static int modifyEmployeeByID(Employee emp)
   {
	  EmployeeDataAccessControl empdac=new EmployeeDataAccessControl();
	  int result=empdac.updateEmployee(emp);	  
	  return  result;
   }
   public static int addNewEmployee(Employee emp)
   {
	   EmployeeDataAccessControl empdac=new EmployeeDataAccessControl();
		  int result=empdac.insertNewEmployee(emp);	  
		  return  result;
   }
   public static int removeEmployee(int id)
   {
	   EmployeeDataAccessControl empdac=new EmployeeDataAccessControl();
		  int result=empdac.deleteEmployee(id);	  
		  return  result;
   }
}
