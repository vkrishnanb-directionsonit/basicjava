package edu.lessons.day96.jdbc.nwind;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.lessons.day96.jdbc.mssql.ConnectionHelper;
public class FindAllNorthwindEmp
{
	public static void main(String args[])
	{
	    Connection con =null;
		PreparedStatement ps = null;
		int eno=0;
		String ename="";
		String fname="";
		String city="";
		try
		{
			con=ConnectionHelper.getConnection();
			ps  = con.prepareStatement("select * from Employees ");
			ps.executeQuery();
			ResultSet rs = ps.getResultSet();
			while (rs.next())
			{
				eno=rs.getInt(1);//first col
				ename=rs.getString(2);// second col
				fname=rs.getString(3);// third col
				city=rs.getString(9);// fourth col
				System.out.println(eno+"-"+ename+"-"+fname+"-"+city);
			}
		 }catch (SQLException sqe)
		 {
			System.out.println("SQLException:  " + sqe.getMessage());
		 }
		 catch (Exception e2)
		 {
			System.out.println("Exception:  " + e2.getMessage());
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