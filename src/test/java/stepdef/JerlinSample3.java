package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JerlinSample3 {
	WebDriver driver;
	@Given("user open signup page")
	public void user_open_signup_page() {
	   //System.out.println("Open Signup page");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//driver =new ChromeDriver();
		//driver.get("http://www.newtours.demoaut.com/");
		//driver.manage().window().maximize();
		//WebDriver reg=driver.findElement(By.xapth(""))
	}

	@When("user enters firstname as {string}")
	public void user_enters_firstname_as(String fn) {
		System.out.println("Firstname "+fn );
	   
	}

	@When("user enters lastname as {string}")
	public void user_enters_lastname_as(String ln) {
		System.out.println("Firstname "+ln );
	}

	@When("user enters dob as {string}")
	public void user_enters_dob_as(String dob) {
		System.out.println("DOB "+dob );
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String pass) {
		System.out.println("Password "+pass );
	}

	@When("user enters confirm password as {string}")
	public void user_enters_confirm_password_as(String cpass) {
		System.out.println("Confirm Password  "+cpass );
	}

	@Then("click signup button")
	public void click_signup_button() {
		System.out.println("Click signup button" );
	    
	}

	@Then("Verify signup success message")
	public void verify_signup_success_message() {
		System.out.println("Signup success" );
	}


}
