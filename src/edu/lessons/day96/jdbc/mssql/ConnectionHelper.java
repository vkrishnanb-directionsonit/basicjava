package edu.lessons.day96.jdbc.mssql;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionHelper
{
	public static Connection getConnectionWindowAuthentication()
	{
	    Connection con = null;
		try
		{
			String sqlserverwindowsurl=
					"jdbc:sqlserver://localhost:61687;databaseName=Sample;integratedSecurity=true";
			con= DriverManager.getConnection(sqlserverwindowsurl);			
		}
		catch(Exception er)
		{
			System.out.println("Error : "+er.getMessage());
		}
		return con;
	}
	public static Connection getConnectionSqlAuthentication()
	{
		/*
		 * String jtdswindowsurl="jdbc:jtds:sqlserver://VenkatB-pc:52460/Northwind;integratedSecurity=true";
		 * String jtdssqlurl="jdbc:jtds:sqlserver://venkathpdesktop:50277/Sample";			 * 
		 * */	
		String sqlserversqlurl="jdbc:sqlserver://localhost:61687;databaseName=Sample";
		java.util.Properties userproperties =null;
	    Connection con = null;
		try
		{
			userproperties = new java.util.Properties();
			userproperties.put("user","sampleuser");
			userproperties.put("password","password");			
			con= DriverManager.getConnection(sqlserversqlurl,userproperties);					 
		}
		catch(Exception er)
		{
			System.out.println("Error : "+er.getMessage());
		}
		return con;
	}
    public static Connection getConnection()
	{
	    Connection con = null;
		try
		{
			java.util.Properties p = new java.util.Properties();
			p.put("user","sampleuser");
			p.put("password","password");
			String driverName="net.sourceforge.jtds.jdbc.Driver";
			Class.forName(driverName);
			//String url="jdbc:jtds:sqlserver://VenkatB-pc:52460/Northwind;integratedSecurity=true";
			String url="jdbc:jtds:sqlserver://venkathpdesktop:50277/Sample";
			con= DriverManager.getConnection(url,p);
		}
		catch(Exception er)
		{
			System.out.println("Error : "+er.getMessage());
		}
		return con;
	}
  //MYSQL
  	public static Connection getMYSQLConnection()
  	{
  	    Connection con =null;
  	    String MYSQL_DRIVERNAME="com.mysql.jdbc.Driver";
    	String MYSQL_CONNECTION_URL="jdbc:mysql://localhost:3306/world";
    	String strUserName="root";
    	String strPassword="password";
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
  		return con;
  	}

	public static void cleanup(Connection con,java.sql.PreparedStatement ps)
	{
		try
		{
		  if (ps != null)    ps.close();
		}
		catch (Exception e)
		{
		  System.out.println("Error closing PreparedStatement: "+e);
		}

		try
		{
		 if (con != null)
		  {
			  if(!con.isClosed()) con.close();
		  }
		}
		catch (Exception e)
		{
		  System.out.println("Error closing Connection: " + e);
		}
  }
}
