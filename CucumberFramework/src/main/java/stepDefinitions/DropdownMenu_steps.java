package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class DropdownMenu_steps extends DriverFactory {
	//Background
	@Given("^User navigate to Webdriveruniversity website$")
	public void user_navigate_to_Webdriveruniversity_website() throws Exception {
	    dropdownmenuPage.user_navigate_to_website();
	}

	@When("^User click on Dropdownmenu on mainPage$")
	public void user_click_on_Dropdownmenu_on_mainPage() throws Exception {
	   dropdownmenuPage.user_click_on_Dropdownmenu_on_mainPage();
	}
	//Scenario 1 Dropdownmenu
	
	@And("^User select favorite \"([^\"]*)\" language$")
	public void user_select_favorite_language(String Language) throws Exception {
	  dropdownmenuPage.user_select_favorite_language(Language); 
	}

	@And("^User select favorite \"([^\"]*)\" IDE$")
	public void user_select_favorite_IDE(String IDE) throws Exception {
	   dropdownmenuPage.user_select_favorite_IDE(IDE); 
	}

	@And("^User select favorite \"([^\"]*)\" Script$")
	public void user_select_favorite_Script(String Script) throws Exception {
		dropdownmenuPage.user_select_favorite_Script(Script);
	}

	@Then("^Options should be successfully saved$")
	public void options_should_be_successfully_saved() throws Exception {
	   dropdownmenuPage.options_should_be_successfully_saved();
	    
	}
	// Scenario 2 Checkbox and RadioButton
	
	@And("^User select favorite options$")
	public void user_select_favorite_options() throws Exception {
	   dropdownmenuPage.user_select_favorite_options();
	}

	@And("^User select favorite color$")
	public void user_select_favorite_color() throws Exception {
	   dropdownmenuPage.user_select_favorite_color();
	}

	@Then("^Checkbox and RadioButton options should save$")
	public void checkbox_and_RadioButton_options_should_save() throws Exception {
		dropdownmenuPage.checkbox_and_RadioButton_options_should_save();
	}
	//Scenario 3 Select from avaible menu 
	
	@And("^User want to select avaible product from menu$")
	public void user_want_to_select_avaible_product_from_menu() throws Exception {
	   dropdownmenuPage.user_want_to_select_avaible_product_from_menu();
	}

	@Then("^Products should be successfully selected$")
	public void products_should_be_successfully_selected() throws Exception {
	   dropdownmenuPage.products_should_be_successfully_selected();
	}


}
