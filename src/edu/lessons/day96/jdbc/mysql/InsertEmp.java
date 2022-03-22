package edu.lessons.day96.jdbc.mysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class InsertEmp
{
  public static void main(String args[])
   {
	  addHundredEmps();
   }
  public static void addOneEmp()
  {
	  Connection con = null;
 		PreparedStatement ps = null;
		int eno=0;
		String name="";
		double salary=0;
		String city="";
		java.util.Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter New Emp No ");
			eno=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter New Emp Name");
			name=sc.nextLine();
			System.out.println("Enter New Emp Salary");
			salary=Double.parseDouble(sc.nextLine());
			System.out.println("Enter New Emp City");
			city=sc.nextLine();

			con=ConnectionFactory.getMYSQLConnection();
			con.setAutoCommit(false);//begin a transaction
//			String qry="insert into emp values("+
//					eno+","+name+","+salary+","+city+")";
			String qry="insert into emp values( ? , ?,?,? )";
			ps  = con.prepareStatement(qry);
			ps.setInt(1, eno);
			ps.setString(2,name);
			ps.setDouble(3,salary);
			ps.setString(4,city);
			int m=ps.executeUpdate();
			System.out.println(m);
			if (m == 0)
			{
				System.out.println(eno + " not Added");
      	}
			boolean flag=con.getAutoCommit();
      	System.out.println("IS AutoCommit "+flag);

      	con.commit();// transaction ends
			System.out.println("Commit..."+m);
		}//end of try
		catch (SQLException sqe)
		{
			System.out.println("SQLException:  " + sqe);
		}
		catch (Exception sqe)
		{
			System.out.println("Exception:  " + sqe);
		}
		 finally
		{
			try
			{
			 if (con != null)
			  {
				  if(!con.isClosed()) con.close();
			  }
			  if (ps != null)    ps.close();
			}
			catch (Exception e)
			{
			  System.out.println("Error in closing Connection: " + e);
		    }
		 }//end of finally
  }
  public static void addHundredEmps()
  {
	  Connection con = null;
 		PreparedStatement ps = null;
		int eno=0,m=0;
		String name="";
		double salary=0;
		String city="";
		java.util.Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter New Emp No ");
			eno=sc.nextInt();
			
			con=ConnectionFactory.getMYSQLConnection();
			con.setAutoCommit(false);//begin a transaction
			String qry="insert into emp values( ? , ?,?,? )";
			ps  = con.prepareStatement(qry);
			for(int i=eno;i<(eno+100);i++)
			{
				ps.setInt(1, i);
				name="Emp "+i;
				ps.setString(2,name);
				salary=Math.random()*10000;
				ps.setDouble(3,salary);
				city="Chennai";
				ps.setString(4,city);
				m=ps.executeUpdate();
			}
			con.commit();// transaction ends
			System.out.println("Commit...");
		}//end of try
		catch (SQLException sqe)
		{
			System.out.println("SQLException:  " + sqe);
		}
		catch (Exception sqe)
		{
			System.out.println("Exception:  " + sqe);
		}
		 finally
		{
			try
			{
			 if (con != null)
			  {
				  if(!con.isClosed()) con.close();
			  }
			  if (ps != null)    ps.close();
			}
			catch (Exception e)
			{
			  System.out.println("Error in closing Connection: " + e);
		    }
		 }//end of finally
  }
}