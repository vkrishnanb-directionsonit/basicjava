package edu.lessons.day91.collections;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
class MapHashMapDemo
{
  public static void main(String args[])
  {
	  usingGenericMapDemoA();
    }
  @SuppressWarnings({ "rawtypes", "unchecked", "removal" })// TODO
  public static void usingRawMap()
  {
	   HashMap hm = new HashMap();
	    hm.put("k1","DataA");
	    hm.put("k1","DataB");//DataB replaces DataA
	    hm.put("k3", new Double(3434.34));
	    hm.put("k4", new Double(123.22));
	    hm.put("k5", new Double(1378.00));
	    hm.put("k6", new Double(99.22));
	    hm.put("k7", new Double(-19.08));
	    hm.put("k8","DataB");
	    Object obj=null;	   
	    System.out.println("Add Null to HashMap");
	    hm.put("Test1",obj);
	    hm.put("Test2",obj);
	    Set set = hm.entrySet();//Set is a collection	    
	    Iterator iterator = set.iterator();
	    while(iterator.hasNext())
	    {
	      Map.Entry mapEntry = (Map.Entry)iterator.next();
	      System.out.print(mapEntry.getKey() + ": ");
	      System.out.println(mapEntry.getValue());
	    }
  }
  
  public static void usingGenericMapDemoA()
  {
	HashMap<String,String> secondMap=new HashMap<String,String>();
	System.out.println("Size "+secondMap.size());
	secondMap.put("k1", "ABcd");
	secondMap.put("k2", "ABcd");
	secondMap.put("k3", "ABcd");
	secondMap.put("k4", "ABcd");
	secondMap.put("k4", "Xyz");// replace the previous value
	System.out.println("Size "+secondMap.size());
	Set<Map.Entry<String,String>> setofMapEntry = 
			secondMap.entrySet();
	Iterator<Map.Entry<String,String>> mapIterator = 
			setofMapEntry.iterator();
    while(mapIterator.hasNext())
    {
      Map.Entry<String,String> mapEntry = 
    		  (Map.Entry<String,String>)mapIterator.next();
      System.out.print(mapEntry.getKey() + ": ");
      System.out.println(mapEntry.getValue());
    }
  }
  
  
  
  
  @SuppressWarnings("unchecked") //TODO
  public static <T> void usingGenericMapDemoB( Collection<T> c)
  {
	Map<String,T> firstMap=new LinkedHashMap<String ,T >();
	int sizeofCollection=c.size();
	
	/*
	String[] stringArray =new String[c.size()];
	stringArray= c.toArray(stringArray);
	for (int i=0;i<sizeofCollection;i++) {
		 firstMap.put("K"+i,(T)stringArray[i]); // Correct
	    }
	*/
	Object[] a= c.toArray();	
	 for (int i=0;i<sizeofCollection;i++) {		 
		 firstMap.put("K"+i,(T)a[i]); // Correct
	    }
	System.out.println("Size "+firstMap.size());
	Set<Map.Entry<String,T>> setofMapEntry = 
			firstMap.entrySet();
	Iterator<Map.Entry<String,T>> mapIterator =
			setofMapEntry.iterator();
    while(mapIterator.hasNext())
    {
      Map.Entry<String,T> mapEntry = 
    		  (Map.Entry<String,T>)mapIterator.next();
      System.out.print(mapEntry.getKey() + ": ");
      System.out.println(mapEntry.getValue());
    }
  }
  @SuppressWarnings("unused")
  private static <K,V> int getCapacityOfGenericMap(HashMap<K,V> m)
  {
	Field tableField=null;
	try {
		tableField = HashMap.class.getDeclaredField("table");
	} catch (NoSuchFieldException | SecurityException e) {
		e.printStackTrace();
	}
	tableField.setAccessible(true);
	Object[] table = null;
	try {
		table = (Object[]) tableField.get(m);
	} catch (IllegalArgumentException e) {
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		e.printStackTrace();
	}	
	return table.length;
  }
}