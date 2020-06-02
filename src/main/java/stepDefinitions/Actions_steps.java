package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class Actions_steps extends DriverFactory {
	//Background
	@Given("^User navigate to website webuniversity$")
	public void user_navigate_to_website_webuniversity() throws Throwable {
	    actionpage.user_navigate_to_website_webuniversity(); 
	}
	//Scenario 1 
	@When("^User drag file to dropplace and drop$")
	public void user_drag_file_to_dropplace_and_drop() throws Throwable {
		actionpage.user_drag_file_to_dropplace_and_drop();
	}

	@Then("^Color and text should change$")
	public void color_and_text_should_change() throws Throwable { 
		actionpage.color_and_text_should_change();
	}

	@When("^User dooble click on webelement$")
	public void user_dooble_click_on_webelement() throws Throwable {
	   actionpage.user_dooble_click_on_webelement();
	}

	@Then("^Color should change$")
	public void color_should_change() throws Throwable {
		actionpage.color_should_change();
	}
	
	//Scenario 2 
	@When("^User navigate to \"([^\"]*)\" dropdownmenu$")  
	public void user_navigate_to(String dropmenu) throws Throwable {
	    actionpage.user_navigate_to(dropmenu);
	}

	@When("^User see \"([^\"]*)\" link, he can clik in it$")
	public void user_see_link_he_can_clik_in_it(String link) throws Throwable {
	    actionpage.user_see_link_he_can_clik_in_it(link);
	}


	@Then("^The aler should show up$")
	public void the_aler_should_show_up() throws Throwable {
	    actionpage.the_aler_should_show_up();
	}


}
