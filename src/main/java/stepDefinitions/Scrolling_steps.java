package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class Scrolling_steps extends DriverFactory {
	
	@Given("^User navigate to Just scroll around website$")
	public void user_navigate_to_Just_scroll_around_website() throws Throwable {
	    scrollingpage.user_navigate_to_Just_scroll_around_website();
	}

	@When("^User scroll to fiel text me first$")
	public void user_scroll_to_fiel_text_me_first() throws Throwable {
	    scrollingpage.user_scroll_to_fiel_text_me_first(); 
	}

	@Then("^Text should change$")
	public void text_should_change() throws Throwable {
	    scrollingpage.text_should_change();
	}

	@When("^user scroll around the fields$")
	public void user_scroll_around_the_fields() throws Throwable {
	    scrollingpage.user_scroll_around_the_fields();
	}

	@Then("^numbers on fields should change$")
	public void numbers_on_fields_should_change() throws Throwable {
	    scrollingpage.numbers_on_fields_should_change();
	}



}
