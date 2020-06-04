package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class AutocompleteFileDatepicker_steps extends DriverFactory {
	
	//Background
	@Given("^User navigate to main website$")
	public void user_navigate_to_main_website() throws Exception {
		autocompeletePage.user_navigate_to_main_website();
	}
	//Scenario 1- Autocomplete
	@When("^User click on main page on Autocomplete text button$")
	public void user_click_on_main_page_on_Autocomplete_text_button() throws Exception {
		autocompeletePage.user_click_on_main_page_on_Autocomplete_text_button();
	}

	@And("^input some text in textfield$")
	public void input_some_text_in_textfield() throws Exception {
		autocompeletePage.input_some_text_in_textfield();
	}

	@And("^System give him autocomplete text$")
	public void system_give_him_autocomplete_text() throws Exception {
		autocompeletePage.system_give_him_autocomplete_text();
	}

	@Then("^User is able to send order$")
	public void user_is_able_to_send_order() throws Exception {
		autocompeletePage.user_is_able_to_send_order();
	}
	
	
	// Scenario 2 - fileUpload and send 
	@When("^User click on the FileUpload button on main page$")
	public void user_click_on_the_FileUpload_button_on_main_page() throws Exception {
		autocompeletePage.user_click_on_the_FileUpload_button_on_main_page();
	}

	@And("^User choose file to send$")
	public void user_choose_file_to_send() throws Exception {
	   autocompeletePage.user_choose_file_to_send();
	}

	@When("^User click on Send button$")
	public void user_click_on_Send_button() throws Exception {
	    autocompeletePage.user_click_on_Send_button();
	}

	@Then("^File should be successfully sended$")
	public void file_should_be_successfully_sended() throws Exception {
		autocompeletePage.file_should_be_successfully_sended();
	}
	
	
	//Scenario 3- datepicker
	@When("^user click on datepicker button on mainPage$")
	public void user_click_on_datepicker_button_on_mainPage() throws Exception {
		autocompeletePage.user_click_on_datepicker_button_on_mainPage();
	}

	@And("^User select date$")
	public void user_select_date() throws Exception {
		autocompeletePage.user_select_date();
	}

	@Then("^date should be successfully selected$")
	public void date_should_be_successfully_selected() throws Exception {
		autocompeletePage.date_should_be_successfully_selected();
	}


}
