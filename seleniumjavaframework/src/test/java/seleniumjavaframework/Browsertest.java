package seleniumjavaframework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsertest {
	
	public static void main(String[] args) throws InterruptedException {
	String projectpath =System.getProperty("user.dir");
	System.out.println("projectpath :  "+projectpath);
		//System.setProperty("webdriver.gecko.driver",projectpath+"\\drivers\\geckodriver\\geckodriver.exe");
		//System.setProperty("webdriver.firefox.marionette","C:\\Users\\Lenovo\\eclipse-workspace\\seleniumjavaframework\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
	//System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.ie.driver",projectpath+"\\drivers\\IEdriver\\IEDriverServer.exe");
	WebDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcd");
		List<WebElement> listofinputelement = driver.findElements(By.xpath("//input"));
				int count = listofinputelement.size();
				System.out.println("count of input element : "+count);
		//WebElement textbox = driver.findElement(By.name("q"));
		//textbox.sendKeys("automation step by step");
		Thread.sleep(3000);
		
		driver.close();
		//driver.quit();
	}

}
