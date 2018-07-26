package com.accenture.utilities;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="registrationData")
public class RegistrationData {
	private List<Data> registrationdata;
	
	@XmlElement(name="data")
	public void setUserdata (List<Data> d)
	{
		this.registrationdata=d;
	}
	public List<Data> getUserdata ()
	{
		return registrationdata;
	}

}
