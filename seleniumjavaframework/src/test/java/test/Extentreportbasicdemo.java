package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extentreportbasicdemo {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		ExtentHtmlReporter htmlreporter =  new ExtentHtmlReporter("ExtentReports.html");

		//create extentreports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("google search test one","this is a test to validate google search functionality");
        
        String projectpath =System.getProperty("user.dir");
    	System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
    	 driver = new ChromeDriver();
    	 
    	// log(Status, details)
         test1.log(Status.INFO, "starting test case)");
    	 
    	 driver.get("https://google.com");
    	 test1.pass("navigated to google.com");
    	 driver.findElement(By.name("q")).sendKeys("automation");
    	 test1.pass("entered text in search box");
    	 driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
    	 test1.pass("pressed keyboard enter key");
    	 driver.close();
    	 driver.quit();
    	 test1.pass("closed the browser");
    	 test1.info("test completed");
    	 
//------------------------------------------------------------------------------    	 
    	// creates a toggle for the given test, adds all log events under it    
         ExtentTest test2 = extent.createTest("google search test two","this is a test to validate google search functionality");
         
         
     	System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
     	 driver = new ChromeDriver();
     	 
     	// log(Status, details)
          test2.log(Status.INFO, "starting test case)");
     	 
     	 driver.get("https://google.com");
     	 test2.pass("navigated to google.com");
     	 driver.findElement(By.name("q")).sendKeys("automation");
     	 test2.pass("entered text in search box");
     	 driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
     	 test2.fail("pressed keyboard enter key");
     	 driver.close();
     	 driver.quit();
     	 test1.pass("closed the browser");
     	 test2.info("test completed");
 //----------------------------------------------------------------------------    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	// calling flush writes everything to the log file
         extent.flush();
        
        
	}

}
