package pageObjects;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Ajax_Loader_Page extends BasePage{
	
	public Ajax_Loader_Page() throws IOException {
		super();
		}

	@FindBy(xpath = "//p[contains(text(),'CLICK ME!')]") WebElement buttonClick;
	@FindBy(xpath = "//button[@class='btn btn-default']") WebElement allertButton; 
	
	public Ajax_Loader_Page user_navigate_to_website() throws Exception {
	    driver.get("http://www.webdriveruniversity.com/Ajax-Loader/index.html"); 
		return new Ajax_Loader_Page();
	}

	
	public Ajax_Loader_Page user_click_on_the_button() throws Exception {
	    WaitUntilWebElementIsVisible(buttonClick);
		buttonClick.click();
		return new Ajax_Loader_Page();
	}

	
	public Ajax_Loader_Page informaton_should_be_visible() throws Exception {
	     waitAndClickElement(allertButton);
	    
		return new Ajax_Loader_Page();
	}

}
