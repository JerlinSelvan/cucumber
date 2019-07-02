package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class newtour {
	WebDriver driver;
	@Given("User open signup page")
	public void user_open_signup_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver =new ChromeDriver();
				driver.get("http://www.newtours.demoaut.com/");
				driver.manage().window().maximize();
				WebElement reg=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
	   
	}

	@When("user enters fname as {string}")
	public void user_enters_fname_as(String string) {
		//WebElement name=driver.findElement(By.xpath(
	}

	@When("user enters lname as {string}")
	public void user_enters_lname_as(String string) {
	   
	}

	@When("user enters phone as {string}")
	public void user_enters_phone_as(String string) {
	  
	}

	@When("user enters email as {string}")
	public void user_enters_email_as(String string) {
	   
	}

	@When("user enters address as {string}")
	public void user_enters_address_as(String string) {
	 
	}

	@When("user enters address{int} as {string}")
	public void user_enters_address_as(Integer int1, String string) {
	  
	}

	@When("user enters city as {string}")
	public void user_enters_city_as(String string) {
	 
	}

	@When("user enters state as {string}")
	public void user_enters_state_as(String string) {
	  
	}

	@When("user enters code as {string}")
	public void user_enters_code_as(String string) {
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String string) {
	
	}

	@When("user enters pword as {string}")
	public void user_enters_pword_as(String string) {

	}

	@When("user enetrs cpassword as {string}")
	public void user_enetrs_cpassword_as(String string) {

	}

	@Then("Click signup button")
	public void click_signup_button() {
	
	}

	@Then("Verify success message")
	public void verify_success_message() {
		
	}





}
