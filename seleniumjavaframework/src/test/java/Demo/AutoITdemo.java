package Demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITdemo {
	public static void main(String[] args) throws Exception {
		test();
		
	}
	
	public static void test() throws Exception {
		String projectpath =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mdbootstrap.com/docs/standard/forms/file/");
		driver.findElement(By.className("mdb-skin-custom")).click();	
		Thread.sleep(3000);
				Runtime.getRuntime().exec("C:\\file1\\fileuploadscript.exe");
				Thread.sleep(3000);
				//driver.close();
				System.out.println("completed");
	}

}
