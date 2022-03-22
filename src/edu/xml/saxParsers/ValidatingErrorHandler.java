package edu.xml.saxParsers;
import org.xml.sax.*;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.Locator;

public class ValidatingErrorHandler implements ErrorHandler
{
     public  void warning(org.xml.sax.SAXParseException e) throws org.xml.sax.SAXException
     {
		 System.out.println("From Warning  " + e.toString());
	  }

	 public  void error(org.xml.sax.SAXParseException e) throws org.xml.sax.SAXException
	 {
		 System.out.println("From error " + e.toString());
	 }

	 public  void fatalError(org.xml.sax.SAXParseException e) throws org.xml.sax.SAXException
	 {
		 System.out.println("From fatal "+ e.toString());
    }
}
