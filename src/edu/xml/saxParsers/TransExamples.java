package edu.xml.saxParsers;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;

import java.io.File;
import java.io.FileNotFoundException;
public class TransExamples {
    public static void main(String argv[]) throws TransformerException, FileNotFoundException {
		String sourceID = "c:\\temp\\xml\\saxparser\\books.xml";
        String xslID = "c:\\temp\\xml\\saxparser\\book.xsl";
         try {
                  createHTML(sourceID, xslID);
            } catch (Exception ex) {
                System.out.println(ex);
            }
    }
    public static void createHTML(String sourceID, String xslID) throws TransformerException, TransformerConfigurationException {

        TransformerFactory tfactory = TransformerFactory.newInstance();
        String outputTarget="c:\\temp\\xml\\saxparser\\books.html";
        File f=new File(outputTarget);
        Transformer transformer =
            tfactory.newTransformer(new StreamSource(xslID));
        
//        transformer.transform(new StreamSource(sourceID),
//                new StreamResult(System.out));
        transformer.transform(new StreamSource(sourceID),
                new StreamResult(f));
        System.out.println("Transformation done");
    }
}

