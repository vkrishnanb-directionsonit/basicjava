package edu.lessons.day91.collections;

public class Employee implements Comparable
{
	public int Id;	//public int Id;
	public String Name;
	public Employee() {}
	public Employee(int i) {this.Id=i;}
	
	public boolean equals(Object obj)
	{
		Class c1=obj.getClass();
		boolean flag=false;
		if(c1==this.getClass())
		{
			Emp other=(Emp)obj;
			if(this.hashCode()==other.hashCode()) flag=true;
		}
		return flag;
	}
	public int hashCode()
	{
		return this.Id;
	}
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		int result=-1;
		if (obj instanceof Employee)
		{
			Employee e2 = (Employee) obj;
			if(this.Id==e2.Id)	result=0;
			else if(this.Id>e2.Id) result=1;
		}
		return result;
	}
	
}
class EmpA
{
	private final int Id;	//public int Id;
	public String Name;
	
	EmpA(int v1){	Id=v1;	}
	public int hashCode()	{	return Id;	}
	public int getID(){return Id;}
	public boolean equals(Object obj)
	{
		boolean flag=false;
		if (obj instanceof EmpA)
		{
			EmpA e2 = (EmpA) obj;
			if(this.Id==e2.Id)  flag=true;
		}
		return flag;
	}
}
