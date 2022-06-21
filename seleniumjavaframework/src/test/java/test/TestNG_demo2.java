package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class TestNG_demo2 {
	WebDriver driver = null;
	
	@BeforeTest
	public void setuptest() {
		String projectpath =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@Test
public  void googlesearch2() {
	
	//go to google.com
	driver.get("http://google.com/");
	//enter text in search textbox
	
	driver.findElement(By.name("q")).sendKeys("automation step by step");
	
	//click on search button
	//driver.findElement(By.name("btnk")).click();
	driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	
	
	
	
}
	
	
	@Test
public  void googlesearch3() {
	
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
		driver.quit();
		System.out.println("test completed successfully");
		
	
}
}

