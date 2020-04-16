package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.amazon.com/")
public class GooglePage extends PageObject {

    @FindBy(css = "#twotabsearchtextbox")
    WebElementFacade searchField;
    
    @FindBy(css = "[type=\"submit\"][value='Go']")
    WebElementFacade searchButton;
        
    @FindBy(css = "#a-page [id='p_89/Samsung'] [type='checkbox']")
    WebElementFacade samsungCheckBox;
    
    @FindBy(css = "a span[class=\"a-size-base a-color-base\"]")
    List<WebElementFacade> myListThatIncludesNew = new ArrayList();;
     
    @FindBy(css = "#n\\/2407749011")
    WebElementFacade unockedPhonesTab;

    @FindBy(css = "#low-price")
    WebElementFacade priceSelectorTabLowerValueTextField;

    @FindBy(css = "#high-price")
    WebElementFacade priceSelectorTabUpperValueTextField;
    
    @FindBy(css = "#a-autoid-1")
    WebElementFacade goButton;
    
    @FindBy(css = "li[aria-label=\"128 GB\"] i[class=\"a-icon a-icon-checkbox\"]")
    WebElementFacade gbMemoryThickBox;
    
    @FindBy(css = ".a-dropdown-container")
    WebElementFacade dropDownButton;
    
    @FindBy(css = "#s-result-sort-select_1")
    WebElementFacade priceLowerToHighest;
    
    @FindBy(css = ".sg-col-inner [class='a-section a-spacing-small a-spacing-top-small'] span[dir='auto']")
    List<WebElementFacade> listWithResults = new ArrayList();
    
    @FindBy(css ="li[aria-label='5.5 in & above'] i[class='a-icon a-icon-checkbox']")
    WebElementFacade screenSizeCheckBox;
    
    public void fillField(String parameter){
        searchField.click();
        typeInto(searchField, parameter);
    }
    
    public void fillField(String parameter, WebElementFacade field){
        field.click();
        typeInto(field, parameter);
    }
    
    public void clickSearch(){
    	searchButton.click();    	
    }
    
    public void clickSamsungCheckBox(){
    	doClickForced(samsungCheckBox);	
    	waitABit(2000);
    }
    
    public void clickOnNewCondition(){
    	for (WebElementFacade element : myListThatIncludesNew) {
    		if (element.getText().equals("New"))
    				element.click();
    		break;
    	}
    }
      
    public void clickOnUnlockedPhones(){
    	clickOn(unockedPhonesTab);
    }
    
    public void clickOnPriceSelectorTabLowerVal(){
    	fillField("300" ,priceSelectorTabLowerValueTextField);	
    }
    
    public void clickOnPriceSelectorTabUpperVal(){
    	fillField("900" ,priceSelectorTabUpperValueTextField);
    	goButton.click();    	
    }
    
    public void clickOn128GbMemoryBox(){
    	gbMemoryThickBox.click();	
    }
    
    public void clickInScreenSize(){
    	screenSizeCheckBox.click();	
    }
    
    public void clickOnDropDown(){
    	dropDownButton.click();	
    	priceLowerToHighest.click();    	
    }
    
    public void loopThroughTheList() {
    	byte position=0;
    	//System.out.println(listWithResults.size());
    	while (position<listWithResults.size()){
    		//System.out.println(listWithResults.get(position));
    		if (listWithResults.get(position).getText().contains("results"))
    			System.out.println("There are: "+listWithResults.get(position).getText() +" the item you searched " );
    		position++;
    	}
    }
    
    
    public void doClickForced(WebElementFacade element) {
   	 Actions actions = new Actions(getDriver());
   	 actions.moveToElement(element);
   	 actions.click();
   	 actions.build().perform();
    }

    
}
