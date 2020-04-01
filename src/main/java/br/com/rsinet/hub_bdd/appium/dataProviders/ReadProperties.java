package br.com.rsinet.hub_bdd.appium.dataProviders;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ReadProperties {
	
	private String propertiesFile;
	private final static String propFilePath = "//configs//";
	
	public ReadProperties(String propertiesFile) {
		this.propertiesFile = propertiesFile;
	}
	
	Logger logger = Logger.getLogger("ReadProperties.class");
	
	public Properties getProperty() {
		
		Properties properties = new Properties();
		try {
			String configFilePath = System.getProperty("user.dir") + propFilePath + propertiesFile + ".properties";
			properties.load(new FileInputStream(configFilePath));
		} catch (FileNotFoundException e) {
			logger.error(e.toString());
			logger.error(e.getMessage());
		} catch (IOException e) {
			logger.error(e.toString());
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return properties;
		
	}

}
