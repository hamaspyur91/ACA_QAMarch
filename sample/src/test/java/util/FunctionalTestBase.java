package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//comment

public class FunctionalTestBase {
	
	public WebDriver driver ;
	final String URL = "https://google.com";
	String chromeDriverProp = "webdriver.chrome.driver";
	String driverPath="C:\\Users\\Hamaspyur Petrosyan\\Documents\\drivers\\chromedriver.exe";
	
	@BeforeClass
	public void setup() {
		System.setProperty(chromeDriverProp , driverPath );
		driver = new ChromeDriver();
		driver.get(URL);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
