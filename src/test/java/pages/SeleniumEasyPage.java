package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.seleniumeasy.com/")
public class SeleniumEasyPage extends PageObject {

    @FindBy(css = "li[class^='leaf']")
    List<WebElementFacade> topMenuList = new ArrayList();
   
    @FindBy(css ="li[class='expanded active dropdown'] a[href='/']")
    WebElementFacade seleniumDropdown1;	    
    
    @FindBy(css ="[class='active-trail dropdown-toggle'] .caret")
    WebElementFacade seleniumDropdown2;	   
    
    @FindBy(css ="li[class='expanded active dropdown open'] li[class='first leaf']")
    WebElementFacade dropdown1;
    
    @FindBy(css ="li[class='expanded active-trail active dropdown open'] ul.dropdown-menu a[href='/python']")
    WebElementFacade dropdown2;
    
    @FindBy(css ="li.leaf [href='/testng-tutorials']")
    WebElementFacade testNGTab;
    
    @FindBy(css =".leaf [href='/maven-tutorials']")
    WebElementFacade mavenTab;
    
    @FindBy(css =".leaf [href='/jenkins-tutorials']")
    WebElementFacade jenkinsTab;
    
    @FindBy(css =".leaf [href='/protractor-angularjs-tutorials']")
    WebElementFacade protractorTab;
    
    @FindBy(css =".leaf [href='/appium-tutorials']")
    WebElementFacade appiumTab;
    
    @FindBy(css =".leaf [href='http://seleniumeasy.com/apachepoi-tutorials']")
    WebElementFacade apachePoiTab;
    
    @FindBy(css =".leaf [href='/katalon-studio']")
    WebElementFacade katalonTab;
    
    @FindBy(css =".leaf [href='/log4j-tutorials']")
    WebElementFacade log4jTab;
    
    @FindBy(css ="li[class='last expanded dropdown'] .caret")
    WebElementFacade moreDropdown; 	    
    
    @FindBy(css ="li[class='last expanded active-trail active dropdown']")
    WebElementFacade moreDropdown2; 
   

    
    @FindBy(css ="li[class='last expanded dropdown open'] a[href='/jxl-tutorials']")
    WebElementFacade jxlTab;
    
    @FindBy(css ="li[class='last expanded active-trail active dropdown open'] a[href='/jmeter-tutorials']")
    WebElementFacade jMeterTab;
    
    @FindBy(css ="li[class='last expanded active-trail active dropdown open'] a[href='/ant-tutorials']")
    WebElementFacade antTab;
    
    @FindBy(css ="li[class='last expanded active-trail active dropdown open'] a[href='/junit-tutorials']")
    WebElementFacade jUnitTab;
    
    @FindBy(css ="li[class='last expanded active-trail active dropdown open'] a[href='/java-tutorials']")
    WebElementFacade javaTabb;
    
    @FindBy(css ="li[class='last expanded active-trail active dropdown open'] a[href='/manual-testing']")
    WebElementFacade manualTab;
    
    @FindBy(css ="li[class='last expanded active-trail active dropdown open'] a[href='http://seleniumeasy.com/fluentautomation-tutorials']")
    WebElementFacade fluentTab;
    
    public void clickOnSeleniumDropDown(){
    	
    	seleniumDropdown1.click();
    	waitABit(1000);
    	dropdown1.click();
    	waitABit(1000);
    	scroolDown();

    	seleniumDropdown2.click();
    	waitABit(1000);
    	dropdown2.click();
    	waitABit(1000);
    	scroolDown();
    	
    	testNGTab.click();
    	waitABit(1000);
    	scroolDown();
    	
    	mavenTab.click();
    	waitABit(1000);
    	scroolDown();
    	
    	jenkinsTab.click();
    	waitABit(1000);
    	scroolDown();
    	
    	protractorTab.click();
    	waitABit(1000);
    	scroolDown();
    	
    	appiumTab.click();
    	waitABit(1000);
    	scroolDown();
    	
    	apachePoiTab.click();
    	waitABit(1000);
    	scroolDown();
    	
    	katalonTab.click();
    	waitABit(1000);
    	scroolDown();
    	
    	log4jTab.click();
    	waitABit(1000);
    	scroolDown();
    }

    public void actionsInMoreTab() {
    	moreDropdown.click();
    	jxlTab.click();
    	waitABit(1000);
    	scroolDown();
    	
    	moreDropdown2.click();
    	jMeterTab.click();
    	waitABit(1000);
    	scroolDown();
    	
    	moreDropdown2.click();
    	antTab.click();
    	waitABit(1000);
    	scroolDown();
    	
    	moreDropdown2.click();
    	jUnitTab.click();
    	waitABit(1000);
    	scroolDown();
    	
    	moreDropdown2.click();
    	javaTabb.click();
    	waitABit(1000);
    	scroolDown();
    	
    	moreDropdown2.click();
    	manualTab.click();
    	waitABit(1000);
    	scroolDown();
    	
    	moreDropdown2.click();
    	fluentTab.click();
    	waitABit(1000);
    	scroolDown();
    }
    
    
    public void scroolDown(){
    	//to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,200)", "");
        waitABit(1000);
    }
    
    public void clickOnEachTitle(){
	
    }
    
    public void doClickForced(WebElementFacade element) {
   	 Actions actions = new Actions(getDriver());
   	 actions.moveToElement(element);
   	 actions.click();
   	 actions.build().perform();
    }

}
