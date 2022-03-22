package edu.lessons.day38.arrays;
public class EmpArrayDemo
{
  public static void main(String args[])
  {
    Emp emplist[] = new Emp[10];
    for(int i = 0; i < 10; i++)
    {
		Emp emp=new Emp(i);
		emp.setName("Emp"+i);
    	emplist[i] =emp;
	}
    System.out.println("No of Employees "+emplist.length);
   
    for(Emp e1 : emplist)
    {
	 System.out.println("ID="+e1.getID()+" Name="+e1.getName());
	}
  }
}

