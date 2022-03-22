package edu.xml.domParser;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.FileInputStream;
import java.io.IOException;
import org.xml.sax.SAXException;

public class DomParser {

	public static void main(String[] args) {
		xmlReaderDOM();
	}
	public static void m1()
	{
		DocumentBuilderFactory builderFactory =
		        DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		try {
		    builder = builderFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
		    e.printStackTrace();  
		}
		try {
			FileInputStream file=
					new FileInputStream("C:\\temp\\xml\\dom\\employees.xml");
		    Document document = builder.parse(file);
		    System.out.println( document.getElementsByTagName("Employee").item(0).getTextContent());
		    
		} catch (SAXException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	public static void m2()
	{
		DocumentBuilderFactory builderFactory =
		        DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		try {
		    builder = builderFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
		    e.printStackTrace();  
		}
		try {
		    Document document = builder.parse(
		            new FileInputStream("C:\\temp\\xml\\empA.xml"));
		    System.out.println( document.getElementsByTagName("Employee").item(0).getTextContent());
		    
		} catch (SAXException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		}

	}
	public static void xmlReaderDOM()
	{
		String filePath = "C:\\temp\\xml\\dom\\empA.xml";
		File xmlFile = new File(filePath);
		DocumentBuilderFactory dbFactory = 
				DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
		    dBuilder = dbFactory.newDocumentBuilder();
		    Document doc = dBuilder.parse(xmlFile);
		    doc.getDocumentElement().normalize();
		    System.out.println("Root element :" + 
		    doc.getDocumentElement().getNodeName());
		    NodeList nodeList = doc.getElementsByTagName("Employee");
		    // now XML is loaded as Document in memory, 
		    // lets convert it to Object List
		    List<Employee> empList = new ArrayList<Employee>();
		    for (int i = 0; i < nodeList.getLength(); i++) {
		        empList.add(getEmployee(nodeList.item(i)));
		    }
		    //lets print Employee list information
		    for (Employee emp : empList) {
		        System.out.println(emp.toString());
		    }
		} catch (SAXException | ParserConfigurationException | IOException e1)
		{
		    e1.printStackTrace();
		}
	}
	private static Employee getEmployee(Node node) 
	{
		Employee emp = new Employee();
		if (node.getNodeType() == Node.ELEMENT_NODE) {
		    Element element = (Element) node;
		    emp.setName(getTagValue("name", element));
		    emp.setAge(Integer.parseInt(getTagValue("age", element)));
		    emp.setGender(getTagValue("gender", element));
		    emp.setRole(getTagValue("role", element));
		}
		return emp;
	}
	private static String getTagValue(String tag, Element element) 
	{
		NodeList nodeList = 
		   element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = nodeList.item(0);
		return node.getNodeValue();
	}
}


