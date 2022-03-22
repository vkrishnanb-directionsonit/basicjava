package edu.lessons.assignment.filestreams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AddressBookController {	
	private static final  String path="c:/temp/";
	private static final String filename="AddressBook.csv";
	HashMap<Integer,AddressBook> contactmap=null;
	public AddressBookController()
	{
		FileAccessController contactfileaccesscontrol=
				new FileAccessController();	
		createFileifNotfound(contactfileaccesscontrol);
		try {
			contactmap=contactfileaccesscontrol.getContactMapFromFile(path, filename);
		} catch (IOException e) {
			LogManager.logMessage(
					"AddressBookController Constructor", 
					e.getMessage());	
		}
	}
	private boolean createFileifNotfound(FileAccessController contactfileaccesscontrol)
	{
		boolean doesfileexist=false;
		try {
			doesfileexist = contactfileaccesscontrol.isFileExist(path, filename);
			if(!doesfileexist)
			{
				doesfileexist=contactfileaccesscontrol.createFile(path, filename);
			}
		} catch (IOException e) {
			LogManager.logMessage(
					"AddressBookController.addNewContact", 
					e.getMessage());			
		}
		return doesfileexist;
	}
	public boolean addNewContact(AddressBook contact) {
		FileAccessController contactfileaccesscontrol=
				new FileAccessController();
		boolean iscontactadded=false;
		boolean iscontactduplicate=false;
		if(contactmap==null)
			contactmap=new HashMap<Integer, AddressBook>();
		iscontactduplicate=contactmap.containsKey(contact.getContactid());
		if(iscontactduplicate)
		{
			return false;
		}
		else
			contactmap.put(contact.getContactid(),contact);
		String row= contact.toString();
		try {
			
			iscontactadded=contactfileaccesscontrol.appendToFile(path, filename, row);
		} catch (IOException e) {
			LogManager.logMessage(
					"AddressBookController.addNewContact", 
					e.getMessage());	
		}		
		return iscontactadded;
	}
	public Set<AddressBook> getAllContacts() 
	{
		Set<AddressBook> contactset=new HashSet<>();
		Set<Map.Entry<Integer, AddressBook>> contactentryset=null;
		if(contactmap!=null)
		{
			contactentryset=contactmap.entrySet();
		}
		Iterator<Map.Entry<Integer, AddressBook>> iterator 
				= contactentryset.iterator();
		while(iterator.hasNext())
		{
			Map.Entry<Integer, AddressBook> element=
					iterator.next();
			contactset.add(element.getValue());
		}
		return contactset;
	}
	public AddressBook findContactByID(int contactId)
	{
		AddressBook contact=null;
		if(contactmap!=null)
			contact=contactmap.get(contactId);
		return contact;
	}
	public AddressBook findContactByEmail(String emailaddress)
	{
		 Set<AddressBook> contactset=getAllContacts();
		 AddressBook contact=null;
		 Iterator<AddressBook> iterator=contactset.iterator();
			while(iterator.hasNext())
			{
				 contact=iterator.next();
				if(contact.getEmailAddress().equals(emailaddress))
				{
					return contact;
				}
				else
					contact=null;
			}
		return null;
	}
	public List<AddressBook> findContactsByCityName(String city) 
	{
		 Set<AddressBook> contactset=getAllContacts();
		 List<AddressBook> citywisecontactlist=new ArrayList<AddressBook>();
		 Iterator<AddressBook> iterator=contactset.iterator();
		while(iterator.hasNext())
		{
			AddressBook contact=iterator.next();
			if(contact.getAddress().equals(city))
			{
				citywisecontactlist.add(contact);
			}				
		}
		return citywisecontactlist;
	}
	public boolean modifyContactInformation(AddressBook contact) {
		boolean flag=false;
		AddressBook oldContact=findContactByID(contact.getContactid());
		if(oldContact!=null)
		{
			try {
				oldContact.setName(contact.getName());
			} catch (Exception e) {
				LogManager.logMessage(
						"AddressBookController.addNewContact", 
						e.getMessage());			
			}
			oldContact.setAddress(contact.getAddress());
			oldContact.setEmailAddress(contact.getEmailAddress());
			flag=true;
		}
		return flag;
	}
	public boolean saveChanges() {
		boolean flag=false;
		FileAccessController contactfileaccesscontrol=
				new FileAccessController();
		flag=contactfileaccesscontrol.saveChanges(path, filename, contactmap);
		return flag;
	}
	public boolean undoChanges(){
		throw new IllegalCallerException();
	}
	public boolean removeContactFromBook(int id){
		boolean flag=false;
		AddressBook oldContact=contactmap.remove(id);
		if(oldContact!=null)
		{
		flag=true;	
		}
		return flag;
	}
	public int getContactCount(){
		int count=0;
		if(contactmap!=null)count=contactmap.size();
		return count;
	}
}
