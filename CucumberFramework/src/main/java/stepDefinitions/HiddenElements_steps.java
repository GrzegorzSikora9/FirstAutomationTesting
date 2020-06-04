package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class HiddenElements_steps extends DriverFactory {
	
	//Background
	@Given("^User navigat to URL$")
	public void user_navigat_to_URL() throws Exception { 
	    hiddenelementsPage.user_navigat_to_URL();
	}

	@When("^User scroll down page and click hidden elements$")
	public void user_scroll_down_page_and_click_hidden_elements() throws Exception {
	    hiddenelementsPage.user_scroll_down_page_and_click_hidden_elements();
	}
	
	//Button number 1 
	@When("^user click in button number one$")
	public void user_click_in_button_number_one() throws Exception {
		hiddenelementsPage.user_click_in_button_number_one();
	}

	@Then("^Alert should show up$")
	public void alert_should_show_up() throws Exception {
		hiddenelementsPage.alert_should_show_up();
	}
	
	//Button number 2
	@When("^User click in button number two$")
	public void user_click_in_button_number_two() throws Exception {
		hiddenelementsPage.user_click_in_button_number_two();
	}

	@Then("^alert number two should show up$")
	public void alert_number_two_should_show_up() throws Exception {
		hiddenelementsPage.alert_number_two_should_show_up();
	}
	//Button nr 3
	@When("^user click in button number three$")
	public void user_click_in_button_number_three() throws Exception {
		hiddenelementsPage.user_click_in_button_number_three();
	}

	@Then("^alert number three should show up$")
	public void alert_number_three_should_show_up() throws Exception {
		hiddenelementsPage.alert_number_three_should_show_up();
	}

}
