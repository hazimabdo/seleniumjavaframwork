package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_googlesearch {
	public static void main(String[] args) {
		googlesearch();
	}
public static void googlesearch() {
	String projectpath =System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//go to google.com
	driver.get("http://google.com/");
	//enter text in search textbox
	
	driver.findElement(By.name("q")).sendKeys("automation step by step");
	
	//click on search button
	//driver.findElement(By.name("btnk")).click();
	driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	
	
	//close browser
	//driver.close();
	System.out.println("test completed successfully");
	
}
}

