package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNG_demo;

public class Propertiesfile {
	static Properties prop = new Properties();
	static String projectpath = System.getProperty("user.dir");

	public static void main(String[] args) {
		getproperties();
setproperties();
getproperties();
	}
public static void getproperties() {
	try {
		
		
		
		InputStream input = new FileInputStream(projectpath+"\\src\\test\\java\\config\\config.properties");
	prop.load(input);
	String browser = prop.getProperty("browser");
	System.out.println(browser);
	TestNG_demo.browsername=browser;
	
	}catch (Exception exp) {
		System.out.println(exp.getMessage());
		
		exp.getCause();
		exp.printStackTrace();
		
	}
	
}
public static void setproperties() {
	try {
	OutputStream output = new FileOutputStream(projectpath+"\\src\\test\\java\\config\\config.properties");
	prop.setProperty("result", "pass");
	prop.store(output, null);
	}catch (Exception exp) {
		System.out.println(exp.getMessage());
		
		exp.getCause();
		exp.printStackTrace();
		
	}
}
}
