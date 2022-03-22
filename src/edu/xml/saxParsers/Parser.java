package edu.xml.saxParsers;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.SAXParser;
import org.xml.sax.XMLReader;
public class Parser
{
	public static void main(String[] args) throws Exception
	{
		String fname="c:\\temp\\xml\\saxparser\\books.xml";
		 try
		 {
			SAXParserFactory pf=SAXParserFactory.newInstance();
			pf.setValidating(true);
			SAXParser sp=pf.newSAXParser();
			XMLReader parser =sp.getXMLReader();
			ValidatingErrorHandler e=new ValidatingErrorHandler();
			parser.setErrorHandler(e);
			 parser.parse(fname);
			 System.out.println("Doc Parsed");
		  }
		  catch(Exception e)
		  {
			System.out.println(e);
		  }
	}
}
