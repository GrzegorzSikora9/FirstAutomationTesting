
		package pageObjects;

		import java.io.IOException;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.support.FindBy;
		import org.testng.AssertJUnit;

		public class IFrame_Page extends BasePage {

		public IFrame_Page() throws IOException {
		super();
		}

		@FindBy(xpath = "//h1[contains(text(),'IFRAME')]") WebElement IFrameshopButton;
		@FindBy(xpath = "//a[contains(text(),'Our Products')]") WebElement ourProductsButton;
		@FindBy(xpath = "//iframe[@id='frame']") WebElement frame; 
		@FindBy(xpath = "//button[contains(text(),'Proceed')]") WebElement proccedButton;
		@FindBy(xpath = "//b[contains(text(),'NEWCUSTOMER773322')]") WebElement promo; 
		@FindBy(xpath = "//a[contains(text(),'Contact Us')]") WebElement contactUS;
		@FindBy(xpath = "//input[@name='first_name']") WebElement firstnameText;
		@FindBy(xpath = "//input[@placeholder='Last Name']") WebElement lastnameText;
		@FindBy(xpath = "//input[@name='email']") WebElement emailText;
		@FindBy(xpath = "//textarea[@name='message']") WebElement commentText;
		@FindBy(xpath = "//div[@id='form_buttons']//input[@type='submit']") WebElement submitButton;
		

		//Background
		public IFrame_Page user_navigate_to_University_website() throws Exception {
		driver.get("http://www.webdriveruniversity.com/index.html");
		return new IFrame_Page();
		}

		public IFrame_Page user_scoll_down_page_to_Iframe_button() throws Exception {
		scrollToElementByWebElementLocator(IFrameshopButton);
		Thread.sleep(3000);
		return new IFrame_Page();
		}

		public IFrame_Page user_click_on_Iframe_button_user_should_be_navigate_to_shop_website() throws Exception {
		waitAndClickElement(IFrameshopButton);
		switchToNewTab();
		return new IFrame_Page();
		}

		// Scenario 1 products
		public IFrame_Page user_click_on_our_product_button() throws Exception {
		driver.switchTo().frame(frame);
		waitAndClickElement(ourProductsButton);
		return new IFrame_Page();
		}

		public IFrame_Page user_click_on_product(String product) throws Exception {
		
		WebElement p = driver.findElement(By.xpath(product));
		waitAndClickElement(p);
		Thread.sleep(3000);
		return new IFrame_Page();
		}

		public IFrame_Page user_should_get_access_to_promocode(String promocode) throws Exception {
		if(promo.isDisplayed()) {
			System.out.println("Promocode is: "  + promo.getText());
		}else {AssertJUnit.fail("Promocode is not displayed");}
		Thread.sleep(2000);
		waitAndClickElement(proccedButton);
		return new IFrame_Page();
		}

		// Scenario 2 Contact Us
		public IFrame_Page user_click_on_Contact_us_tab() throws Exception {
		driver.switchTo().frame(frame);
		waitAndClickElement(contactUS);
		return new IFrame_Page();
		}

		public IFrame_Page user_fill_name(String name) throws Exception {
			sendKeysToWebElement(firstnameText, name);
			return new IFrame_Page();
		}

		public IFrame_Page user_fill_lastname(String lastname) throws Exception {
			sendKeysToWebElement(lastnameText, lastname);
			return new IFrame_Page();
		}

		public IFrame_Page user_fill_mail_address(String mail) throws Exception {
			sendKeysToWebElement(emailText, mail);
			return new IFrame_Page();
		}

		public IFrame_Page user_fill_comment(String comment) throws Exception {
			sendKeysToWebElement(commentText, comment);
			waitAndClickElement(submitButton);
			Thread.sleep(3000);
			return new IFrame_Page();
		}

		public IFrame_Page message_should_be_successfully_sended() throws Exception {
			// we can add assertion like in contact us Page 
		return new IFrame_Page();
		}

		}
