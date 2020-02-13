package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.GoogleSteps;
import utils.Constants;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class GoogleTests {
	
    @Managed(uniqueSession = true)
    public  WebDriver driver;

    
    @Steps
     GoogleSteps googleSteps;
    
    @Before
    public void prepareBrowserWindow() {
    	driver.manage().window().maximize();
    }
    
    // 
    @Test
    public void searchForSomething(){    	
        googleSteps.navigateToPage();
        googleSteps.searchOnAmazon(Constants.SEARCH_OBJECT);      
    }	
    
    @After
    public void endDriver() {
        driver.quit();
        //System.out.println("\n Thx for watching \n");
    }
      
}