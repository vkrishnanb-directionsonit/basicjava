package edu.lessons.assignment.filestreams;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringJoiner;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
public class LogManager 
{
	private static final  String path="c:/temp/";
	public static void logMessage(String from,String message) //throws IOException
	{
		DateTimeFormatter timeformatter = DateTimeFormat.forPattern("HH mm");
		LocalDate now = new LocalDate();		
		String filename="AddressBook"+now.toString()+".log";
		FileWriter filewriter=null;
	    BufferedWriter bufferwriter=null;
	    StringJoiner datatolog = new StringJoiner(",");
	    String messagetime=now.toDateTimeAtCurrentTime().toString(timeformatter);
	    datatolog.add("Time: "+messagetime);
	    datatolog.add("User: Venkat");
	    datatolog.add("Module: "+from);
	    datatolog.add("Msg: "+message);
	    try
	    {
		 filewriter=new FileWriter(path+filename,true);
		 bufferwriter=new BufferedWriter(filewriter);		
		 bufferwriter.write(datatolog.toString());
		 bufferwriter.newLine();
		}catch(IOException err)
		{  	
			 err.printStackTrace();
		}
		finally
		{
			try
			{
			 bufferwriter.close();
			 filewriter.close();			
			}catch(IOException err)
			{  	
				err.printStackTrace();
			}
		}
	}
}
