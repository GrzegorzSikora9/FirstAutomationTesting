package stepDefinitions;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class button_click_steps extends DriverFactory {
	
	//Background
	@Given("^User navigate to Websiteuniversity$")
	public void user_navigate_to_Websiteuniversity() throws Throwable {
	 buttonClickPage.userNavigateToWebsite();
	}

	@When("^User scroll down and click on the button clicks$")
	public void user_scroll_down_and_click_on_the_button_clicks() throws Throwable {
	 buttonClickPage.UserscrolldownAndClickButton();   
	}

	//Scenario 1 
	@When("^User click on WebElementClick$")
	public void user_click_on_WebElementClick() throws Throwable {
	 buttonClickPage.user_click_on_WebElementClick();    
	}

	@And("^Alert window is appering$")
	public void alert_window_is_appering() throws Throwable {
	buttonClickPage.AlertWindowShowUp(); 
	}

	@Then("^User click on the Close button$")
	public void user_click_on_the_Close_button() throws Throwable {
	buttonClickPage.clickCloseButton();
	}
	
	//Scenario 2 
	@When("^User click on JavaScriptClick$")
	public void user_click_on_JavaScriptClick() throws Throwable {
	buttonClickPage.click_on_JavaScriptClick();    
	}

	@And("^Alert JavaScript window is appering$")
	public void alert_JavaScript_window_is_appering() throws Throwable {
	buttonClickPage.alertJavaScriptwindow();   
	}

	@Then("^User click on the JavaScript Close button$")
	public void user_click_on_the_JavaScript_Close_button() throws Throwable {
	buttonClickPage.click_JavaScript_Close_button();   
	}
	
	//Scenario 3 
	@When("^User click on ActionMove&Click$")
	public void user_click_on_ActionMove_Click() throws Throwable {
	buttonClickPage.click_on_ActionMove();    
	}

	@And("^Alert ActionMove&Click window is appering$")
	public void alert_ActionMove_Click_window_is_appering() throws Throwable {
	buttonClickPage.alert_ActionMove_is_appering();   
	}

	@Then("^User click on the ActionMove Close button$")
	public void user_click_on_the_ActionMove_Close_button() throws Throwable {
	buttonClickPage.click_on_the_ActionMove_Close_button();    
	}
	
}
