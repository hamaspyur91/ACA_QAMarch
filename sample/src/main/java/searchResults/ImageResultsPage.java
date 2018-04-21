package searchResults;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.PageObject;

public class ImageResultsPage extends SearchResultsPage {

	public ImageResultsPage(WebDriver driver) {
		super(driver);
	}
	
	public static final String imageResultsXPath = "//div[@id='isr_mc']";
	@FindBy(xpath = imageResultsXPath)
	WebElement imageResults;

}
