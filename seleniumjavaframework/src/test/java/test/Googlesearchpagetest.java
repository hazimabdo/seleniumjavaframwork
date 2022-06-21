package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.googlesearchpageobject;

public class Googlesearchpagetest {
	 private static WebDriver driver = null;
	public static void main(String[] args) {
		googlesearchtest();

}
	public static void googlesearchtest() {
		String projectpath =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 googlesearchpageobject searchpageobj = new googlesearchpageobject(driver);
		 driver.get("https://google.com");
		 searchpageobj.settextinsearchbox("A B C D");
		 searchpageobj.clicksearchbutton();
		 driver.close();
}
	
	
	
}	