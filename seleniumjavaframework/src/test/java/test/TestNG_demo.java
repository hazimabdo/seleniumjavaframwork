package test;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.Propertiesfile;




public class TestNG_demo {
	WebDriver driver = null;
	public static String browsername=null;
	
	@BeforeTest
	public void setuptest() {
		String projectpath =System.getProperty("user.dir");
		Propertiesfile.getproperties();
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",projectpath+"\\drivers\\geckodriver\\geckodriver.exe");
			System.setProperty("webdriver.firefox.marionette","C:\\Users\\Lenovo\\eclipse-workspace\\seleniumjavaframework\\drivers\\geckodriver\\geckodriver.exe");
		    driver = new FirefoxDriver();
		}
		
		
		 
	}
	
	@Test
public  void googlesearch() {
	
	//go to google.com
	driver.get("http://google.com/");
	//enter text in search textbox
	
	driver.findElement(By.name("q")).sendKeys("automation step by step");
	
	//click on search button
	//driver.findElement(By.name("btnk")).click();
	driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	
	
	
	
}

	@AfterTest
public void teardowntest() {
	
	//close browser
		driver.close();
		//driver.quit();
		System.out.println("test completed successfully");
		Propertiesfile.setproperties();
		
	
}
}

