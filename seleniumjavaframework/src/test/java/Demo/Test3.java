package Demo;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  String projectpath =System.getProperty("user.dir");
	//System.setProperty("webdriver.gecko.driver",projectpath+"\\drivers\\geckodriver\\geckodriver.exe");
			//System.setProperty("webdriver.firefox.marionette","C:\\Users\\Lenovo\\eclipse-workspace\\seleniumjavaframework\\drivers\\geckodriver\\geckodriver.exe");
			 //driver = new FirefoxDriver();
	  
	  
	  System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void test3() throws Exception {
    driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.1.4");
    driver.findElement(By.id("query")).click();
    driver.findElement(By.id("query")).clear();
    driver.findElement(By.id("query")).sendKeys("junit");
    driver.findElement(By.xpath("//input[@value='Search']")).click();
    driver.get("https://mvnrepository.com/search?q=junit");
    driver.findElement(By.id("query")).clear();
    driver.findElement(By.id("query")).sendKeys("extentreport");
    driver.findElement(By.xpath("//input[@value='Search']")).click();
    driver.get("https://mvnrepository.com/search?q=extentreport");
    driver.findElement(By.id("query")).click();
    driver.findElement(By.id("query")).clear();
    driver.findElement(By.id("query")).sendKeys("selenium java");
    driver.findElement(By.xpath("//input[@value='Search']")).click();
    driver.get("https://mvnrepository.com/search?q=selenium+java");
    driver.findElement(By.linkText("Selenium Java")).click();
    driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java");
    driver.findElement(By.linkText("4.2.2")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
