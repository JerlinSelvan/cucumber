package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JerlinSample1 {
	WebDriver driver;
	@Given("user opens login page in newtours application")
	public void user_opens_login_page_in_newtours_application() {
	   //System.out.println("User enter into loin page of newtour application");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		//driver.manage().window().maximize();
	
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
	}

	@When("user enter username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String string, String string2) {
		//System.out.println("Username and Password is entered");
		//WebElement uname=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"));
		//uname.sendKeys(string);
		//WebElement pass=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input"));
		//pass.sendKeys(string2);
		PageObject loginpage=PageFactory.initElements(driver, PageObject.class);
		loginpage.un.sendKeys(string);
		loginpage.pwd.sendKeys(string2);
	
	}

	@When("Click Submit button")
	public void click_Submit_button() {
		//System.out.println("Submit button is clicked");
		//WebElement sign=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input"));
		//sign.click();
		PageObject loginpage=PageFactory.initElements(driver, PageObject.class);
		loginpage.ok.click();
	}

	@Then("verify login success")
	public void verify_login_success() {
		System.out.println("Login result is verified");
	}



}
