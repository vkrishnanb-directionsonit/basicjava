package edu.lessons.day38.arrays;
public class Emp
{
	private final  long id;
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public Emp(long v1)
	{
		id=v1;
	}
	public long getID()
	{    
		return id;   
	}
}

