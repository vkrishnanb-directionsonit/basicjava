package edu.lessons.day92.io.excel;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Properties;
//-----
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoA {
	
	//String after :
	String a = "LN.Acn='12',LN.Cif='163',CIF.Acn='156',CIF.Relcif='163',LN.Relcif='345',DA.Acn='16'";
	public static void main (String args[]){
		String oldString = "LN.Acn='12',LN.Cif='#Customer#LAcct1',CIF.Acn='#Customer#cust1',CIF.Relcif='#Customer#cust2',LN.Relcif='345',DA.Acn='16'";
		updateString(oldString);
		
	}
	
	private static void updateString(String oldstring)
	{
		String customerFile="c:\\temp\\customer.txt";
		String loanFile="c:\\temp\\loan.txt";
		Properties customerht =loadPropertyFile(customerFile);
		Properties loanht =loadPropertyFile(loanFile);
		String key="";
		HashMap<String,String> hm = new HashMap<>();
		String[] b = oldstring.split(",");
		for(int i=0;i<b.length;i++)
		{
		   String[] c=b[i].split("=");
		   hm.put(c[0],c[1]);
		}
		key="LN.Cif";
	    if(hm.containsKey(key))
	    {
    		String custId=findID(loanht, getCleanValue(hm, key));
    		hm.replace(key, custId);//
	    }
		key="CIF.Acn";
	    if(hm.containsKey(key))
	    {
    		String custId=findID(customerht, getCleanValue(hm, key));
    		hm.replace(key, custId);//
	    }
	    key="CIF.Relcif";
    	if(hm.containsKey(key))
    	{
    		String custId=findID(customerht, getCleanValue(hm, key));
    		hm.replace(key, custId);//
    	}
	    oldstring=hm.toString();
	    System.out.println(oldstring);
	}
	private static Properties loadPropertyFile(String file)
	{
		Properties ht = new Properties();
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
	    FileInputStream fin = null;
	    // Try to open the *.txt file.
	    try {
	      fin = new FileInputStream(file);
	    } catch(FileNotFoundException e) {
	    	System.out.println(e.getMessage());
	    }
	    try {
	      if(fin != null) {
	    	ht.load(fin);
	      }
	    } catch(IOException e) {
	      System.out.println("Error reading file.");
	    }
	    finally
	    {
	    	try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	    return ht;
	}
    private static String findID(Properties pt,String key)
    {
    	String number = (String) pt.get(key);
        return number;
    }
    private static String getCleanValue(HashMap<String,String> hm,String key)
    {
    	String  cleanData="";
		String value=hm.get(key);
		value=value.replaceAll("'","");
    	String[] data=value.split("#");
    	cleanData=data[2];
    	return cleanData;
    }
    private static void printCustomerHT(Properties pt)
    {
    	Set<Entry<Object,Object>> set = pt.entrySet();//Set is a collection	    
		 Iterator<Entry<Object,Object>> i = set.iterator();
		while(i.hasNext())
		{
		  Map.Entry<Object,Object> me = i.next();
		  System.out.print(me.getKey() + ": ");
		  System.out.println(me.getValue());
		}
    }
   
}
// import java.util.Iterator;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;
//
//Set<Entry<String,String>> set = hm.entrySet();//Set is a collection	    
// Iterator<Entry<String,String>> i = set.iterator();
//while(i.hasNext())
//{
//  Map.Entry<String,String> me = i.next();
//  System.out.print(me.getKey() + ": ");
//  System.out.println(me.getValue());
//}

