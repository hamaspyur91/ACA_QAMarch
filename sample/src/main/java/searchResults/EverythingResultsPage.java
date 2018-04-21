package searchResults;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.WikiPage;

public class EverythingResultsPage extends SearchResultsPage {

	public EverythingResultsPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath = "//div[@id='rso']//div[@class='rc'][1]/h3/a[1]")
	WebElement firstLink;
	
	public WikiPage navigateToWiki() {
		firstLink.click();
		return new WikiPage(driver);
	}

	

}
