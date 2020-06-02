package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class Ajax_Loader_steps extends DriverFactory {
	
	@Given("^User navigate to website$")
	public void user_navigate_to_website() throws Throwable {
	    ajaxloaderPage.user_navigate_to_website(); 
	}

	@When("^User click on the button$")
	public void user_click_on_the_button() throws Throwable {
		ajaxloaderPage.user_click_on_the_button();
	}

	@Then("^Informaton should be visible$")
	public void informaton_should_be_visible() throws Throwable {
	   ajaxloaderPage.informaton_should_be_visible();
	}

}
