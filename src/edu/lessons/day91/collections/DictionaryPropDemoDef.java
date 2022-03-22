package edu.lessons.day91.collections;
import java.util.*;

class DictionaryPropDemoDef
{
  public static void main(String args[])
  {
    Properties defList = new Properties();
    defList.put("Florida", "Tallahassee");
    defList.put("Wisconsin", "Madison");

    Properties capitals = new Properties(defList);
    Set states;
    String str;

    capitals.put("Illinois", "Springfield");
    capitals.put("Missouri", "Jefferson City");
    capitals.put("Washington", "Olympia");
    capitals.put("California", "Sacramento");
    capitals.put("Indiana", "Indianapolis");

    // Show all states and capitals in hashtable.
   // states = capitals.keySet(); // get set-view of keys
   states=capitals.entrySet();
    Iterator itr = states.iterator();

    while(itr.hasNext())
    {
      //str = (String) itr.next();
      //System.out.println("The capital of " +
      //                   str + " is " +capitals.getProperty(str));

        Map.Entry me = (Map.Entry)itr.next();
		  System.out.print(me.getKey() + ": ");
		  System.out.println(me.getValue());
    }

    System.out.println();
    capitals.list(System.out);
    System.out.println();
    Enumeration enums=capitals.keys();
    while(enums.hasMoreElements())
    {
		str = (String) enums.nextElement();
		System.out.println("The capital of " +
		                   str + " is " +capitals.getProperty(str));
	 }
	     System.out.println(capitals);
	     System.out.println(capitals.size());
	     System.out.println(capitals.containsKey("Florida"));

    // Florida will now be found in the default list.
    str = capitals.getProperty("Florida");
    System.out.println("The capital of Florida is "
                       + str + ".");
  }
}
