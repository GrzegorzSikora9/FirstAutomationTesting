package stepDefinitions;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class todoList_steps extends DriverFactory {
	//Background
	
	@Given("^User navigate to website webdriveruniversity$")
	public void user_navigate_to_website_webdriveruniversity() throws Throwable {
		todolist_page.user_navigate_to_website();
	}

	@When("^User click on ToDoList button$")
	public void user_click_on_ToDoList_button() throws Throwable {
		todolist_page.user_click_on_ToDoList_button();
	}
	
	//Scenario 1 
	@When("^User write some \"([^\"]*)\" position and click enter button on keyboard$")
	public void user_write_some_position_and_click_enter_button_on_keyboard(String position) throws Throwable {
		todolist_page.userWritePositionAndClickEnter(position);
	}

	@Then("^Position \"([^\"]*)\" should be added to list like a last one on list$")
	public void position_should_be_added_to_list_like_a_last_one_on_list(String add) throws Throwable {
		todolist_page.positionShouldBeAddedtoList(add);
	}
	
	//Scenario 2 
	@When("^User delete position from a list$")
	public void user_delete_position_from_a_list() throws Throwable {
		todolist_page.userDeletePosition();
	}

	@Then("^Position should be deleted$")
	public void position_should_be_deleted() throws Throwable {
		todolist_page.positionShoudlBeDeleted(); 
		
		
	}



}
