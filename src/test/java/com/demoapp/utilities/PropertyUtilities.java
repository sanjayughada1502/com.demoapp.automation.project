package com.demoapp.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtilities {

	/**
	 * This method will return the data from 'property file' by passing the key
	 * @param key
	 * @return String Data
	 * @throws IOException
	 */
	public String getData(String key) throws IOException {
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\commondata.property");
		Properties p = new Properties();
		p.load(file);
		String data = p.getProperty(key);
		return data;
	}
}
