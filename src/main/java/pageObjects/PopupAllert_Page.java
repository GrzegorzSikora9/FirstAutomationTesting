package pageObjects;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.AssertJUnit;



public class PopupAllert_Page extends BasePage {
	

	public PopupAllert_Page() throws IOException {
		super();
		}
	
	@FindBy(xpath = "//span[@id='button1']") WebElement button1;
	@FindBy(xpath = "//span[@id='button2']") WebElement button2;
	@FindBy(xpath = "//span[@id='button3']") WebElement button3;
	@FindBy(xpath = "//span[@id='button4']") WebElement button4;
	@FindBy(xpath = "//button[@class='btn btn-default'][contains(text(),'Close')]") WebElement closeButton;
	@FindBy(xpath = "//div[@id='loader']") WebElement ajaxLoader;
	@FindBy(xpath = "//span[@id='button1']//p[contains(text(),'CLICK ME!')]") WebElement clickmeButton;
	
	// Background
	
	public PopupAllert_Page user_navigate_to_Popup_alert_website() throws Exception {
	   driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
	   return new PopupAllert_Page();
	}
	//Scenario 1 
		
	public PopupAllert_Page user_click_on_the_first_Pop_up() throws Exception {
	    jsClick(button1);
	    Thread.sleep(3000);
		return new PopupAllert_Page();
	}

	
	public PopupAllert_Page alert_box_show_up() throws Exception {
		closeAlertPopupBox();
		return new PopupAllert_Page();
	}

	
	public PopupAllert_Page user_click_on_the_second_button() throws Exception {
	    waitAndClickElement(button2);
		return new PopupAllert_Page();
	}

	
	public PopupAllert_Page the_second_alert_box_should_show_up() throws Exception {
		waitAndClickElement(closeButton);
		return new PopupAllert_Page();
	}
	//Scenario 2 

	public PopupAllert_Page user_click_on_third_button() throws Exception {
		waitAndClickElement(button3);
		return new PopupAllert_Page();
	}


	public PopupAllert_Page third_allert_box_should_show_up() throws Exception {
		WaitUntilWebElementIsVisible(ajaxLoader);
		waitAndClickElement(clickmeButton);
		waitAndClickElement(closeButton);
		return new PopupAllert_Page();
	}

	
	public PopupAllert_Page user_click_on_fourth_button() throws Exception {
		driver.navigate().back();
		
		try {
		    waitAndclickElementUsingJS(button4);;
		} catch (UnhandledAlertException f) {
		    try {
		        Alert alert = driver.switchTo().alert();
		        String alertText = alert.getText();
		        System.out.println("Alert data: " + alertText);
		        alert.accept();
		    } catch (NoAlertPresentException e) {
		        e.printStackTrace();
		    }
		}
		return new PopupAllert_Page();
	}

	
	public PopupAllert_Page fourth_alert_box_should_appear() throws Exception {
		if(driver.findElements(By.xpath("//p[@id='confirm-alert-text'][contains(text(),'You pressed OK!' ) ]")).size() != 0){
			System.out.println("Element is Present");
			}else{
			AssertJUnit.fail("Confirmation text is NOT avaible");	
			System.out.println("Element is Absent");
			}		
		return new PopupAllert_Page();
	}


}
