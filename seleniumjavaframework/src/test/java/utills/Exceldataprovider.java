package utills;

import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.Propertiesfile;

public class Exceldataprovider {
	 WebDriver driver=null;
	
	@BeforeTest
	public void setuptest() {
		String projectpath =System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
			 driver = new ChromeDriver();
		
	}
		
		 

	
	
	
	
	
	@Test(dataProvider="test1data" )
	public void test1(String username, String password) throws Exception{
		System.out.println(username+"   |   "+password);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(2000);
		
	}

	@AfterTest
	public void teardowntest() {
		
		//close browser
			driver.close();
			//driver.quit();
			System.out.println("test completed successfully");
			Propertiesfile.setproperties();
	}
	
	
	@DataProvider(name = "test1data")
	public  Object[][] getdata() {
		String excelpath = "C:\\Users\\Lenovo\\eclipse-workspace\\seleniumjavaframework\\excell\\data.xlsx";
		Object data[][] = testdata(excelpath, "sheet1");
		return data;
	}
	
	
	public Object[][] testdata(String excelpath, String sheetname) {
		Excellutills excel = new Excellutills(excelpath, sheetname);
		
		int rowcount = excel.getrowcount();
		int colcount = excel.getcolcount();
		Object data[][] = new Object[rowcount-1][colcount];
		for(int i=1; i<rowcount; i++){
			for(int j=0; j<colcount; j++) {
				String celldata = excel.getcelldatastring(i,j);
				
				//System.out.print(celldata+"  |  ");
				data[i-1][j] = celldata;
			}
			//System.out.println();
		}
		return data;
		
	}

}
