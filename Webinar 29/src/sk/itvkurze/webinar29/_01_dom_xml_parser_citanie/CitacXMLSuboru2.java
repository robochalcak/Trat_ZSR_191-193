package sk.itvkurze.webinar29._01_dom_xml_parser_citanie;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class CitacXMLSuboru2 {

	public static void main(String[] args) {
		try
		{
			File xmlSubor = new File("staff.xml");
			DocumentBuilder dokumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document dokument = dokumentBuilder.parse(xmlSubor);
			
			System.out.println("Korenovy element : " + dokument.getDocumentElement().getNodeName());
			
			if (dokument.hasChildNodes())
			{
				zobrazInfo(dokument.getChildNodes());
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void zobrazInfo(NodeList nodeList) {
		for (int i = 0; i < nodeList.getLength(); i++)
		{
			Node docasnyNode = nodeList.item(i);
			
			// uistime sa, ze sa jedna o element node
			if (docasnyNode.getNodeType() == Node.ELEMENT_NODE)
			{
				// ziskame nazov a hodnotu nodu
				System.out.println("Nazov nodu: " + docasnyNode.getNodeName() + " [OPEN]");
				System.out.println("Hodnota nodu: " + docasnyNode.getTextContent());
				
				if (docasnyNode.hasAttributes())
				{
					// ziskame nazvy a hodnoty atributov
					NamedNodeMap nodeMap = docasnyNode.getAttributes();
					
					for (int j = 0; j < nodeMap.getLength(); j++)
					{
						Node node = nodeMap.item(j);
						System.out.println("Nazov atributu: " + node.getNodeName());
						System.out.println("Hodnota atributu: " + node.getNodeValue());
					}
				}
				
				if (docasnyNode.hasChildNodes())
				{
					// ak obsahuje dalsie child nody, musime rekurzivne prejst dany node
					zobrazInfo(docasnyNode.getChildNodes());
				}
				
				System.out.println("Nazov nodu: " + docasnyNode.getNodeName() + " [CLOSE]");
			}
		}
	}
}
