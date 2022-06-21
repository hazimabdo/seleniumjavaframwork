package Demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class Test2 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeMethod
@BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  String projectpath =System.getProperty("user.dir");
	  System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void test2() throws Exception {
    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    driver.findElement(By.id("txtUsername")).click();
    driver.findElement(By.id("txtUsername")).clear();
    driver.findElement(By.id("txtUsername")).sendKeys("admin");
    driver.findElement(By.id("txtPassword")).click();
    driver.findElement(By.id("txtPassword")).clear();
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    driver.findElement(By.id("btnLogin")).click();
    driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
    driver.findElement(By.id("welcome")).click();
    driver.findElement(By.linkText("Logout")).click();
    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    driver.get(baseUrl + "chrome://newtab/");
    driver.get("http://upwork.com/ab/account-security/login?redir=%2Fnx%2Ffind-work%2F");
    driver.findElement(By.id("login_username")).clear();
    driver.findElement(By.id("login_username")).sendKeys("hazimabdo67@gmail.com");
    driver.findElement(By.id("login_password_continue")).click();
    driver.findElement(By.id("login_password")).clear();
    driver.findElement(By.id("login_password")).sendKeys("Hh-7654321");
    driver.findElement(By.id("login_control_continue")).click();
    driver.get("http://upwork.com/nx/find-work/");
    driver.findElement(By.id("login_username")).clear();
    driver.findElement(By.id("login_username")).sendKeys("hazimabdo67@gmail.com");
    driver.findElement(By.id("login_password_continue")).click();
    driver.findElement(By.id("login_password")).clear();
    driver.findElement(By.id("login_password")).sendKeys("Hh-7654321");
    driver.findElement(By.id("login_control_continue")).click();
    driver.get("http://upwork.com/nx/find-work/");
  }

  @AfterMethod
@AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      Assert.fail(verificationErrorString);
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
