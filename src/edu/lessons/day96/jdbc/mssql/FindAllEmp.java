package edu.lessons.day96.jdbc.mssql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class FindAllEmp
{
	public static void main(String args[])
	{
	    Connection con =null;
		PreparedStatement ps = null;
		int eno=0;
		String ename="";
		double salary=0;
		String city="";
		try
		{
			con=ConnectionHelper.getConnectionWindowAuthentication();
			ps  = con.prepareStatement("select * from emp");
			ps.executeQuery();
			ResultSet rs = ps.getResultSet();
			while (rs.next())
			{
				eno=rs.getInt(1);//first col
				ename=rs.getString(2);// second col
				salary=rs.getDouble(3);// third col
				city=rs.getString(4);// fourth col
				System.out.println(eno+"-"+ename+" "+salary+" "+city);
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
	 }
}