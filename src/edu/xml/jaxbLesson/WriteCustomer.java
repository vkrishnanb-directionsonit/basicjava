package edu.xml.jaxbLesson;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class WriteCustomer {

	public static void main(String[] args) {
		m2XML2Object();
	}
	public static void m1Object2XML()
	{
	  Customer customer = new Customer();
	  customer.setId(100);
	  customer.setName("venkat");
	  customer.setAge(51);

	  try {

		File file = new File("C:\\temp\\xml\\jaxb\\Customer.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		jaxbMarshaller.marshal(customer, file);
		jaxbMarshaller.marshal(customer, System.out);

      } catch (JAXBException e) {
		e.printStackTrace();
      }


	}
	public static void m2XML2Object()
	{
		try {

			File file = new File("C:\\temp\\xml\\jaxb\\customer.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
			System.out.println(customer);

		  } catch (JAXBException e) {
			e.printStackTrace();
		  }

	}
}

