package com.bharath.xmlparsers.dom;

import java.io.IOException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.bharath.xmlparsers.dto.Address;
import com.bharath.xmlparsers.dto.DriversLicense;


/*
 * The very first step in creating a DOM parser is to create a Document Builder Factory
 * So the DOM parser creation and most of the parser's creation as you will see later, 
 * involves a factory pattern, factory design pattern.
 * 
 */


/* We have created our parser, this documentBuilder is nothing but our DOM parser.  */

/* Everything in the DOM API is a node. So the elements, the attributes everything, even the text 
 * is represented as a node.
 *  */

/*
 * We will use the DOM parser to get to the status attribute abd it's value on the DriversLicense
 * to check the status of our drivers license.
 * 
 * 
 * 
 */

public class DOMParserDemo {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = factory.newDocumentBuilder();
		Document document = (Document) documentBuilder.parse(ClassLoader.getSystemResourceAsStream("xml/DriversLicense.xml"));
		DriversLicense license = new DriversLicense();
		
		NodeList numberList = ((org.w3c.dom.Document) document).getElementsByTagName("Number");
		Node numberItem = numberList.item(0);
		license.setNumber(Long.parseLong(numberItem.getTextContent()));
		
		NodeList firstNameList = ((org.w3c.dom.Document) document).getElementsByTagName("FirstName");
		Node firstNameItem = firstNameList.item(0);
		license.setFirstName(firstNameItem.getTextContent());
		
		NodeList lastNameList = ((org.w3c.dom.Document) document).getElementsByTagName("LastName");
		Node lastNameItem = lastNameList.item(0);
		license.setLastName(lastNameItem.getTextContent());
		
		/*
		 * To get to the atttribute first we need to get to the root element, which is the 
		 * DriversLicense element. We can either use the getElementByTagName or we can simply
		 * say document.getDocumentElement.
		 */
		
		Element documentElement = document.getDocumentElement();
		license.setStatus(documentElement.getAttribute("status"));
		
		/*
		 * We will start by getting to the address element first.
		 */
		NodeList addressList = document.getElementsByTagName("Address");
		Node addressNode = addressList.item(0);
		NodeList addressChildNodes = addressNode.getChildNodes();
		Address address = new Address();
		
		for(int i=0; i<addressChildNodes.getLength();i++) {
			Node item = addressChildNodes.item(i);
			
			if(item instanceof Element) {
				switch (item.getNodeName()) {
				case "street":
					address.setStreet(item.getTextContent());
					break;
				case "city":
					address.setCity(item.getTextContent());
					break;
				case "state":
					address.setState(item.getTextContent());
					break;
				case "country":
					address.setCountry(item.getTextContent());
					break;
				case "zipcode":
					address.setZipcode(item.getTextContent());
					break;
				}
			}
		}
		
		license.setAddress(address);
	
		System.out.println(license.getNumber());
		System.out.println(license.getFirstName());
		System.out.println(license.getLastName());
		System.out.println(license.getStatus());
		System.out.println(license.getAddress().getCity());
		
		
		
		
	}

}
