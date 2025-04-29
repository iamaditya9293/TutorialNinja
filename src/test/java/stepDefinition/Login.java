package stepDefinition;

import io.cucumber.java.en.*;

public class Login {

		
		@Given("User navigates to the login page")
		public void user_navigates_to_the_login_page() {
		    System.out.println(">>one");
		}

		@When("^Enter valid email address (.+)$")
		public void enter_valid_email_address(String email) {
			System.out.println(">>Two"+ email);
		}

		@When("^Enter Valid password (.+)$")
		public void enter_valid_password(String pwd) {
			System.out.println(">>Three"+ pwd);

		}

		@When("Hit login button")
		public void hit_login_button() {
			System.out.println(">>Four");

		}

		@Then("User logged on to the home page")
		public void user_logged_on_to_the_home_page() {
			System.out.println(">>Five");

		}

		@Then("User should be able to get a validation")
		public void user_should_be_able_to_get_a_validation() {
			System.out.println(">>Six");
	}

}
