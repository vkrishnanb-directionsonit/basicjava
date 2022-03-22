package edu.lessons.day96.jdbc.mysql;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
public class TestCon
{
	public static void main(String args[])
	{
		testMYSQLConnection();
	}//end of main
//Oracle	
	private static String ORACLE_DRIVERNAME=
			"oracle.jdbc.driver.OracleDriver";
	private static String ORACLE_CONNECTION_URL=
			"jdbc:oracle:thin:@localhost:1521:XE";
	public static Connection testORAConnection()
	 {
	     Connection con = null;
	  try
	  {
	   java.util.Properties p = new java.util.Properties();
	   p.put("user","hr");
	   p.put("password","hr1");
	   String driverName=ORACLE_DRIVERNAME;
	   Class.forName(driverName);
	   String url=ORACLE_CONNECTION_URL;
	   con= DriverManager.getConnection(url,p);
	   System.out.println( " " + con.isClosed());
	  }
	  catch(Exception er)
	  {
	   System.out.println("Error : "+er.toString());
	  }
	  return con;
	 }
//MYSQL
	private static String MYSQL_DRIVERNAME="com.mysql.cj.jdbc.Driver";
	private static String MYSQL_CONNECTION_URL=
			"jdbc:mysql://localhost:3306/world";
	public static void testMYSQLConnection()
	{
	    Connection con =null;
	    String strUserName="root";
	    String strPassword="Pass123$";
		try
		{
			java.util.Properties p = new java.util.Properties();
			p.put("user",strUserName);
			p.put("password",strPassword);
			String driverName=MYSQL_DRIVERNAME;
			Class.forName(driverName);
			String url=MYSQL_CONNECTION_URL;
			con= DriverManager.getConnection(url,p);
			boolean flag=con.isClosed();
			if(!flag)
			    System.out.println("Connection Open ");
			else
				System.out.println("Connection Closed ");
		 }catch (SQLException sqe)
		 {
			System.out.println("SQLException:  " + sqe.getMessage());
		 }catch (Exception e2)
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
			}
			catch (Exception e)
			{
			  System.out.println("Error in closing Connection: " + e);
		    }
		 }//end of finally

	}

}//end of class

//String javaLibPath=java.lang.System.getProperty("java.library.path");
//System.out.println(javaLibPath);
//String url="jdbc:jtds:sqlserver://localhost:52460/JavaJune2017DB;integratedSecurity=true";
/*p.put("user","Sampleuser");
p.put("password","password");*/
