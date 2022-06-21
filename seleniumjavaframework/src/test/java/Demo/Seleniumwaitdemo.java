package Demo;

import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Seleniumwaitdemo {
	public static void main(String[] args) {
		seleniumwaits();
	}
	public static void seleniumwaits() {
		String projectpath =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//250 ms
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(10)); 
		//WebElement element = Wait.until(ExpectedConditions.elementToBeClickable(By.name("abcdef")));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("abcdef")));
				driver.findElement(By.name("abcd")).click();
		driver.close();
		driver.quit();
	}

}



