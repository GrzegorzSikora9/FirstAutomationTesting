package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class AccordionItems_steps extends DriverFactory {
	
	@Given("^User navigate to Webuniversity website$")
	public void user_navigate_to_Webuniversity_website() throws Throwable {
	  acordionpage.user_navigate_to_website();
	}

	@When("^User click Accordion Text Affects$")
	public void user_click_Accordion_Text_Affects() throws Throwable {
		acordionpage.click_Accordion_Text();
	}

	@When("^User click on \"([^\"]*)\" tab$")
	public void user_click_on_tab(String tab) throws Throwable {
		acordionpage.user_click_on_tab(tab);
	}

	@Then("^Text \"([^\"]*)\" should be visible$")
	public void text_should_be_visible(String text1) throws Throwable {
		acordionpage.text_should_be_visible(text1); 
	}

	@When("^User click on open \"([^\"]*)\"$")
	public void user_click_on_open(String tab) throws Throwable {
		acordionpage.user_click_on_open(tab);
	}

	@Then("^Text \"([^\"]*)\" should be hidden$")
	public void text_should_be_hidden(String text2) throws Throwable {
		acordionpage.text_should_be_hidden(text2);
	}

}
