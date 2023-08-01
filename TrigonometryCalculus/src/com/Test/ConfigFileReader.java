package com.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader 
{
	private final String propertyFilePath= "configs//Configuration.properties";
	private Properties properties;

		
		public ConfigFileReader(){
			BufferedReader reader;
			try {
				reader = new BufferedReader(new FileReader(propertyFilePath));
				properties = new Properties();
				try {
					properties.load(reader);
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
			}		
		}
		
		public String getDriverPath(){
			String driverPath = properties.getProperty("Chromedriverpath");
			if(driverPath!= null) 
				return driverPath;
			else 
				throw new RuntimeException("driverPath not specified in the Configuration.properties file.");		
		}
		
		public long getImplicitlyWait() {		
			String implicitlyWait = properties.getProperty("implicitlyWait");
			if(implicitlyWait != null) 
				return Long.parseLong(implicitlyWait);
			else 
				throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");		
		}
		
		public String getApplicationUrl() {
			String url = properties.getProperty("url");
			if(url != null) 
				return url;
			else 
				throw new RuntimeException("url not specified in the Configuration.properties file.");
		}

		public String Xpath1() {
			String Xpath1 = properties.getProperty("TrignometryExpress_Xpath1");
			if(Xpath1 != null) 
				return Xpath1;
			else 
				throw new RuntimeException("Xpath1 not specified in the Configuration.properties file.");
		}
		
		public String Xpath2() {
			String Xpath2 = properties.getProperty("RightTriangle_Xpath_Go");
			if(Xpath2 != null) 
				return Xpath2;
			else 
				throw new RuntimeException("Xpath2 not specified in the Configuration.properties file.");
		}
		
		public String Xpath3() {
			String Xpath3 = properties.getProperty("RightTriangle_Xpath_clear");
			if(Xpath3 != null) 
				return Xpath3;
			else 
				throw new RuntimeException("Xpath3 not specified in the Configuration.properties file.");
		}
		
		public String Xpath4() {
			String Xpath4 = properties.getProperty("ClickforDifferentiate1");
			if(Xpath4 != null) 
				return Xpath4;
			else 
				throw new RuntimeException("Xpath4 not specified in the Configuration.properties file.");
		}
		
		public String Xpath5() {
			String Xpath5 = properties.getProperty("ClickforDifferentiate2");
			if(Xpath5 != null) 
				return Xpath5;
			else 
				throw new RuntimeException("Xpath5 not specified in the Configuration.properties file.");
		}
		
		public String Xpath6() {
			String Xpath6 = properties.getProperty("IntegrateButton");
			if(Xpath6 != null) 
				return Xpath6;
			else 
				throw new RuntimeException("Xpath6 not specified in the Configuration.properties file.");
		}
		
		public String Xpath7() {
			String Xpath7 = properties.getProperty("IntegrateButton");
			if(Xpath7 != null) 
				return Xpath7;
			else 
				throw new RuntimeException("Xpath7 not specified in the Configuration.properties file.");
		}
		
		public String cssSelector1() {
			String cssSelector1 = properties.getProperty("BacktoMathCssSelector");
			if(cssSelector1 != null) 
				return cssSelector1;
			else 
				throw new RuntimeException("cssSelector1 not specified in the Configuration.properties file.");
		}
	
		public String getedgeDriverPath(){
			String driverPath2 = properties.getProperty("edgeDriverPath");
			if(driverPath2!= null) 
				return driverPath2;
			else 
				throw new RuntimeException("Edge driverPath not specified in the Configuration.properties file.");		
		}
		
}
