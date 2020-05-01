package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.GoogleSteps;
import steps.SeleniumEasySteps;
import utils.Constants;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class GoogleTests {

	@Managed(uniqueSession = true)
	public WebDriver driver;

	@Steps
	GoogleSteps googleSteps;

	@Steps
	SeleniumEasySteps seleniumEasySteps;

	@Before
	public void prepareBrowserWindow() {
		driver.manage().window().maximize();
	}

	// a search on Amazon.com
	@Test
	public void searchForSomething() {
		googleSteps.navigateToPage();
		googleSteps.searchOnAmazon(Constants.SEARCH_OBJECT);
	}

	// a search on https://www.seleniumeasy.com/
	@Test
	public void navigateOnSeleniumEasy() {
		seleniumEasySteps.navigateToPage();
		seleniumEasySteps.browseUpperMenu();
	}

	@After
	public void endDriver() {
		driver.quit();
		// System.out.println("\n Thx for watching \n");
	}

}