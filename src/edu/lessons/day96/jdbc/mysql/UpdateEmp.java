package edu.lessons.day96.jdbc.mysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
//Updating Emp Name
public class UpdateEmp
{
  public static void main(String args[])
	{
		PreparedStatement ps = null;
		Connection con=null;
		int eno=0;
		double salary=0;
		String name="";
		java.util.Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter Emp No");
			eno=Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Name for the Emp");
			name=sc.nextLine();
			System.out.println("Enter new Salary for the Emp");
			salary=Double.parseDouble(sc.nextLine());
			con=ConnectionFactory.getMYSQLConnection();
			con.setAutoCommit(false);// begin trans
			String upQry="update emp set ename=?,sal=? where eno = ?";
			ps = con.prepareStatement(upQry);
			ps.setString(1,name);
			ps.setDouble(2,salary);
			ps.setInt(3, eno);
			int m=ps.executeUpdate();
			System.out.println(m);
			if (m == 0)
			{
				System.out.println(eno + " not updated");
        	}
			boolean flag=con.getAutoCommit();
        	System.out.println("IS AutoCommit "+flag);
        	con.commit();	
        	System.out.println("Commit...");
		}//end of trans
		catch (SQLException sqe)
		{
			System.out.println("SQLException:  " + sqe.getMessage());
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
		/*finally
		{
			ConnectionFactory.cleanup(con, ps);
		}*/
	}

}