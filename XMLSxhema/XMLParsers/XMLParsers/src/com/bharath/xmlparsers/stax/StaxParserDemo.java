package com.bharath.xmlparsers.stax;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import com.bharath.xmlparsers.dto.DriversLicense;

public class StaxParserDemo {

	public static void main(String[] args) throws XMLStreamException {
		// TODO Auto-generated method stub
		XMLInputFactory factory = XMLInputFactory.newInstance();
		
		// We will use this XMLStreamReader and pull the events which we want or move 
		// the cursor one node at a timeand get the values out of our DriversLicense.xml
		// STAX parser will point at the first element of the xml
		XMLStreamReader xmlStreamReader = factory.createXMLStreamReader(ClassLoader.getSystemResourceAsStream("xml/DriversLicense.xml"));
		DriversLicense license = null;
		String content = null;
		
		while(xmlStreamReader.hasNext()) {
			int event = xmlStreamReader.next();
			switch(event) {
			case XMLStreamConstants.START_ELEMENT:
				if(xmlStreamReader.getLocalName().equals("DriversLicense")) {
					System.out.println(xmlStreamReader.getAttributeValue(0));
					license = new DriversLicense();
				}
				break;
			case XMLStreamConstants.CHARACTERS:
				content = xmlStreamReader.getText().trim();
				break;
			case XMLStreamConstants.END_ELEMENT:
				switch(xmlStreamReader.getLocalName()) {
				case "Number":
					license.setNumber(Long.parseLong(content));
					break;
				case "FirstName":
					license.setFirstName(content);
					break;
				case "LastName":
					license.setLastName(content);
					break;
				}
			}
		}
		
		System.out.println(license.getLastName());
		System.out.println(license.getFirstName());
		System.out.println(license.getNumber());
		
		
		
		
		
		
	}

}
