package edu.xml.saxParsers;

import org.xml.sax.*;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.Locator;

public class ExampleContentHandler implements ContentHandler,ErrorHandler {
	Locator loc;
    public void setDocumentLocator(Locator locator) {
        System.out.println("setDocumentLocator");
        this.loc=locator;
    }
    public void startDocument() throws SAXException {
        System.out.println("startDocument");
    }
    public void endDocument() throws SAXException {
        System.out.println("endDocument");
    }
    public void startPrefixMapping(String prefix, String uri)throws SAXException {
        System.out.println("startPrefixMapping: " + prefix + ", " + uri);
    }

    public void endPrefixMapping(String prefix) throws SAXException {
        System.out.println("endPrefixMapping: " + prefix);
    }

    public void startElement(
            String namespaceURI, String localName, String qName, Attributes atts)
                throws SAXException {
        System.out.print("startElement: " + namespaceURI + ", "
                         + localName + ", " + qName);
        int n = atts.getLength();
        for (int i = 0; i < n; i++) {
            System.out.print(", " + atts.getQName(i) + "='" + atts.getValue(i) + "'");
        }
        System.out.println("");
    }
    public void endElement(
            String namespaceURI, String localName, String qName)
                throws SAXException {
        System.out.println("endElement: " + namespaceURI + ", "
                           + localName + ", " + qName);
    }
    public void characters(char ch[], int start, int length)
            throws SAXException {
        String s = new String(ch, start, (length > 30)? 30: length);
        if (length > 30) {
            System.out.println("characters: \"" + s + "\"...");
        } else {
            System.out.println("characters: \"" + s + "\"");
        }
    }
    public void ignorableWhitespace(char ch[], int start, int length)
            throws SAXException {
        System.out.println("ignorableWhitespace");
    }
    public void processingInstruction(String target, String data)
            throws SAXException {
        System.out.println("processingInstruction: " + target + ", "
                           + data);
    }
    public void skippedEntity(String name) throws SAXException {
        System.out.println("skippedEntity: " + name);
    }
    
     public  void warning(org.xml.sax.SAXParseException e) throws org.xml.sax.SAXException {
       System.out.println("From Warning at " +loc.getLineNumber()+" "+ e.toString());
     }
	 public  void error(org.xml.sax.SAXParseException e) throws org.xml.sax.SAXException{
		 System.out.println("From error at " +loc.getLineNumber()+" " + e.toString());
	}
 public  void fatalError(org.xml.sax.SAXParseException e) throws org.xml.sax.SAXException{
	 System.out.println("From fatal at " +loc.getLineNumber()+" " + e.toString());
  }

public static void main(String[] args) throws Exception {
    	javax.xml.parsers.SAXParserFactory pf=
    			javax.xml.parsers.SAXParserFactory.newInstance();
    	pf.setValidating(true);
    	javax.xml.parsers.SAXParser sp=pf.newSAXParser();
    	org.xml.sax.XMLReader parser =sp.getXMLReader();
    	ExampleContentHandler e=new ExampleContentHandler();
       parser.setContentHandler(e);
       parser.setErrorHandler(e);
       java.io.File f1=new java.io.File("C:\\temp\\xml\\saxparser\\books.xml");
       parser.parse(f1.toURL().toString());
    }
}
