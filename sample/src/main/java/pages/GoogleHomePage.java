package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basePage.PageObject;
import searchResults.EverythingResultsPage;

public class GoogleHomePage extends PageObject {
	 

	public GoogleHomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="q")
	WebElement element;
	
	public EverythingResultsPage searchText(String searchText) {
		
	        element.click();
	        // Enter something to search for
	        element.sendKeys(searchText);
	        // Now submit the form. WebDriver will find the form for us from the element
	        element.submit();
	        
	        return new EverythingResultsPage(driver);
	}
}
