package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Googlesearchpage;

public class Googlesearchtest {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		googlesearch();
	}
public static void googlesearch() {
	String projectpath =System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
	 driver = new ChromeDriver();
	//go to google.com

	 driver.get("https://google.com/");
	//enter text in search textbox
	
	//driver.findElement(By.name("q")).sendKeys("automation step by step");
	Googlesearchpage.textbox_search(driver).sendKeys("automation step by step");
	//click on search button
	//driver.findElement(By.name("btnk")).click();
	//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
	//driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	Googlesearchpage.button_search(driver).sendKeys(Keys.RETURN);
	
	//close browser
	driver.close();
	System.out.println("test completed successfully");
	
}

}



