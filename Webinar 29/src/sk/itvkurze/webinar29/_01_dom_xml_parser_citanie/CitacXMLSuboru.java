package sk.itvkurze.webinar29._01_dom_xml_parser_citanie;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class CitacXMLSuboru {

	public static void main(String[] args) {
		try
		{
			File xmlSubor = new File("staff.xml");
			DocumentBuilderFactory dokumentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dokumentBuilder = dokumentBuilderFactory.newDocumentBuilder();
			Document dokument = dokumentBuilder.parse(xmlSubor);
			
			// normalizacia je volitelna, ale je doporucene ju urobit
			dokument.getDocumentElement().normalize();
			
			System.out.println("Korenovy element: " + dokument.getDocumentElement().getNodeName());
			
			NodeList nodeList = dokument.getElementsByTagName("staff");
			
			System.out.println("---------------------------------");
			
			for (int i = 0; i < nodeList.getLength(); i++)
			{
				Node node = nodeList.item(i);
				
				System.out.println("\nAktualny element: " + node.getNodeName());
				
				if (node.getNodeType() == Node.ELEMENT_NODE)
				{
					Element element = (Element) node;
					
					System.out.println("Saff id : " + element.getAttribute("id"));
					System.out.println("First Name: " + element.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println("Last Name: " + element.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println("Nick Name: " + element.getElementsByTagName("nickname").item(0).getTextContent());
					System.out.println("Salary: " + element.getElementsByTagName("salary").item(0).getTextContent());
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
