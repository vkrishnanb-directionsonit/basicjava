package edu.lessons.day4.classes.activity.problemOne.solution2;

public class Person {
  enum PersonType { EMPLOYEE, CUSTOMER; }
  	public String firstName;
	public final int personId;
	public String address;
	public long phoneNumber;
	public String emailAddress;
	public PersonType typeOfPerson; 
	public Person(int id)
	{
		personId=id;
	}
}
