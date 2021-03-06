package com.project.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	public static FileInputStream inputStream;
	public static Properties prop;
	public static FileOutputStream outputStream;

	public static String getProperty(String propertyName) throws IOException {
		
		inputStream = new FileInputStream(new File(System.getProperty("user.dir")+"/src/test/java/com/project/config/config.properties"));
		prop = new Properties();
		prop.load(inputStream);
		
		String propertyValue= prop.getProperty(propertyName);
		
		return propertyValue;
	} 
	
	public static void setProperty(String browser) throws IOException {
		outputStream = new FileOutputStream(new File(System.getProperty("user.dir")+"/src/test/java/com/project/config/config1.properties"));
		prop = new Properties();
		prop.setProperty("browser", browser);
		prop.store(outputStream, null);	
	}
	
	public static String getProperty1(String propertyName) throws IOException {
		
		inputStream = new FileInputStream(new File(System.getProperty("user.dir")+"/src/test/java/com/project/config/config1.properties"));
		prop = new Properties();
		prop.load(inputStream);
		
		String propertyValue= prop.getProperty(propertyName);
		
		return propertyValue;
	} 

}
