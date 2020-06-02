package pageObjects;

import org.testng.AssertJUnit;


import java.io.IOException;
import java.util.Calendar;
import java.util.List;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;





public class AutocompleteFileDatepicker_Page extends BasePage {
	
	
	
	public AutocompleteFileDatepicker_Page() throws IOException {
		super();
		}
		
		@FindBy(xpath = "//h1[contains(text(),'AUTOCOMPLETE TEXTFIELD')]") WebElement AutocompleteButton;
		@FindBy(xpath = "//a[@id='file-upload']//div[@class='section-title']") WebElement FileUploadButton;
		@FindBy(xpath = "//h1[contains(text(),'DATEPICKER')]") WebElement DatePickerButton;
		@FindBy(xpath = "//input[@id='myInput']") WebElement foodItemInput;
		@FindBy(xpath = "//input[@id='myFile']") WebElement selectFileButton;
		@FindBy(xpath = "//input[@id='submit-button']") WebElement sendFileButton;
		
		
		//////////////****************DatePickersButtons****************////////////////////
		//////////////****************DatePickersButtons****************////////////////////
		
		@FindBy(xpath = "//input[@class='form-control']") WebElement calendarButton;
		@FindBy(xpath = "//div[@class='datepicker-months']//th[@class='next'][contains(text(),'»')]") WebElement nextButton;
		@FindBy(xpath = "//div[@class='datepicker-months']//th[@class='prev'][contains(text(),'«')]") WebElement previousButton;
		@FindBy(xpath = "//th[@class='datepicker-switch']") WebElement centralButton;
		
		
		
		
		
		
		

	
		//Background
		public AutocompleteFileDatepicker_Page user_navigate_to_main_website() throws Exception {
			driver.get("http://www.webdriveruniversity.com/index.html");
			return new AutocompleteFileDatepicker_Page();
		}
		//Scenario 1- Autocomplete
		
		public AutocompleteFileDatepicker_Page user_click_on_main_page_on_Autocomplete_text_button() throws Exception {
			scrollToElementByWebElementLocator(AutocompleteButton);
			waitAndClickElement(AutocompleteButton);
			switchToNewTab();
			//DatePickerButton.getCssValue("color"); // just to try 
			return new AutocompleteFileDatepicker_Page();
		}

		
		public AutocompleteFileDatepicker_Page input_some_text_in_textfield() throws Exception {
			foodItemInput.sendKeys("a");
			Thread.sleep(3000);
			
			return new AutocompleteFileDatepicker_Page();
		}

		
		public AutocompleteFileDatepicker_Page system_give_him_autocomplete_text() throws Exception {
			List<WebElement> optionsToSelect = driver.findElements(By.xpath("//div[@id='myInputautocomplete-list']//div"));

			for(WebElement option : optionsToSelect){
			    System.out.println(option);
			    if(option.getText().equals("Apple")) {
			        System.out.println("Trying to select:  Apple");
			        option.click();
			        break;
			        
			    }
			}
			return new AutocompleteFileDatepicker_Page();
		}

		
		public AutocompleteFileDatepicker_Page  user_is_able_to_send_order() throws Exception {
			waitAndClickElement(sendFileButton);
			return new AutocompleteFileDatepicker_Page();
		}
		// Scenario 2 - fileUpload and send 
		
		public AutocompleteFileDatepicker_Page user_click_on_the_FileUpload_button_on_main_page() throws Exception {
			scrollToElementByWebElementLocator(FileUploadButton);
			waitAndClickElement(FileUploadButton);
			switchToNewTab();
			Thread.sleep(3000);
			return new AutocompleteFileDatepicker_Page();
		}

		
		public AutocompleteFileDatepicker_Page user_choose_file_to_send() throws Exception {
			selectFileButton.sendKeys("C:\\Users\\grzeg\\Desktop\\Testing automation\\course_road_map.pdf");
			Thread.sleep(3000);
			return new AutocompleteFileDatepicker_Page();
		}

		
		public AutocompleteFileDatepicker_Page user_click_on_Send_button() throws Exception {
			try {
			    waitAndclickElementUsingJS(sendFileButton);
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
			Thread.sleep(2000);
			return new AutocompleteFileDatepicker_Page();
		}

		
		public AutocompleteFileDatepicker_Page file_should_be_successfully_sended() throws Exception {
			String currentUrl =  driver.getCurrentUrl();
			String expectedUrl = "http://www.webdriveruniversity.com/File-Upload/index.html?filename=course_road_map.pdf";
			AssertJUnit.assertEquals(expectedUrl, currentUrl);			
			return new AutocompleteFileDatepicker_Page();
		}
		//Scenario 3- datepicker
		
		public AutocompleteFileDatepicker_Page user_click_on_datepicker_button_on_mainPage() throws Exception {
			scrollToElementByWebElementLocator(DatePickerButton);
			waitAndClickElement(DatePickerButton);
			switchToNewTab();
			return new AutocompleteFileDatepicker_Page();
		}

		///////////////******************DATE SELECT*******************/////////////////////////////
		///////////////******************DATE SELECT*******************/////////////////////////////
		///////////////******************DATE SELECT*******************/////////////////////////////
		public AutocompleteFileDatepicker_Page user_select_date() throws Exception {
			//DAte and Time to be set in textbox

			String dateTime = "23/4/2025";			
		
			//******			IF you want to select current date			************//
			
//			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//			Date date = new Date();
//			System.out.println(dateFormat.format(date));
		

			//button to open calendar

			waitAndClickElement(calendarButton);
			
			
			//Split the date time to get only the date part

			String date_dd_MM_yyyy[] = (dateTime.split(" ")[0]).split("/");

			//get the year difference between current year and year to set in calander

			int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2]) - Calendar.getInstance().get(Calendar.YEAR);

			waitAndClickElement(centralButton);
			

			if(yearDiff!=0){

				//if you have to move next year

				if(yearDiff>0){

					for(int i=0 ; i< yearDiff ; i++){

						System.out.println("Year Diff->"+i);

						nextButton.click();
						

					}

				}

				//if you have to move previous year

				else if(yearDiff<0){

					for(int i=0 ; i< (yearDiff*(-1)) ; i++){

						System.out.println("Year Diff->"+i);

						previousButton.click();
						

					}

				}

			}

			

			//Get all months from calendar to select correct one
			// SUPER IMPORTANT THING TO PICK A GOOD SELECTOR !!!!!!!!!!!!
			// SUPER IMPORTANT THING TO PICK A GOOD SELECTOR !!!!!!!!!!!!
			// SUPER IMPORTANT THING TO PICK A GOOD SELECTOR !!!!!!!!!!!!
			List<WebElement> list_AllMonthToBook = driver.findElements(By.xpath("//div[@class='datepicker-months']//span[@class='month']"));
			
			list_AllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1])-1).click();

			

			//get all dates from calendar to select correct one
			// SUPER IMPORTANT THING TO PICK A GOOD SELECTOR !!!!!!!!!!!!
			// SUPER IMPORTANT THING TO PICK A GOOD SELECTOR !!!!!!!!!!!!
			// SUPER IMPORTANT THING TO PICK A GOOD SELECTOR !!!!!!!!!!!!
			List<WebElement> list_AllDateToBook = driver.findElements(By.xpath("//div[@class='datepicker-days']//table[@class=' table-condensed']//td[@class='day']"));

			list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0])-1).click();
			
			
			return new AutocompleteFileDatepicker_Page();
		}

		
		public AutocompleteFileDatepicker_Page date_should_be_successfully_selected() throws Exception {
			
			return new AutocompleteFileDatepicker_Page();
		}


}
