package edu.lessons.day96.jdbc.mysql;
public class Employee implements Comparable<Employee>{
	private final int id;
	private String name;
	private String city;
	private double salary;
	public Employee(int no)
	{
		this.id=no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	 @Override
	public boolean equals(Object otherObject)
	{
		@SuppressWarnings("unchecked")
		Class<Employee> c1=(Class<Employee>) otherObject.getClass();
		boolean flag=false;
		if(c1==this.getClass())
		{
			Employee other=(Employee)otherObject;
			if(this.hashCode()==other.hashCode()) flag=true;
		}
		return flag;
	}
	 
	@Override
	public int hashCode()
	{
		return this.id;
	}
	
	@Override
	public String toString()
	{
		return this.id+","+this.name+","+this.city+","+this.salary+";";
	}
	@Override
	public int compareTo(Employee o) {
		int result=-1;
		if(this.id==o.id)	result=0;
		else if(this.id>o.id) result=1;
		else result=-1;		
		return result;
	}
	 
}
