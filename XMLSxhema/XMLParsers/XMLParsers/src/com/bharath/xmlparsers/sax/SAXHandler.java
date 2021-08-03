package com.bharath.xmlparsers.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.bharath.xmlparsers.dto.DriversLicense;

/*
 * Here we can either implement the contentHandler interface from the SAX API or we can 
 * simply extend the DefaultHandler that is available in the SAX API. This is a helper class
 * that implements several interfaces in the SAX API so that we need no create skeleton 
 * methods for all the methods that are there in those interfaces which we don't even need.
 * 
 * We will be overriding only three methods, that is
 * 1) startElement: will be fired or will be 
 * 	  called by the SAX parser when it hits any start elements in this XML. 
 *    It could be a DriversLicense, Number,Address,Street or any of the start elements.
 *    It takes four parameters as you can see, the URI which is the namespace URI, 
 *    localName, qName which is just the name of the element here. 
 */
public class SAXHandler extends DefaultHandler {
	
	private DriversLicense driversLicense;
	private String content;
	
	@Override
	public void startElement (String uri, String localName, String qName, Attributes attributes) throws SAXException
	{
		if(qName.equals("DriversLicense")) {
			driversLicense = new DriversLicense();
		}
		
	}
	
	@Override
	public void endElement (String uri, String localName, String qName) throws SAXException
	{
	    
		switch(qName) {
		case "Number":
			getDriversLicense().setNumber(Long.parseLong(content));
			break;
		case "FirstName":
			getDriversLicense().setFirstName(content);
			break;
		case "LastName":
			getDriversLicense().setLastName(content);
			break;
		}
	}
	
	@Override
	public void characters (char ch[], int start, int length) throws SAXException
	{
	    content = String.copyValueOf(ch, start, length).trim();
	}

	public DriversLicense getDriversLicense() {
		return driversLicense;
	}

}
