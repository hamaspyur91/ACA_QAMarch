package searchResults;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.PageObject;

public class SearchResultsPage extends PageObject{

	public SearchResultsPage(WebDriver driver) {
		super(driver);
	}
	
	public final static String searchPageMenuXPath = "//div[@id='hdtb-msb-vis']";
   	@FindBy(xpath = searchPageMenuXPath)
	WebElement searchPageMenu;


	@FindBy(xpath = "//div[@id='hdtb-msb-vis']/div[2]//a")
	WebElement imagesLink;

	@FindBy(xpath="//div[@id='hdtb-msb-vis']/div[1]//a")
	WebElement everythingLink;
	
	public ImageResultsPage navigateToImages() {
		imagesLink.click();
		return new ImageResultsPage(driver);

	}
	
	public EverythingResultsPage navigateToEverything() {
		everythingLink.click();
		return new EverythingResultsPage(driver);

	}
}
