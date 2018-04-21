package firstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.GoogleHomePage;
import pages.WikiPage;
import searchResults.ImageResultsPage;
import searchResults.EverythingResultsPage;
import util.FunctionalTestBase;

public class MyTestClass2 extends FunctionalTestBase {

	/*
	 * test case:
	 * title: /.../
	 * step1. open google.com
	 * step2. search cheese
	 * step3. from Everything (amen inch) page navigate to Images
	 * step4. from Images navigate back to everything page
	 * step5. from everything page navigate to wiki page
	 * 
	 * Verify (Assert.asswerTrue(isElementPresent)
	 * after step2. verify Search results menu is present
	 * after step3. verify images page is displayed -- by all images element (by.allImagesXPath)
	 * after step5. verify wiki logo is present -- which means, wiki page was displayed
	 */
	@Test
	public void firstTest() throws InterruptedException {
		final String searchText = "cheese!";
		// Find the text input element by its name
		// *** call method to search text in google search field
		GoogleHomePage googleHomePage = new GoogleHomePage(driver);

		EverythingResultsPage resultsPage = googleHomePage.searchText(searchText);
		Assert.assertTrue(resultsPage.isElementPresent(EverythingResultsPage.searchPageMenuXPath));

		ImageResultsPage imageResults = resultsPage.navigateToImages();
		Assert.assertTrue(imageResults.isElementPresent(ImageResultsPage.imageResultsXPath));

		resultsPage = imageResults.navigateToEverything();

		WikiPage wikiPage = resultsPage.navigateToWiki();
		Assert.assertTrue(wikiPage.isElementPresent(WikiPage.wikiLogoXpath));

		// Check the title of the page
		System.out.println("Page title is: " + driver.getTitle());

		Thread.sleep(3000);

		// Should see: "cheese! - Google Search"
		System.out.println("Page title is: " + driver.getTitle());

	}

	public static void main(String[] args) {

	}
}
