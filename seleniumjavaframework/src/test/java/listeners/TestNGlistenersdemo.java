package listeners;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.SkipException;
import org.testng.annotations.Listeners;


public class TestNGlistenersdemo {
    
	@Test
	public void test1() {
		System.out.println("i am inside test1");
	}
    
	@Test
	public void test2() {
		System.out.println("i am inside test2");
		
		String projectpath =System.getProperty("user.dir");
		System.out.println("projectpath :  "+projectpath);
			//System.setProperty("webdriver.gecko.driver",projectpath+"\\drivers\\geckodriver\\geckodriver.exe");
			//System.setProperty("webdriver.firefox.marionette","C:\\Users\\Lenovo\\eclipse-workspace\\seleniumjavaframework\\drivers\\geckodriver\\geckodriver.exe");
			//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://google.com/");
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcd");
			driver.findElement(By.xpath("//input[@name='abc']")).sendKeys("abcd");
		
		driver.close();
		
		
	
	}
	@Test
	public void test3() {
		System.out.println("i am inside test3");
		throw new SkipException("this test is skipped");
	}
}
