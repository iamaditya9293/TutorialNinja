package stepDefinition;


import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class Search {

	@BeforeStep("@search")
	public void beforeEveryStep() {
		System.out.println("Before_Every_Step");
	}

	@AfterStep("@search")
	public void afterEveryStep() {
		System.out.println("After_Every_Step");
	}

	/*
	 * @Before("@register") public void setUp() {
	 * System.out.println("Open the browser"); }
	 * 
	 * @After("@register") public void tearDown() {
	 * System.out.println("Close the browser"); }
	 */

	@Given("User opens the application")
	public void User_opens_the_application() {
		System.out.println(">>Opens the application");
	}

	@When("User enters valid product name into the search")
	public void User_enters_valid_product_name_into_the_search() {
		System.out.println(">>Enter valid product");
	}

	@When("User enters invalid product name into the search")
	public void User_enters_invalid_product_name_into_the_search() {
		System.out.println(">>Enter Invalid product");
	}

	@When("User enters nothing into the search")
	public void User_enters_nothing_into_the_search() {
		System.out.println(">>Enter nothing in the product search");
	}

	@When("User clicks on search button")
	public void User_clicks_on_search_button() {
		System.out.println(">>User clicks on search button");
	}

	@Then("Validation should be thrown by the system stating that no search results")
	public void validation() {
		System.out.println(">>No search results");

	}

	@Then("Valid product should be displayed")
	public void valid() {
		System.out.println(">>Valid Product");
	}

}
