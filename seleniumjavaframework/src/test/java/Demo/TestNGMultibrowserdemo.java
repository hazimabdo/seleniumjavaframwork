package Demo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultibrowserdemo {
	WebDriver driver = null;
	String projectpath =System.getProperty("user.dir");
	
	@Parameters("browsername")
	@BeforeTest
	
	public void setup(String browsername) {
		System.out.println("browser name is : "+browsername);
		System.out.println("thread id : "+Thread.currentThread().getId());
		
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",projectpath+"\\drivers\\geckodriver\\geckodriver.exe");
			System.setProperty("webdriver.firefox.marionette","C:\\Users\\Lenovo\\eclipse-workspace\\seleniumjavaframework\\drivers\\geckodriver\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",projectpath+"\\drivers\\IEdriver\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		}
	}
@Test
	public void test1() throws Exception {
	driver.get("http://google.com/");
	Thread.sleep(10000);
		
	}
@AfterTest
public void teardown() {
	driver.close();
	System.out.println("test completed successfully");
	
}
	
}
