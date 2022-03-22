package edu.lessons.day96.jdbc.mysql;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import org.apache.commons.dbcp2.BasicDataSource;
public class ConnectionFactory
{
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
  		 }catch (SQLException sqe)
  		 {
  			System.out.println("SQLException:  " + sqe.getMessage());
  		 }catch (Exception e2)
  		 {
  			System.out.println("Exception:  " + e2.getMessage());
  		 }
  		return con;
  	}

  	public static Connection getMYSQLWorldConnectionUsingPropertyFile()
  	{
  	    Connection con =null;
  	    FileInputStream dbpropertiesStream = null;
		String propertiespath="c:\\temp\\db.properties";
		Properties dbproperties =null;		
  	    try
  		{  	    	
  	    	dbpropertiesStream=new FileInputStream(propertiespath); 
  	    	dbproperties =  new Properties();
   			dbproperties.load(dbpropertiesStream);   			
   			String mysqlconnectionurl=(dbproperties.getProperty("MYSQL_DB_URL"));
   			String strUserName=(dbproperties.getProperty("MYSQL_DB_USERNAME"));
   			String strPassword=(dbproperties.getProperty("MYSQL_DB_PASSWORD"));  			
  			con= DriverManager.getConnection(mysqlconnectionurl,strUserName,strPassword);
  			
  		 }catch (SQLException sqe)
  		 {
  			System.out.println("SQLException:  " + sqe.getMessage());
  		 }catch (Exception e2)
  		 {
  			System.out.println("Exception:  " + e2.getMessage());
  		 }
  		return con;
  	}

  	public static Connection getMYSQLWorldConnectionFromPool()
  	{
  		Connection con =null;
    	String mysqlconnectionurl="jdbc:mysql://localhost:3306/world";
    	String strUserName="root";
    	String strPassword="Pass123$";
		BasicDataSource mysqlDS = null;
    	 try
   		{
   			String url=mysqlconnectionurl;
   			mysqlDS = new BasicDataSource();
			mysqlDS.setUrl(url);
			mysqlDS.setUsername(strUserName);
			mysqlDS.setPassword(strPassword);
			mysqlDS.setMinIdle(5);
	        mysqlDS.setMaxIdle(10);
	        mysqlDS.setMaxTotal(25);
			con=mysqlDS.getConnection();
   		 }catch (Exception e2)
   		 {
   			System.out.println("Exception:  " + e2.getMessage());
   		 }
    	return con;
  	}
  	
  	public static Connection getMYSQLDSConnectionUsingPropertyFile()
  	{
  		Connection con =null;
  		FileInputStream dbpropertiesStream = null;
  		String propertiespath="c:\\temp\\db.properties";
  		Properties dbproperties =null;
  		String mysqlconnectionurl="MYSQL_DB_URL";
    	String strUserName="MYSQL_DB_USERNAME";
    	String strPassword="MYSQL_DB_PASSWORD";
		MysqlDataSource mysqlDS = null;
    	 try
   		{
    		dbpropertiesStream=new FileInputStream(propertiespath); 
   			mysqlDS = new MysqlDataSource();
   			dbproperties =  new Properties();
   			dbproperties.load(dbpropertiesStream);
			mysqlDS.setURL(dbproperties.getProperty(mysqlconnectionurl));
			mysqlDS.setUser(dbproperties.getProperty(strUserName));
			mysqlDS.setPassword(dbproperties.getProperty(strPassword));
			con=mysqlDS.getConnection();
   		 }catch (Exception e2)
   		 {
   			System.out.println("Exception:  " + e2.getMessage());
   		 }
    	 finally
    	 {
    		 try {
				dbpropertiesStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
    	 }
    	return con;
  	}

  	public static Connection getMYSQLWorldConnection()
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
  		 }catch (SQLException sqe)
  		 {
  			System.out.println("SQLException:  " + sqe.getMessage());
  		 }catch (Exception e2)
  		 {
  			System.out.println("Exception:  " + e2.getMessage());
  		 }
  		return con;
  	}
  	public static Connection getMYSQLAspireConnection()
  	{
  	    Connection con =null;
  	    String MYSQL_DRIVERNAME="com.mysql.jdbc.Driver";
    	String MYSQL_CONNECTION_URL="jdbc:mysql://localhost:3306/aspire";
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
