package edu.lessons.assignment.filestreams;

import java.io.IOException;

import java.util.HashMap;

public interface IFileAccessController {
	public boolean isFileExist(String path, String filename)throws IOException;
	public  boolean createFile(String path, String filename) throws IOException;
	public  boolean appendToFile(String path, String filename,String row)throws IOException ;
	public  HashMap<?,?> getContactMapFromFile(String path, String filename) throws IOException;
	public  boolean saveChanges(String path, String filename, HashMap<?,?> data) throws IOException;
	public  boolean deleteFile(String path, String filename) throws Exception;
}
