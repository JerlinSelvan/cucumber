package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JerlinSample2 {
	@Given("open newtours app")
	public void open_newtours_app() {
	 System.out.println("newtours opened");
	}

	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
		System.out.println("Username "+string+ " and Password "+string2+ " is entered");
	   
	}

	@When("submit login form")
	public void submit_login_form() {
		System.out.println("Login form submitted");
	  
	}

	@Then("verify pass")
	public void verify_pass() {
		System.out.println("Login success");
	    
	}

	@Then("verify fail")
	public void verify_fail() {
		System.out.println("Login failed");
	  
	}

}
