package edu.lessons.day96.jdbc.mssql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class DeleteEmp
{
  public static void main(String args[])
  {
		Connection con=null;
		PreparedStatement ps = null;
		int eno=0;
		java.util.Scanner scanner=new Scanner(System.in);
		try
		{
			System.out.println("Enter Emp No to delete");
			eno=Integer.parseInt(scanner.nextLine());
			con=ConnectionHelper.getConnectionWindowAuthentication();
			con.setAutoCommit(false);// begin Trans
			String delQRY="delete from emp where eno = ?";
			ps = con.prepareStatement(delQRY);
			ps.setInt(1, eno);
			int m=ps.executeUpdate();
			 System.out.println(m);
			if (m == 0)
			{
			  throw new Exception(eno + " not Deleted");
        	}
			boolean flag=con.getAutoCommit();
        	System.out.println("IS AutoCommit "+flag);
        	con.commit();// end of trans
			System.out.println("Commit...");
		}
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
			scanner.close();
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