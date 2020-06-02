package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class PopupAllert_steps extends  DriverFactory {
	
	
	// Background
	@Given("^User navigate to Popup alert website$")
	public void user_navigate_to_Popup_alert_website() throws Exception {
	   popupallertPage.user_navigate_to_Popup_alert_website();
	}
	//Scenario 1 
	@When("^User click on the first Pop up$")
	public void user_click_on_the_first_Pop_up() throws Exception {
		popupallertPage.user_click_on_the_first_Pop_up();
	}

	@Then("^Alert box show up$")
	public void alert_box_show_up() throws Exception {
		popupallertPage.alert_box_show_up();
	}

	@When("^User click on the second button$")
	public void user_click_on_the_second_button() throws Exception {
		popupallertPage.user_click_on_the_second_button();
	}

	@Then("^the second alert box should show up$")
	public void the_second_alert_box_should_show_up() throws Exception {
		popupallertPage.the_second_alert_box_should_show_up();
	}
	//Scenario 2 
	@When("^User click on third button$")
	public void user_click_on_third_button() throws Exception {
		popupallertPage.user_click_on_third_button();
	}

	@Then("^Third allert box should show up$")
	public void third_allert_box_should_show_up() throws Exception {
		popupallertPage.third_allert_box_should_show_up();
	}

	@When("^User click on fourth button$")
	public void user_click_on_fourth_button() throws Exception {
		popupallertPage.user_click_on_fourth_button();
	}

	@Then("^Fourth alert box should appear$")
	public void fourth_alert_box_should_appear() throws Exception {
		popupallertPage.fourth_alert_box_should_appear();
	}

}
