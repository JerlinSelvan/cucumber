package stepdef;

import java.util.List;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JerlinSample5 {
	@When("user searches for products")
	public void user_searches_for_products(io.cucumber.datatable.DataTable dataTable) {
		List<String> product= dataTable.asList();
		for(String productname:product)
		{
			System.out.println(productname);
		}

	}

	@When("verify products displayed")
	public void verify_products_displayed() {
		System.out.println("Product is displyed");
	   
	}

	@Then("Close application")
	public void close_application() {
		System.out.println("Application Closed");
	}


}
