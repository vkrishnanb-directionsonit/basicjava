package edu.lessons.day96.jdbc.nwind;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import edu.lessons.day96.jdbc.mssql.ConnectionHelper;
public class InsertNorthwindEmp
{
  public static void main(String args[])
   {
	    Connection con = null;
   		PreparedStatement ps = null;
		int eno=0;
		String lname="";
		String fname="";
		String city="";
		java.util.Scanner sc=new Scanner(System.in);
		try
		{
//			System.out.println("Enter New Emp No");
//			eno=sc.nextInt();sc.nextLine();
			System.out.println("Enter New Emp Last Name");
			lname=sc.nextLine();
			System.out.println("Enter New Emp First Name");
			fname=sc.nextLine();
			System.out.println("Enter New Emp City");
			city=sc.nextLine();

			con=ConnectionHelper.getConnection();
			con.setAutoCommit(false);//begin a transaction
			String qry="insert into employees" +
			"(LastName,FirstName,City) values(  ? ,?,? )";
			ps  = con.prepareStatement(qry);
//			ps.setInt(1, eno);
			ps.setString(1,lname);
			ps.setString(2,fname);
			ps.setString(3,city);
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
			  if (ps != null)    ps.close();
			  if (con != null)
			  {
				  if(!con.isClosed()) con.close();
			  }
			}
			catch (Exception e)
			{
			  System.out.println("Error in closing Connection: " + e);
		    }
		 }//end of finally
//		finally
//		{
//			ConnectionFactory.cleanup(con, ps);
//		}
	}
}