import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class desiredcapabilities_demo {

	public static void main(String[] args) {
		
		String projectpath =System.getProperty("user.dir");
		
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreprotectedmodesettings",true);
		System.setProperty("webdriver.ie.driver",projectpath+"\\drivers\\IEdriver\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver(caps);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("ABCD");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		driver.close();
		driver.quit();
	}

}
