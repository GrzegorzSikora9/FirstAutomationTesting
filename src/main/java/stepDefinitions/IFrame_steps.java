
		package stepDefinitions;

		import cucumber.api.java.en.And;
		import cucumber.api.java.en.Given;
		import cucumber.api.java.en.Then;
		import cucumber.api.java.en.When;
		import utils.DriverFactory;

		public class IFrame_steps extends DriverFactory {


		//Background
		@Given("^User navigate to University website$")
		public void user_navigate_to_University_website() throws Exception {
		iframepage.user_navigate_to_University_website();
		}

		@When("^User scoll down page to Iframe button$")
		public void user_scoll_down_page_to_Iframe_button() throws Exception {
		iframepage.user_scoll_down_page_to_Iframe_button();
		}

		@When("^User click on Iframe button, user should be navigate to shop website$")
		public void user_click_on_Iframe_button_user_should_be_navigate_to_shop_website() throws Exception {
		iframepage.user_click_on_Iframe_button_user_should_be_navigate_to_shop_website();
		}

		// Scenario 1 products
		@When("^User click on our product button$")
		public void user_click_on_our_product_button() throws Exception {
		iframepage.user_click_on_our_product_button();
		}

		@And ("^user click on product \"([^\"]*)\"$")
		public void user_click_on_product(String product) throws Exception {
		iframepage.user_click_on_product(product);
		}

		@Then("^User should get access to promocode \"([^\"]*)\"$")
		public void user_should_get_access_to_promocode(String promocode) throws Exception {
		iframepage.user_should_get_access_to_promocode(promocode);
		}

		// Scenario 2 Contact Us
		@When("^User click on Contact us tab$")
		public void user_click_on_Contact_us_tab() throws Exception {
		iframepage.user_click_on_Contact_us_tab();
		}

		@And("^User fill name \"([^\"]*)\"$")
		public void user_fill_name(String name) throws Exception {
		iframepage.user_fill_name(name);
		}

		@And("^User fill lastname \"([^\"]*)\"$")
		public void user_fill_lastname(String lastname) throws Exception {
		iframepage.user_fill_lastname(lastname);
		}

		@And("^User fill mail address \"([^\"]*)\"$")
		public void user_fill_mail_address(String mail) throws Exception {
		iframepage.user_fill_mail_address(mail);
		}

		@And("^User fill comment \"([^\"]*)\"$")
		public void user_fill_comment(String comment) throws Exception {
		iframepage.user_fill_comment(comment);
		}

		@Then("^message should be successfully sended$")
		public void message_should_be_successfully_sended() throws Exception {
		iframepage.message_should_be_successfully_sended();
		}

		}