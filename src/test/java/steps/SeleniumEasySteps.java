package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.GooglePage;
import pages.SeleniumEasyPage;

public class SeleniumEasySteps extends ScenarioSteps {
	
   public SeleniumEasyPage seleniumEasyPage;

    @Step
    public void navigateToPage(){
    	seleniumEasyPage.open();
    }

    @Step
    public void browseUpperMenu(){
    	seleniumEasyPage.clickOnSeleniumDropDown();
    	seleniumEasyPage.actionsInMoreTab();
    	
    	//seleniumEasyPage.clickOnEachTitle();
        waitABit(5000);	// to see what happens after the test stops
    }
}
