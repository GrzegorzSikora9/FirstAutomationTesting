package pageObjects;


import java.io.IOException;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.AssertJUnit;


public class TodoList_Page extends BasePage {
	
	boolean isPresent;
	boolean isPresent2; 

	public TodoList_Page() throws IOException {
		super();
			}

	@FindBy(xpath = "//a[@id='to-do-list']//div[@class='section-title']") WebElement todolistButton;
	@FindBy(xpath = "//input[@placeholder='Add new todo']") WebElement addBox; 
	@FindBy(xpath = "//li[contains(text(),'Go to potion class')]//i[@class='fa fa-trash']") WebElement deletePottion;
	@FindBy(xpath = "//li[contains(text(),'Practice magic')]//span") WebElement deletePratice; 
	@FindBy(xpath = "//li[contains(text(),'Go to potion class')]") WebElement GoToPottionText; 
	@FindBy(xpath = "//li[contains(text(),'Practice magic')]") WebElement practiceMagicText;
	
	//Background
	public TodoList_Page user_navigate_to_website() throws Exception {
		driver.get("http://www.webdriveruniversity.com/");
		return new TodoList_Page();
	}

	
	public TodoList_Page user_click_on_ToDoList_button() throws Exception {
		waitAndClickElement(todolistButton);
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		 driver.switchTo().window(tabs2.get(1));
		 return new TodoList_Page();
	}

	//Scenario 1 
	public TodoList_Page userWritePositionAndClickEnter(String position) throws Exception {
		sendKeysToWebElement(addBox, position);
		addBox.sendKeys(Keys.ENTER);
		return new TodoList_Page();
	   
	}

	
	public TodoList_Page positionShouldBeAddedtoList(String add) throws Exception {
		driver.findElement(By.xpath(add)).isDisplayed();
		return new TodoList_Page();
	}
	
	// Scenario 2 
	
	public TodoList_Page userDeletePosition() throws Exception {
		actionMoveAndClick(GoToPottionText);
		actionMoveAndClick(deletePottion);
				
		actionMoveAndClick(practiceMagicText);
		actionMoveAndClick(deletePratice);
		Thread.sleep(2000);
		return new TodoList_Page();
		
		
	}	
	// Assertion	
	public TodoList_Page positionShoudlBeDeleted() throws Exception {
		if(driver.findElements(By.xpath("//li[contains(text(),'Practice magic')]")).size() != 0){
			AssertJUnit.fail("Element is still present");
			}else{
			System.out.println("Element is Absent");
			}
		
		if(driver.findElements(By.xpath("//li[contains(text(),'Go to potion class')]")).size() != 0){
			AssertJUnit.fail("Element is still present");
			}else{
			System.out.println("Element is Absent");
			}
		  	 
		  	 
		return new TodoList_Page();
	}


}


