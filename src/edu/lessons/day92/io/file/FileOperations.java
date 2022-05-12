package edu.lessons.day92.io.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public  class FileOperations
{
	
 //private  String filename="CHECK.TXT";
 public void createFileUsingFileClass()
 {
	File file=null;
	Scanner scanner=null;
	boolean flag=false;
	String filename=null;
	try{
		scanner=new Scanner(System.in);
		System.out.println("Give a name for the new file" );
		filename=scanner.nextLine(); 
		file=new File(filename);
		flag=file.createNewFile();
		System.out.println("The file is created "+flag);
	}
	catch (IOException e1) 
	{
		e1.printStackTrace();
	}
	finally
	{
		scanner.close();
	}
}
 public void createFileUsingBufferedWriter()
 {
	FileWriter filewriter=null;
	Scanner scanner=null;
	String filename=null;
	String stringValue=null;
	BufferedWriter bufferwriter=null;
	try{
		scanner=new Scanner(System.in);
		System.out.println("Give a name for the new file" );
		filename=scanner.nextLine(); 
		filewriter=new FileWriter(filename,true);
		bufferwriter=new BufferedWriter(filewriter);
		System.out.println("Enter your input");
		stringValue=scanner.nextLine();
		bufferwriter.write(stringValue);
		bufferwriter.newLine();
		System.out.println("Enter the next input");
		stringValue=scanner.nextLine();
		bufferwriter.write(stringValue);		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		scanner.close();
		try {
			bufferwriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

  public void renameFile()
  {
    String fileNewName = null;
    String oldfilename=null;  
    BufferedReader bufferreader=null;
	File newFile=null;
	File file = null;
	try{
		bufferreader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the current file name");		
		oldfilename=bufferreader.readLine();
		file=new File(oldfilename);
	
		try {
			System.out.println("Enter the new file name");		
			fileNewName=bufferreader.readLine();
			newFile = new File(fileNewName);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			if(file.renameTo(newFile))
			{
				System.out.println("File rename successfully");
			}
			else
			{
				System.out.println("File name is not changed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}catch(Exception e)
	{
		e.printStackTrace();   
	}
	finally
	{
		try
		{
			bufferreader.close();
		}catch(Exception err){err.printStackTrace();}
	}
   }

   public void appendDatatoFile(){
	String data1=null;
	String data2=null;
	String filename=null;
	Scanner scanner=null;
	FileWriter filewriter=null;
    BufferedWriter bufferwriter=null;
   try{
	 scanner=new Scanner(System.in);
	 System.out.println("Give the name of the file to add data" );
	 filename=scanner.nextLine(); 
	 filewriter=new FileWriter(filename,true);
	 bufferwriter=new BufferedWriter(filewriter);
	 System.out.println("Enter some content");
	 data1=scanner.nextLine();
	 System.out.println("Enter your another content");
	 data2=scanner.nextLine();
	 bufferwriter.write(data1);
	 bufferwriter.newLine();
	 bufferwriter.write(data2);
	 bufferwriter.newLine();
	 System.out.println("Data appended to the File");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		try
		{
		 bufferwriter.close();
		 filewriter.close();
		 scanner.close();
		}catch(IOException e1)
		{  e1.printStackTrace(); }
	}
}

   public void modifyDataInFile()
   {
	String newcontent=null;
	String filename=null;
	Scanner scanner=null;
	FileWriter filewriter=null;
    BufferedWriter bufferwriter=null;
	try{
		scanner=new Scanner(System.in);
		System.out.println("Give the name of the file to modify data" );
		filename=scanner.nextLine(); 
		 filewriter=new FileWriter(filename);
		 bufferwriter=new BufferedWriter(filewriter);
		 System.out.println("Enter some new content");
		 newcontent=scanner.nextLine();
		 bufferwriter.write(newcontent);
		 System.out.println("File modified");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		try
		{
		 bufferwriter.close();
		 filewriter.close();
		 scanner.close();
		}catch(IOException e1)
		{  e1.printStackTrace(); }
	}
}

    public void readDataFromFile()
	{
		String filename=null;
		String data=null;
		Scanner scanner=null;
		FileReader filereader=null;
		BufferedReader bufferreader=null;
		File filetoreadfrom=null;
		try{
			scanner=new Scanner(System.in);
			System.out.println("Give the name of the file to read data from" );
			filename=scanner.nextLine(); 
			filetoreadfrom = new File(filename);
			filereader = new FileReader(filetoreadfrom);
			bufferreader = new BufferedReader(filereader);
			while((data=bufferreader.readLine())!=null)
			{
				System.out.println(data);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				filereader.close();
				bufferreader.close();
				scanner.close();
			}
			catch(IOException e1)
			{
				e1.printStackTrace();
			}
		}
	}

    public boolean deleteFile()
	{
		boolean flag=false;
		String filename=null;
		Scanner scanner=null;
		File filetodelete=null;
		try{
			scanner=new Scanner(System.in);
			System.out.println("Give the name of the file to DELETE!!!" );
			filename=scanner.nextLine(); 
			filetodelete=new File(filename);
			flag=filetodelete.delete();
			if(flag)
			{
				System.out.println("File was successfully deleted");
			}
			else
			{
				System.out.println("File was not deleted");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			scanner.close();
		}
		return flag;
	}

//moveFile
//copy file
}


