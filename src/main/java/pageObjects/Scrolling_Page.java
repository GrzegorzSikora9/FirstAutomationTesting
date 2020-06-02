package pageObjects;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Scrolling_Page extends BasePage {
	
	public Scrolling_Page() throws IOException {
		super();
		}

	@FindBy(xpath = "//div[@id='zone1']") WebElement scrollmeFirstZone; 
	@FindBy(xpath = "//h1[@id='zone2-entries']") WebElement entryZone1; 
	@FindBy(xpath = "//h1[@id='zone3-entries']") WebElement entryZone2; 
	@FindBy(xpath = "//div[@id='zone4']") WebElement entryZone4; 
	
	public Scrolling_Page user_navigate_to_Just_scroll_around_website() throws Exception {
	    driver.get("http://www.webdriveruniversity.com/Scrolling/index.html");
		Thread.sleep(4000);
	    return new Scrolling_Page();
	
	}

	
	public Scrolling_Page user_scroll_to_fiel_text_me_first() throws Exception {
		//        js.executeScript("window.scrollBy(0,1000)");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", entryZone2);

	    Thread.sleep(3000);
		return new Scrolling_Page();
	}


	public Scrolling_Page text_should_change() throws Exception {
	    for(int i = 0 ; i < 100 ; i++) 
	    {
	    	actionMoveAndClick(entryZone2);
	    	actionMoveAndClick(entryZone1);
	    }
	    Thread.sleep(3000);
		
		return new Scrolling_Page();
	}


	public Scrolling_Page user_scroll_around_the_fields() throws Exception {
	    
		return new Scrolling_Page();
	}


	public Scrolling_Page numbers_on_fields_should_change() throws Exception {
	    
		return new Scrolling_Page();
	}

}
