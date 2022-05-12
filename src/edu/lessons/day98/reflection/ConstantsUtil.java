package edu.lessons.day98.reflection;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import static java.lang.reflect.Modifier.*;
public class ConstantsUtil {
   public static String getModifierName(int value,Class<?> c1)
   {
	   Field fieldList[] = c1.getFields();
	   String fieldName="";
	   for (Field f : fieldList) 
	   {
		   try
 	      {
		   if((int)f.get(null)==value)
			   fieldName=f.getName();
		   break;
 	      } catch (IllegalAccessException e) 
 	      {
 	        e.printStackTrace();
 	      }
	   }
	   return fieldName;
   }
}
