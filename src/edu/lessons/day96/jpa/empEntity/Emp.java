package edu.lessons.day96.jpa.empEntity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Employees")
public class Emp implements Serializable
{
	@Id //primary key
	@Column(name = "id")
	private Integer _no;
	@Column(name = "ename", nullable = false)
	private String _name;
	@Column(name = "esalary", nullable = false)
	private double _salary;
	@Column(name = "ver", nullable = false)
	private int _version;
	public Emp()
	{	  System.out.println("Emp created");  }
	public int getNo()
	{   System.out.println("getNo "+_no);
		 return _no;
	}
	public String getName()
	{
		System.out.println("getName "+_name);
		return _name;
	}
	public double getSalary()
	{
		System.out.println("getSalary "+_salary);
		return _salary;
	}
	public int getCv()
	{
		System.out.println("getCv "+_version);
		return _version;
	}
	public void setNo(int v1)
	{
		System.out.println("setNo "+v1);
		_no=v1;
	}
	public void setName(String v1)
	{
		System.out.println("setName "+v1);
		_name=v1;
	}
	public void setSalary(double v1)
	{
		System.out.println("setSalary "+v1);
		_salary=v1;
	}
	public void setCv(int v1)
	{
		System.out.println("setCv "+v1);
		_version=v1;
	}

	//entity class must override hasCode() and equals()
	public int hashCode()
	{   	int hash = 0;
			hash = (this._no != null ?this._no.hashCode() : 0);
			return hash;
	}
	public boolean equals(Object obj)
	{
		boolean flag=true;
		if (obj == null || !this.getClass().equals(obj.getClass()))
		{			flag= false;		}
		Emp other = (Emp)obj;
		if (this._no == null || !this._no.equals(other._no))
		{			flag= false;		}
		return flag;
	}
}