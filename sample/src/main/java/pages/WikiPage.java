package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.PageObject;

public class WikiPage extends PageObject {

	public WikiPage(WebDriver driver) {
		super(driver);
	}

	public static final String wikiLogoXpath = "//a[@class='mw-wiki-logo']";

	@FindBy(xpath = wikiLogoXpath)
	WebElement wikiLogo;

}
