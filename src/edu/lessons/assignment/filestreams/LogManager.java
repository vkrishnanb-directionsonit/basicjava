package edu.lessons.assignment.filestreams;
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.time.LocalTime;
//import java.util.StringJoiner;
//import org.joda.time.LocalDate;
//import org.joda.time.format.DateTimeFormat;
//import org.joda.time.format.DateTimeFormatter;
public class LogManager 
{
	private static final  String path="c:/temp/";
	public static void logMessage(String from,String message) //throws IOException
	{
//		java.time.format.DateTimeFormatter timeformatter = DateTimeFormat.forPattern("HH mm");
//		java.time.LocalDate now = new java.time.LocalDate(2022, 01, 01);		
//		String filename="AddressBook"+now.toString()+".log";
//		FileWriter filewriter=null;
//	    BufferedWriter bufferwriter=null;
//	    StringJoiner datatolog = new StringJoiner(",");
//	    String messagetime="";//now.toDateTimeAtCurrentTime().toString(timeformatter);
//	    datatolog.add("Time: "+messagetime);
//	    datatolog.add("User: Venkat");
//	    datatolog.add("Module: "+from);
//	    datatolog.add("Msg: "+message);
//	    try
//	    {
//		 filewriter=new FileWriter(path+filename,true);
//		 bufferwriter=new BufferedWriter(filewriter);		
//		 bufferwriter.write(datatolog.toString());
//		 bufferwriter.newLine();
//		}catch(IOException err)
//		{  	
//			 err.printStackTrace();
//		}
//		finally
//		{
//			try
//			{
//			 bufferwriter.close();
//			 filewriter.close();			
//			}catch(IOException err)
//			{  	
//				err.printStackTrace();
//			}
//		}
	}
}
