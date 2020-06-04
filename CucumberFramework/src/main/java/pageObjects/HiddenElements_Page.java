package pageObjects;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HiddenElements_Page extends BasePage {
	
	public HiddenElements_Page() throws IOException {
		super();
		}
	
	@FindBy(xpath = "//h1[contains(text(),'HIDDEN ELEMENTS')]") WebElement hiddenElementsButton;
	@FindBy(xpath = "//span[@id='button1']") WebElement button1; 
	@FindBy(xpath = "//span[@id='button2']") WebElement button2;
	@FindBy(xpath = "//span[@id='button3']") WebElement button3;
	@FindBy(xpath = "//button[contains(text(),'Close')]") WebElement closeButton;
	@FindBy(xpath = "//div[@class='modal-dialog modal-md']//button[@class='btn btn-default'][contains(text(),'Close')]") WebElement close2Button;
	@FindBy(xpath = "//div[@id='myModalMoveClick']//button[@class='btn btn-default'][contains(text(),'Close')]") WebElement closeButton3;
	//span[@id='button3']

		//Background
		
		public HiddenElements_Page user_navigat_to_URL() throws Exception { 
			driver.get("http://www.webdriveruniversity.com/index.html");
			return new HiddenElements_Page();
		}

		
		public HiddenElements_Page user_scroll_down_page_and_click_hidden_elements() throws Exception {
			scrollToElementByWebElementLocator(hiddenElementsButton);
			waitAndClickElement(hiddenElementsButton);
			switchToNewTab();
			return new HiddenElements_Page();
		}
		
		//Button number 1 
	
		public HiddenElements_Page user_click_in_button_number_one() throws Exception {
			jsClick(button1);
			waitAndClickElement(closeButton);
			
			return new HiddenElements_Page();
		}

	
		public HiddenElements_Page alert_should_show_up() throws Exception {

			jsClick(closeButton);
			return new HiddenElements_Page();
			}
		
		//Button number 2
		
		public HiddenElements_Page user_click_in_button_number_two() throws Exception {
			jsClick(button2);

			
			
			
			return new HiddenElements_Page();
		}

	
		public HiddenElements_Page alert_number_two_should_show_up() throws Exception {
			jsClick(close2Button);
			return new HiddenElements_Page();
		}
		//Button nr 3
			public HiddenElements_Page user_click_in_button_number_three() throws Exception {
			jsClick(button3);
			Thread.sleep(3000);
			jsClick(closeButton);
			
			return new HiddenElements_Page();
		}

		
		public HiddenElements_Page alert_number_three_should_show_up() throws Exception {
		    waitAndClickElement(closeButton3);
			return new HiddenElements_Page();
		}

}
