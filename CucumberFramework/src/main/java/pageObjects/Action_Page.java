package pageObjects;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.AssertJUnit;


public class Action_Page extends BasePage {
	
	public Action_Page() throws IOException {
		super();
		}
	@FindBy(xpath = "//div[@id='draggable']") WebElement dragableElement; 
	@FindBy(xpath = "//div[@id='droppable']") WebElement dropableElement; 
	@FindBy(xpath = "//div[@id='droppable']//b[contains(text(),'Dropped!')]") WebElement droppedText; 
	@FindBy(xpath = "//div[@id='double-click']") WebElement doubleClickButton;
	@FindBy(xpath = "//div[@id='double-click'][@class='div-double-click double']") WebElement doubleClick; 
	@FindBy(xpath = "//div[@id='click-box']") WebElement clickBox; 
	Actions act = new Actions(driver);
	
	//Background
	
	public Action_Page user_navigate_to_website_webuniversity() throws Exception {
	    driver.get("http://www.webdriveruniversity.com/Actions/index.html#");
		return new Action_Page();
	}
	//Scenario 1 
	
	public Action_Page user_drag_file_to_dropplace_and_drop() throws Exception {
	    act.dragAndDrop(dragableElement, dropableElement).build().perform(); 
	    return new Action_Page();
	}
	
	public Action_Page color_and_text_should_change() throws Exception { 
		if(droppedText.isDisplayed()) {
	    	System.out.println("Element was draged");
	    } else 	{AssertJUnit.fail("Element was NOT dragged"); }
	    
		return new Action_Page();
	}
	
	public Action_Page user_dooble_click_on_webelement() throws Exception {
		act.doubleClick(doubleClickButton).perform();
		return new Action_Page();
	}
	
	public Action_Page color_should_change() throws Exception {
		if(doubleClick.isDisplayed()) {
			System.out.println("double clicked");
	    } else {AssertJUnit.fail("Double click dosent work");}
		
		return new Action_Page();
	}
	
	//Scenario 2 
	public Action_Page user_navigate_to(String dropmenu) throws Exception {
		WebElement drop = driver.findElement(By.xpath(dropmenu));
		actionMoveAndClick(drop);
		return new Action_Page();
	}
	
	public Action_Page user_see_link_he_can_clik_in_it(String link) throws Exception {
	    waitAndClickElementsUsingByLocator(By.xpath(link));
		return new Action_Page();
	}
	
	public Action_Page the_aler_should_show_up() throws Exception {
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text\n" + alert.getText());
		alert.accept();
		
		act.clickAndHold(clickBox).build().perform();
		Thread.sleep(5000);
		act.release(clickBox).perform();
		Thread.sleep(3000);
		return new Action_Page();
	}



}
