package edu.lessons.day96.jdbc.mssql;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
public class TestConnection
{
	public static void main(String args[])
	{
		testSQLConnection();
	}//end of main

    //Microsoft SQL Server	
	//private static String SQLSERVER_DRIVERNAME="net.sourceforge.jtds.jdbc.Driver";
	//Connection Strings
	// private static String SQLSERVER_CONNECTIONSTRING_WINDOW=
			//"jdbc:jtds:sqlserver://BVK-HPLAPTOP//SQLEXPRESS:61687/Sample;integratedSecurity=true";
	// private static String SQLSERVER_CONNECTIONSTRING_SQLAuthentication=
	//		"jdbc:jtds:sqlserver://BVK-HPLAPTOP//SQLEXPRESS:61687/Sample";
	private static String SQLSERVER_CONNECTIONSTRING_WINDOW=
			"jdbc:sqlserver://localhost:61687;databaseName=Sample;integratedSecurity=true";
	private static String SQLSERVER_CONNECTIONSTRING_SQLAuthentication=
			"jdbc:jtds:sqlserver://localhost:61687;databaseName=Sample";

	public static void testSQLConnection()
	{
	    Connection con =null;
		try
		{
			//String driverName=SQLSERVER_DRIVERNAME;
			//Class.forName(driverName);
			//java.util.Properties p = new java.util.Properties();
			//p.put("user","sampleuser");
			//p.put("password","password");			
			//String sqlurl=SQLSERVER_CONNECTIONSTRING_SQLAuthentication;			
			//con= DriverManager.getConnection(sqlurl,p);
			String windowurl=SQLSERVER_CONNECTIONSTRING_WINDOW;
			con= DriverManager.getConnection(windowurl);
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
	private static String MYSQL_DRIVERNAME="com.mysql.jdbc.Driver";
	private static String MYSQL_CONNECTION_URL=
			"jdbc:mysql://localhost:3306/world";
	public static void testMYSQLConnection()
	{
	    Connection con =null;
		try
		{
			java.util.Properties p = new java.util.Properties();
			p.put("user","root");
			p.put("password","password");
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
