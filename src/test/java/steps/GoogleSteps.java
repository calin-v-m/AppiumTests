package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.GooglePage;

public class GoogleSteps extends ScenarioSteps {
	
   private GooglePage googlePage;

    @Step
    public void navigateToPage(){
        googlePage.open();
    }

    @Step
    public void searchOnAmazon(String parameter){
        googlePage.fillField(parameter);
        googlePage.clickSearch();
        googlePage.clickSamsungCheckBox();
        googlePage.clickOnUnlockedPhones();     
        googlePage.clickInScreenSize();  
        
        googlePage.clickOnPriceSelectorTabLowerVal(); 
        googlePage.clickOnPriceSelectorTabUpperVal();  
        googlePage.clickOnNewCondition();
        googlePage.clickOn128GbMemoryBox();
        googlePage.clickOnDropDown();
        googlePage.loopThroughTheList();
        waitABit(5000);	// to see what happens after the test stops
    }
}
