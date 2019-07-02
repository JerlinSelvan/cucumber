package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class JerlinSample4 {
	@Given("Application displays welcome message")
	public void application_displays_welcome_message() {
	  System.out.println("WELCOME");
	}

	@When("user enter unmae and password")
	public void user_enter_unmae_and_password() {
		 System.out.println("Enter username and password");
	}

	@When("user searches for iphone")
	public void user_searches_for_iphone() {
		 System.out.println("Search for iphone");
	}

	@When("user add the searched product to cart")
	public void user_add_the_searched_product_to_cart() {
		 System.out.println("Product added to cart");
	}

	@When("user make payment process")
	public void user_make_payment_process() {
		 System.out.println("Payemnt is done");
	}

	@When("user perform logout process from the application")
	public void user_perform_logout_process_from_the_application() {
		 System.out.println("Logout success");
	}

}
