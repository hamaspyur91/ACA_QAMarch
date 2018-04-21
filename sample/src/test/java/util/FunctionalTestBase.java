package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class FunctionalTestBase {
	
	public WebDriver driver ;
	final String URL = "https://google.com";
	String chromeDriverProp = "webdriver.chrome.driver";
	String driverPath="C:\\Users\\hovsepyana\\Downloads\\chromedriver.exe";
	
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
