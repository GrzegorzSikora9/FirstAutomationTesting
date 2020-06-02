package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;


public class DropdownMenu_Page extends BasePage{

	public DropdownMenu_Page() throws IOException {
		super();
			}
	
	@FindBy(xpath = "//h1[contains(text(),'DROPDOWN, CHECKBOXE(S) & RADIO BUTTON(S)')]") WebElement dropDownMenuButton;
	@FindBy(xpath = "//form[@id='radio-buttons']//input[1]") WebElement radioButtonGreen1;
	@FindBy(xpath = "//form[@id='radio-buttons']//input[2]") WebElement radioButtonBlue2;
	@FindBy(xpath = "//form[@id='radio-buttons']//input[3]") WebElement radioButtonYellow3; 
	@FindBy(xpath = "//form[@id='radio-buttons']//input[4]") WebElement radioButtonOrange4;
	@FindBy(xpath = "//form[@id='radio-buttons']//input[5]") WebElement radioButtonPurple5;
	@FindBy(xpath = "//label[contains(text(),'Option 1')]//input") WebElement checkboxButton1; 
	@FindBy(xpath = "//label[contains(text(),'Option 2')]//input") WebElement checkboxButton2; 
	@FindBy(xpath = "//label[contains(text(),'Option 3')]//input") WebElement checkboxButton3; 
	@FindBy(xpath = "//label[contains(text(),'Option 4')]//input") WebElement checkboxButton4; 
	@FindBy(xpath = "//form[@id='radio-buttons-selected-disabled']//input[2]") WebElement disabledButton; 
	@FindBy(xpath = "//select[@class='dropdown-menu-lists']//option[@disabled='disabled']") WebElement disabledButtonsinDropdownMenu; 
	@FindBy(xpath = "//form[@id='radio-buttons-selected-disabled']//input[1]") WebElement lettuceButton;
	//Background
			public DropdownMenu_Page user_navigate_to_website() throws Exception {
			driver.get("http://www.webdriveruniversity.com/");
			return new DropdownMenu_Page();
		    
		}

			public DropdownMenu_Page user_click_on_Dropdownmenu_on_mainPage() throws Exception {
			waitAndClickElement(dropDownMenuButton);
			switchToNewTab();
			Thread.sleep(2000);
			return new DropdownMenu_Page();
		}
		//Scenario 1 Dropdownmenu
		
		public DropdownMenu_Page user_select_favorite_language(String Language) throws Exception {
			Select dropLanguage = new Select(driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"))); 
			dropLanguage.selectByValue(Language);
			return new DropdownMenu_Page();
		}

		
		public DropdownMenu_Page user_select_favorite_IDE(String IDE) throws Exception {
			Select dropIDE = new Select(driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"))); 
			dropIDE.selectByValue(IDE);
			return new DropdownMenu_Page();
		}

		
		public DropdownMenu_Page user_select_favorite_Script(String Script) throws Exception {
			Select dropIDE = new Select(driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"))); 
			dropIDE.selectByValue(Script);
			return new DropdownMenu_Page();
		}
				
		public void options_should_be_successfully_saved() throws Exception {
		    System.out.println("1234"); // check if parameters are visible
		    
		}
		
		// Scenario 2 Checkbox and RadioButton
		
		public DropdownMenu_Page user_select_favorite_options() throws Exception {
		   waitAndClickElement(checkboxButton3);
		   waitAndClickElement(checkboxButton1);
		   if(checkboxButton1.isSelected()) {
			   System.out.println("button1 is selected");
		   }else {
			   AssertJUnit.fail("checkbox is NOT selected");
		   }
		   Thread.sleep(2000);
		   waitAndClickElement(checkboxButton2);
		   if(checkboxButton2.isSelected()) {
			   System.out.println("button2 is selected");
		   }else {
			   AssertJUnit.fail("checkbox is NOT selected");
		   }
		   return new DropdownMenu_Page();
		}

		
		public DropdownMenu_Page user_select_favorite_color() throws Exception {
		    //click 1 button and check
			waitAndClickElement(radioButtonGreen1);
		    if( radioButtonGreen1.isSelected()) {
				System.out.println("button is selected");
			} else {
				AssertJUnit.fail("button is not selected");
			}
			
			//click 2 button and check
			waitAndClickElement(radioButtonYellow3);
		    if( radioButtonYellow3.isSelected()) {
				System.out.println("button is selected");
			} else {
				AssertJUnit.fail("button is not selected");
			}
			return new DropdownMenu_Page();
		}

		
		public DropdownMenu_Page checkbox_and_RadioButton_options_should_save() throws Exception {
			if (radioButtonBlue2.isSelected() && radioButtonGreen1.isSelected() && radioButtonOrange4.isSelected() && radioButtonPurple5.isSelected()) {
				AssertJUnit.fail("More than one button selected");
			}
			return new DropdownMenu_Page();
		}
		
		//Scenario 3 Select from availeble menu 
		public DropdownMenu_Page user_want_to_select_avaible_product_from_menu() throws Exception {
			Select dropFruit = new Select(driver.findElement(By.xpath("//select[@id='fruit-selects']"))); 
			dropFruit.selectByValue("apple");
			
			if( disabledButtonsinDropdownMenu.isEnabled()) {
				AssertJUnit.fail("One of disabled button is enable");
			} else {
				System.out.println("All disabled buttons are disabled");
			}
			Thread.sleep(3000);
			
			if(isElementClickable(disabledButton)) {
				AssertJUnit.fail("Element is clickable");
			}else {
				System.out.println("Element is disabled");
			}
			return new DropdownMenu_Page(); 
		}

		
		public DropdownMenu_Page products_should_be_successfully_selected() throws Exception {
		   
			return new DropdownMenu_Page(); 
		}


	
}
