package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	private static Properties properties;
	private static String filePath="./Configuration/config.properties";
	public static String readApplicationUrl() {
	File file = new File(filePath);
	properties = new Properties();
	try {
	FileInputStream fis = new FileInputStream(file);
	properties.load(fis);
	}
	catch(Exception e) {
		System.out.println("Issue loading configuration properties file"+ e.getMessage());
	}
	return properties.getProperty("appUrl");
	}

}
