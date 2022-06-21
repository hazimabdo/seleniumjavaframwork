package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentreportsdemowithTestNG {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver;
	@BeforeSuite
	public void setup() {
		 htmlReporter = new ExtentHtmlReporter("extent.html");
		 extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		
	


	}


	@BeforeTest
	public void setuptest() {
		String projectpath =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@Test
	public void test1() throws Exception {
		

		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		
		driver.get("http://google.com");
		test.pass("navigated to google.com");
		
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        
        test.info("This step shows usage of info(details)");
        
        
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        
        test.addScreenCaptureFromPath("screenshot.png");
        
		
		
		
		
		
	}
	

	@Test
	public void test2() throws Exception {

		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        
        test.info("This step shows usage of info(details)");
        
        
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        
        test.addScreenCaptureFromPath("screenshot.png");
        
		
		
		
		
		
	}
	
	

	@AfterTest
public void teardowntest() {
	
	//close browser
		driver.close();
		driver.quit();
		System.out.println("test completed successfully");
		
	
}
	
	@AfterSuite
	public void teardown() {
        extent.flush();

	}
}
