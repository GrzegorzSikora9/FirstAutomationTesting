package pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Button_click_Page extends BasePage {
	
public Button_click_Page() throws IOException {
		super();
		}


	public @FindBy(xpath = "//a[@id='button-clicks']//div[@class='thumbnail']") WebElement ClickButton; 
	public @FindBy(xpath = "//span[@id='button1']") WebElement WebElementButton; 
	public @FindBy(xpath = "//div//button[@class='btn btn-default'][contains(text(),'Close')]") WebElement CloseAllertButton; 
	public @FindBy(css = "#button2") WebElement JavaScriptButton; 
	public @FindBy(xpath = "//span[@id='button3']") WebElement ActionMoveButton; 


// BACKGROUND // 
	
public Button_click_Page userNavigateToWebsite() throws Exception {
	driver.get("http://www.webdriveruniversity.com/");
	return new Button_click_Page();
}


public Button_click_Page UserscrolldownAndClickButton() throws Exception {
	 scrollToElementByWebElementLocator(ClickButton);
	 waitAndClickElement(ClickButton);
	 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	 driver.switchTo().window(tabs2.get(1));
	 return new Button_click_Page();
}


	//Scenario 1 

public Button_click_Page user_click_on_WebElementClick() throws Exception {
	waitAndClickElement(WebElementButton);
	return new Button_click_Page();
}


public Button_click_Page AlertWindowShowUp() throws Exception {
	WaitUntilWebElementIsVisible(CloseAllertButton);
	return new Button_click_Page();
}


public Button_click_Page clickCloseButton() throws Exception {
	waitAndClickElement(CloseAllertButton);
	return new Button_click_Page();
}




	//Scenario 2

public Button_click_Page click_on_JavaScriptClick() throws Exception {
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", JavaScriptButton);
	
	return new Button_click_Page();
    
}


public Button_click_Page alertJavaScriptwindow() throws Exception {
	//WaitUntilWebElementIsVisible(CloseAllertButton);
	return new Button_click_Page();
   
}


public Button_click_Page click_JavaScript_Close_button() throws Exception {
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", CloseAllertButton);
	return new Button_click_Page();  
}

//Scenario 3 

public Button_click_Page click_on_ActionMove() throws Exception {
	waitAndClickElement(WebElementButton);
	return new Button_click_Page(); 
    
}


public Button_click_Page alert_ActionMove_is_appering() throws Exception {
    WaitUntilWebElementIsVisible(CloseAllertButton);
	return new Button_click_Page(); 
}


public Button_click_Page click_on_the_ActionMove_Close_button() throws Exception {
    waitAndClickElement(CloseAllertButton);
    return new Button_click_Page(); 
}

}
