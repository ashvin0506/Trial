package com.accenture.utilities;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XMLUtility {
	public void readxml() throws JAXBException {
		File f = new File("src/test/java/TestData.xml");
		JAXBContext j = JAXBContext.newInstance(RegistrationData.class);
		Unmarshaller u = j.createUnmarshaller();
		RegistrationData r = (RegistrationData)u.unmarshal(f);
		List<Data> myData = r.getUserdata();
		for(Data d : myData) {
			System.out.println("First Name: "+d.getFirstname());
			System.out.println("Last Name: "+d.getLastname());
		}
	}

	public static void main(String args[]) throws JAXBException {
		XMLUtility x = new XMLUtility();
		x.readxml();
	}
}