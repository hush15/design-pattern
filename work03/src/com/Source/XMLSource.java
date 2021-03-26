package com.Source;
import java.io.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.Node;

import org.w3c.dom.*;


public class XMLSource {
	public static Object getBean() {
		try {
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc =builder.parse(new File("src/config.xml"));
			String n= doc.getElementsByTagName("sourceNameFactory").item(0).getTextContent();			
			Class<?> c = Class.forName("com.Source."+n);
			Object obj = c.newInstance();
			return obj;

		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
}
