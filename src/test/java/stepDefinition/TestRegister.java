package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class TestRegister {
	
	@Before(order=0,value="search")
	public void stepOne() {
		System.out.println("++step1");
	}
	
	@Before(order=1,value="search")
	public void stepTwo() {
		System.out.println("++step2");
	}
	
	@Before(order=2)
	public void stepThree() {
		System.out.println("++step3");
	}
	
	@After(order=2)
	public void tearDown() {
		System.out.println("++TearDown001");
		
	}
	
	@After(order=1)
	public void tearDownTwo() {
		System.out.println("++TearDown002");
	}
	
	@After(order=0)
	public void tearDownThree() {
		System.out.println("++TearDown003");
	}
	
	@Given("^Navigate to the register page$")
	public void Navigate_to_the_register_page() {
		System.out.println(">>User got navigated to the register page");		
	}
	
	@When("Enter First name {string} in firstname field")
	public void Enter_First_name_in_firstname_field(String firstNameText) {
		System.out.println(">>User entered first name:"+firstNameText);
		
	}
	
	@When("Enter Last name {string} in lastname field")
	public void enter_last_name_in_lastname_field(String lastNameText) {
		System.out.println(">>User entered last name:"+lastNameText);
	}

	@When("Enter email {string} in email field")
	public void enter_email_in_email_field(String email) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(">>User entered email:"+email);
	}

	@When("Enter Telephone {string} in telephone field")
	public void enter_telephone_in_telephone_field(String telephone) {
	    System.out.println(">>User entered email:"+telephone);


	}

	@When("Enter Password {string} in password field")
	public void enter_password_in_password_field(String pwd) {
	    System.out.println(">>User entered email:"+pwd);

	}

	@When("Enter Password confirm {string} in password confirm field")
	public void enter_password_confirm_in_password_confirm_field(String confirmpwd) {
	    System.out.println(">>User entered email:"+confirmpwd);

	}

	@When("Hit continue button")
	public void hit_continue_button() {
	    System.out.println(">>User entered email");

	}

	@Then("Acount is created successfully")
	public void acount_is_created_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(">>User entered email");
	}

	@When("Select {string} for newsletter subscriber")
	public void select_for_newsletter_subscriber(String newsletter) {
	    System.out.println(">>User entered email:"+newsletter);


	}

	@When("Select privacy policy field")
	public void select_privacy_policy_field() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(">>User entered email");
	}

	@When("User dont enter details in  any fields")
	public void user_dont_enter_details_in_any_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(">>User entered email");
	}

	@Then("Validation thrown by the system")
	public void validation_thrown_by_the_system() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(">>User entered email");
	}

	@Then("Validation is thrown by the system as account is there for the user")
	public void validation_is_thrown_by_the_system_as_account_is_there_for_the_user() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(">>User entered email");
	}


}
