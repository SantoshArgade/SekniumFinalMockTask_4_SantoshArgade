package com.crm.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readproperties {

	public static String property(String key) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\qspiders\\com.crm.finalMock\\src\\test\\resources\\Dwsproperty");
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
	}
}
