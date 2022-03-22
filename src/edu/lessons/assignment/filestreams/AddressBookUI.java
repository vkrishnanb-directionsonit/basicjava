package edu.lessons.assignment.filestreams;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class AddressBookUI {
	public static void main(String[] args) {
		menu();
	}
	private static AddressBook addDataToContact(AddressBook contact) throws Exception
	{
		Scanner scanner = new Scanner(System.in); 
		boolean flag=false;
		try
		{
			if(contact==null) {
				System.out.println("Enter new Contact ID");
				int id=scanner.nextInt();
				scanner.nextLine();
				contact=new AddressBook(id);				
			}
			System.out.println("Enter new Contact Name to modify");
			String name=scanner.nextLine();
			while(flag==false){
			
			}
			if(name!=null)
				contact.setName(name);
			else
				contact.setName("NotAssigned");
			System.out.println("Enter new Contact Address to modify");
			String address=scanner.nextLine();
			if(address!=null)
				contact.setAddress(address);
			else
				contact.setAddress("NotAssigned");
			System.out.println("Enter new Contact Email address to modify");
			String email=scanner.nextLine();
			if(email!=null)
				contact.setEmailAddress(email);
			else
				contact.setEmailAddress("NotAssigned");			
			System.out.println("Enter new Contact Phone Number to modify");
			long phone=scanner.nextLong();
			contact.setPhonenumber(phone);
		}
		finally
		{
			scanner.close();
		}
		return contact;
	}
	public static void addNewContactToBook()
	{		
		AddressBook contact=null;
		AddressBookController contactcontroller=
				new AddressBookController();
		boolean addnewresult=false;		
		try {
			contact=addDataToContact(contact);
		} catch (Exception e) {
			e.printStackTrace();
		}			
		addnewresult=contactcontroller.addNewContact(contact);
		if(addnewresult)
			System.out.println("New Contact Added");
		else
			System.out.println("FAILED!!! To add New Contact");		
	}
	public static void diaplayAllContacts()
	{
		//AddressBook contact=null;
		AddressBookController contactcontroller=
				new AddressBookController();
		System.out.println("Count"+contactcontroller.getContactCount());
		Set<AddressBook> contactlist=
				contactcontroller.getAllContacts();
		Iterator<AddressBook> iterator=contactlist.iterator();
		while(iterator.hasNext())
		{
			AddressBook contact=iterator.next();
			String output=contact.toString();
			System.out.println(output);
		}
	}
	public static void findContact()
	{
		Scanner scanner = new Scanner(System.in); 
		AddressBook contact=null;
		AddressBookController contactcontroller=
				new AddressBookController();
		try
		{
			System.out.println("Enter Contact ID to find");
			int id=scanner.nextInt();
			scanner.nextLine();
			contact=contactcontroller.findContactByID(id);
			if(contact!=null)
				System.out.println(contact.toString());
			else
				System.out.println("Contact NOT FOUND");
			System.out.println("==========");
			System.out.println("Enter Contact EmailID to search");
			String email=scanner.nextLine();
			contact=contactcontroller.findContactByEmail(email);
			if(contact!=null)
				System.out.println(contact.toString());
			else
				System.out.println("Contact NOT FOUND");
			System.out.println("==========");
			System.out.println("Enter Contact City to search");
			String city=scanner.nextLine();
			List<AddressBook> contactlist=
					contactcontroller.findContactsByCityName(city);
			Iterator<AddressBook> contactiterator
			= contactlist.iterator();
			while(contactiterator.hasNext())
			{
				contact=contactiterator.next();
				if(contact!=null)
					System.out.println(contact.toString());
				else
					System.out.println("Contact NOT FOUND");
			}
		}
		finally
		{
			scanner.close();
		}
	}
	public static void modifyAndSaveChanged()
	{
		Scanner scanner = new Scanner(System.in); 
		AddressBook contact=null;
		AddressBookController contactcontroller=
				new AddressBookController();
		try
		{
			System.out.println("Enter Contact ID to find");
			int id=scanner.nextInt();
			scanner.nextLine();
			contact=contactcontroller.findContactByID(id);
			if(contact!=null)
				System.out.println(contact.toString());
			else
				System.out.println("Contact NOT FOUND");
			System.out.println("==========");			
			try {
				contact=addDataToContact(contact);
			} catch (Exception e) {
				e.printStackTrace();
			}	
			boolean saved=false;
			if(contactcontroller.modifyContactInformation(contact))
			{
				saved=contactcontroller.saveChanges();
				System.out.println("Saved "+saved);
			}
			else
				System.out.println("Modification Failed");
		}finally
		{
			scanner.close();
		}
	}
	public static void menu()
	{
		Scanner scanner = new Scanner(System.in); 
		try {
			while(true){
				System.out.println("--------------------- Menu -------------------\n"
						+ "1. Add New Contact\n"
						+ "2. Modify Contact \n"
						+ "3. Find the Contact Details\n"
						+ "4. Delete Contact \n"
						+ "5. View All The Records\n"
						+ "****************************************\n"
						+ "Choose Your Option (1/2/3/4/5): ");
				String switchparameter=scanner.nextLine();
				switch(switchparameter)
				{
					case "1":{
						addNewContactToBook();
						break;
					}
					case "2":{
						modifyAndSaveChanged();
						break;
					}
					case "3":{
						findContact();
						break;
					}
					case "4":{
						System.out.println("Not Implemented");
						break;
					}
					case "5":{
						diaplayAllContacts();
						break;
					}
					default:{
						System.out.println("Enter Valid Choice!!!\n");
					}
				}// end of switch
			}// end of while
		}
		finally
		{
			scanner.close();
		}
	}
}
