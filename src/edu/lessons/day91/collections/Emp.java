package edu.lessons.day91.collections;
public class Emp
{
	private final  int Id;
	public String Name;
	public Emp(int v1){		Id=v1;	}
	public double getID(){    return Id;   }	
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
}

