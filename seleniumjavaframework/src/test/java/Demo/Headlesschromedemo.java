package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlesschromedemo {
	public static void main(String[] args) {
		test();
	}
	public static void test() {
		String projectpath =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("window-size=1366,768");
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle()); 
		driver.findElement(By.name("q")).sendKeys("automation");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		driver.close();
		driver.quit();
		System.out.println("completed");
	}

}
