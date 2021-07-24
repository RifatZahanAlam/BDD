package starter.stepdefinitions;

import WebPages.DemoPage;
import WebPages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Steps;
import starter.navigation.NavigateTo;
import starter.search.LookForInformation;

public class LoginToApplication {
	
	@Steps
	HomePage homePage;
	
	@Steps
	DemoPage demoPage;
	
	

	@Given("I am on the stealmy my login home page")
	public void i_am_on_the_stealmy_my_login_home_page() throws Exception{
		
		homePage.launchHomePage();
	   
	}
	
	@When("^I enter my username '(.*)'$")
	public void i_enter_my_login(String username) throws Exception {
		
		System.out.println("username: " + username);
		
		homePage.enterUsername(username);
	    
	}
	@And("^I enter my password '(.*)'$")
	public void i_enter_my_password(String password) throws Exception {
		
		System.out.println("password: " + password);
		homePage.enterPassword(password);
	}
	@Then("I click the login button")
	public void i_click_the_login_button() throws Exception {
	  
	}
	@Then("I am directed to a demo page")
	public void i_am_directed_to_a_demo_page() throws Exception {
	   
	}


}
